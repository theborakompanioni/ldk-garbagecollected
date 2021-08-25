#/bin/sh
set -e
set -x

# zips are not generally deterministic without some tweaking, which we do here.

echo "Checking that required release native libraries are present..."
ls src/main/resources/liblightningjni_Linux-amd64.nativelib
ls src/main/resources/liblightningjni_MacOSX-x86_64.nativelib
ls src/main/resources/liblightningjni_MacOSX-aarch64.nativelib

export LANG=C

mvn clean
faketime 2021-01-01 mvn -DskipTests=true package

mkdir ziptmp
cd ziptmp
unzip ../target/ldk-java-*-sources.jar | grep inflating | awk '{ print $2 }' | sort > ../sources-zip-files.txt
sed -i 's/#Fri Jan 01 00:.* UTC 2021/#Fri Jan 01 00:00:00 UTC 2021/' META-INF/maven/org.lightningdevkit/ldk-java/pom.properties
touch -d "2021-01-01 00:00 UTC" $(cat ../sources-zip-files.txt)
cat ../sources-zip-files.txt | grep -v nativelib | zip -X@ ../ldk-java-sources.jar
rm ../target/ldk-java-*-sources.jar
cd ..
rm -r ziptmp

mkdir ziptmp
cd ziptmp
unzip ../target/ldk-java-*-javadoc.jar | grep inflating | awk '{ print $2 }' | sort > ../javadoc-zip-files.txt
find . | grep '.html$' | xargs -L1 sed -i 's/Generated by javadoc \(.*\) on Fri Jan 01 .* UTC 2021/Generated by javadoc \1 on Fri Jan 01 00:00:00 UTC 2021/g'
for ZIP in *.zip; do
	mkdir ziptmptmp
	cd ziptmptmp
	unzip ../$ZIP | grep inflating | awk '{ print $2 }' | sort > ../../javadoc-zip-zip-files.txt
	rm ../$ZIP
	touch -d "2021-01-01 00:00 UTC" $(cat ../../javadoc-zip-zip-files.txt)
	cat ../../javadoc-zip-zip-files.txt | zip -X@ ../$ZIP
	cd ..
	rm -r ziptmptmp
done
touch -d "2021-01-01 00:00 UTC" $(cat ../javadoc-zip-files.txt)
cat ../javadoc-zip-files.txt | grep -v nativelib | zip -X@ ../ldk-java-javadoc.jar
rm ../target/ldk-java-*-javadoc.jar
cd ..
rm -r ziptmp

mkdir ziptmp
cd ziptmp
unzip ../target/ldk-java-*.jar | grep inflating | awk '{ print $2 }' | sort > ../classes-zip-files.txt
sed -i 's/#Fri Jan 01 00:.* UTC 2021/#Fri Jan 01 00:00:00 UTC 2021/' META-INF/maven/org.lightningdevkit/ldk-java/pom.properties
sed -i 's/Built-By: .*/Built-By: ldk-deterministic-builds/' META-INF/MANIFEST.MF
touch -d "2021-01-01 00:00 UTC" $(cat ../classes-zip-files.txt)
cat ../classes-zip-files.txt | zip -X@ ../ldk-java.jar
cat ../classes-zip-files.txt | grep -v nativelib | zip -X@ ../ldk-java-classes.jar
cd ..
rm -r ziptmp
