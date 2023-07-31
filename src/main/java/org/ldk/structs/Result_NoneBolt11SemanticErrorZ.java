package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;

public class Result_NoneBolt11SemanticErrorZ extends CommonBase {
	private Result_NoneBolt11SemanticErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_NoneBolt11SemanticErrorZ_free(ptr); } super.finalize();
	}

	static Result_NoneBolt11SemanticErrorZ constr_from_ptr(long ptr) {
		if (bindings.CResult_NoneBolt11SemanticErrorZ_is_ok(ptr)) {
			return new Result_NoneBolt11SemanticErrorZ_OK(null, ptr);
		} else {
			return new Result_NoneBolt11SemanticErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_NoneBolt11SemanticErrorZ_OK extends Result_NoneBolt11SemanticErrorZ {
		private Result_NoneBolt11SemanticErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
		}
	}

	public static final class Result_NoneBolt11SemanticErrorZ_Err extends Result_NoneBolt11SemanticErrorZ {
		public final Bolt11SemanticError err;
		private Result_NoneBolt11SemanticErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			this.err = bindings.CResult_NoneBolt11SemanticErrorZ_get_err(ptr);
		}
	}

	/**
	 * Creates a new CResult_NoneBolt11SemanticErrorZ in the success state.
	 */
	public static Result_NoneBolt11SemanticErrorZ ok() {
		long ret = bindings.CResult_NoneBolt11SemanticErrorZ_ok();
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_NoneBolt11SemanticErrorZ ret_hu_conv = Result_NoneBolt11SemanticErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_NoneBolt11SemanticErrorZ in the error state.
	 */
	public static Result_NoneBolt11SemanticErrorZ err(org.ldk.enums.Bolt11SemanticError e) {
		long ret = bindings.CResult_NoneBolt11SemanticErrorZ_err(e);
		Reference.reachabilityFence(e);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_NoneBolt11SemanticErrorZ ret_hu_conv = Result_NoneBolt11SemanticErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Checks if the given object is currently in the success state
	 */
	public boolean is_ok() {
		boolean ret = bindings.CResult_NoneBolt11SemanticErrorZ_is_ok(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	long clone_ptr() {
		long ret = bindings.CResult_NoneBolt11SemanticErrorZ_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a new CResult_NoneBolt11SemanticErrorZ which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public Result_NoneBolt11SemanticErrorZ clone() {
		long ret = bindings.CResult_NoneBolt11SemanticErrorZ_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_NoneBolt11SemanticErrorZ ret_hu_conv = Result_NoneBolt11SemanticErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
