package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;


/**
 * Lightning TLV uses a custom variable-length integer called `BigSize`. It is similar to Bitcoin's
 * variable-length integers except that it is serialized in big-endian instead of little-endian.
 * 
 * Like Bitcoin's variable-length integer, it exhibits ambiguity in that certain values can be
 * encoded in several different ways, which we must check for at deserialization-time. Thus, if
 * you're looking for an example of a variable-length integer to use for your own project, move
 * along, this is a rather poor design.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class BigSize extends CommonBase {
	BigSize(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.BigSize_free(ptr); }
	}

	public long get_a() {
		long ret = bindings.BigSize_get_a(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	public void set_a(long val) {
		bindings.BigSize_set_a(this.ptr, val);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(val);
	}

	/**
	 * Constructs a new BigSize given each field
	 */
	public static BigSize of(long a_arg) {
		long ret = bindings.BigSize_new(a_arg);
		Reference.reachabilityFence(a_arg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.BigSize ret_hu_conv = null; if (ret < 0 || ret > 4096) { ret_hu_conv = new org.ldk.structs.BigSize(null, ret); }
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		return ret_hu_conv;
	}

	long clone_ptr() {
		long ret = bindings.BigSize_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a copy of the BigSize
	 */
	public BigSize clone() {
		long ret = bindings.BigSize_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.BigSize ret_hu_conv = null; if (ret < 0 || ret > 4096) { ret_hu_conv = new org.ldk.structs.BigSize(null, ret); }
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	/**
	 * Generates a non-cryptographic 64-bit hash of the BigSize.
	 */
	public long hash() {
		long ret = bindings.BigSize_hash(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	@Override public int hashCode() {
		return (int)this.hash();
	}
	/**
	 * Checks if two BigSizes contain equal inner contents.
	 * This ignores pointers and is_owned flags and looks at the values in fields.
	 * Two objects with NULL inner values will be considered "equal" here.
	 */
	public boolean eq(org.ldk.structs.BigSize b) {
		boolean ret = bindings.BigSize_eq(this.ptr, b == null ? 0 : b.ptr);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(b);
		if (this != null) { this.ptrs_to.add(b); };
		return ret;
	}

	@Override public boolean equals(Object o) {
		if (!(o instanceof BigSize)) return false;
		return this.eq((BigSize)o);
	}
	/**
	 * Serialize the BigSize object into a byte array which can be read by BigSize_read
	 */
	public byte[] write() {
		byte[] ret = bindings.BigSize_write(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Read a BigSize from a byte array, created by BigSize_write
	 */
	public static Result_BigSizeDecodeErrorZ read(byte[] ser) {
		long ret = bindings.BigSize_read(ser);
		Reference.reachabilityFence(ser);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_BigSizeDecodeErrorZ ret_hu_conv = Result_BigSizeDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
