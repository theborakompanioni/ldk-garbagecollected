
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_InMemoryChannelKeysDecodeErrorZ extends CommonBase {
	private Result_InMemoryChannelKeysDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_InMemoryChannelKeysDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_InMemoryChannelKeysDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_InMemoryChannelKeysDecodeErrorZ_result_ok(ptr)) {
			return new Result_InMemoryChannelKeysDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_InMemoryChannelKeysDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_InMemoryChannelKeysDecodeErrorZ_OK extends Result_InMemoryChannelKeysDecodeErrorZ {
		public final InMemoryChannelKeys res;
		private Result_InMemoryChannelKeysDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			uint32_t res = bindings.LDKCResult_InMemoryChannelKeysDecodeErrorZ_get_ok(ptr);
			InMemoryChannelKeys res_hu_conv = new InMemoryChannelKeys(null, res);
			this.res = res_hu_conv;
		}
		public Result_InMemoryChannelKeysDecodeErrorZ_OK(InMemoryChannelKeys res) {
			this(null, bindings.CResult_InMemoryChannelKeysDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_InMemoryChannelKeysDecodeErrorZ_Err extends Result_InMemoryChannelKeysDecodeErrorZ {
		public final DecodeError err;
		private Result_InMemoryChannelKeysDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			uint32_t err = bindings.LDKCResult_InMemoryChannelKeysDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			this.err = err_hu_conv;
		}
		public Result_InMemoryChannelKeysDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_InMemoryChannelKeysDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
