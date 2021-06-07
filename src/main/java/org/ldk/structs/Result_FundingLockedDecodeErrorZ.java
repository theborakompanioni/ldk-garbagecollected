package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

public class Result_FundingLockedDecodeErrorZ extends CommonBase {
	private Result_FundingLockedDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_FundingLockedDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_FundingLockedDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_FundingLockedDecodeErrorZ_result_ok(ptr)) {
			return new Result_FundingLockedDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_FundingLockedDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_FundingLockedDecodeErrorZ_OK extends Result_FundingLockedDecodeErrorZ {
		public final FundingLocked res;
		private Result_FundingLockedDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_FundingLockedDecodeErrorZ_get_ok(ptr);
			FundingLocked res_hu_conv = new FundingLocked(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
	}

	public static final class Result_FundingLockedDecodeErrorZ_Err extends Result_FundingLockedDecodeErrorZ {
		public final DecodeError err;
		private Result_FundingLockedDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_FundingLockedDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
	}

	/**
	 * Creates a new CResult_FundingLockedDecodeErrorZ in the success state.
	 */
	public static Result_FundingLockedDecodeErrorZ ok(FundingLocked o) {
		long ret = bindings.CResult_FundingLockedDecodeErrorZ_ok(o == null ? 0 : o.ptr & ~1);
		Result_FundingLockedDecodeErrorZ ret_hu_conv = Result_FundingLockedDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(o);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_FundingLockedDecodeErrorZ in the error state.
	 */
	public static Result_FundingLockedDecodeErrorZ err(DecodeError e) {
		long ret = bindings.CResult_FundingLockedDecodeErrorZ_err(e == null ? 0 : e.ptr & ~1);
		Result_FundingLockedDecodeErrorZ ret_hu_conv = Result_FundingLockedDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(e);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_FundingLockedDecodeErrorZ which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public Result_FundingLockedDecodeErrorZ clone() {
		long ret = bindings.CResult_FundingLockedDecodeErrorZ_clone(this.ptr);
		Result_FundingLockedDecodeErrorZ ret_hu_conv = Result_FundingLockedDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
