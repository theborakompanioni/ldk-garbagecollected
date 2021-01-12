
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class GossipTimestampFilter extends CommonBase {
	GossipTimestampFilter(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.GossipTimestampFilter_free(ptr); }
	}

	public GossipTimestampFilter clone() {
		uint32_t ret = bindings.GossipTimestampFilter_clone(this.ptr);
		GossipTimestampFilter ret_hu_conv = new GossipTimestampFilter(null, ret);
		return ret_hu_conv;
	}

	public byte[] get_chain_hash() {
		byte[] ret = bindings.GossipTimestampFilter_get_chain_hash(this.ptr);
		return ret;
	}

	public void set_chain_hash(byte[] val) {
		bindings.GossipTimestampFilter_set_chain_hash(this.ptr, val);
	}

	public int get_first_timestamp() {
		int ret = bindings.GossipTimestampFilter_get_first_timestamp(this.ptr);
		return ret;
	}

	public void set_first_timestamp(int val) {
		bindings.GossipTimestampFilter_set_first_timestamp(this.ptr, val);
	}

	public int get_timestamp_range() {
		int ret = bindings.GossipTimestampFilter_get_timestamp_range(this.ptr);
		return ret;
	}

	public void set_timestamp_range(int val) {
		bindings.GossipTimestampFilter_set_timestamp_range(this.ptr, val);
	}

	public static GossipTimestampFilter constructor_new(byte[] chain_hash_arg, int first_timestamp_arg, int timestamp_range_arg) {
		uint32_t ret = bindings.GossipTimestampFilter_new(chain_hash_arg, first_timestamp_arg, timestamp_range_arg);
		GossipTimestampFilter ret_hu_conv = new GossipTimestampFilter(null, ret);
		return ret_hu_conv;
	}

	public static Result_GossipTimestampFilterDecodeErrorZ constructor_read(byte[] ser) {
		uint32_t ret = bindings.GossipTimestampFilter_read(ser);
		Result_GossipTimestampFilterDecodeErrorZ ret_hu_conv = Result_GossipTimestampFilterDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public byte[] write() {
		byte[] ret = bindings.GossipTimestampFilter_write(this.ptr);
		return ret;
	}

}
