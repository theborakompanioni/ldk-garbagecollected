package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;


/**
 * An enum which can either contain a crate::c_types::ThirtyTwoBytes or not
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class Option_TxidZ extends CommonBase {
	private Option_TxidZ(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.COption_TxidZ_free(ptr); }
	}
	static Option_TxidZ constr_from_ptr(long ptr) {
		bindings.LDKCOption_TxidZ raw_val = bindings.LDKCOption_TxidZ_ref_from_ptr(ptr);
		if (raw_val.getClass() == bindings.LDKCOption_TxidZ.Some.class) {
			return new Some(ptr, (bindings.LDKCOption_TxidZ.Some)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKCOption_TxidZ.None.class) {
			return new None(ptr, (bindings.LDKCOption_TxidZ.None)raw_val);
		}
		assert false; return null; // Unreachable without extending the (internal) bindings interface
	}

	/**
	 * When we're in this state, this COption_TxidZ contains a crate::c_types::ThirtyTwoBytes
	 */
	public final static class Some extends Option_TxidZ {
		public final byte[] some;
		private Some(long ptr, bindings.LDKCOption_TxidZ.Some obj) {
			super(null, ptr);
			this.some = obj.some;
		}
	}
	/**
	 * When we're in this state, this COption_TxidZ contains nothing
	 */
	public final static class None extends Option_TxidZ {
		private None(long ptr, bindings.LDKCOption_TxidZ.None obj) {
			super(null, ptr);
		}
	}
	/**
	 * Constructs a new COption_TxidZ containing a crate::c_types::ThirtyTwoBytes
	 */
	public static Option_TxidZ some(byte[] o) {
		long ret = bindings.COption_TxidZ_some(InternalUtils.check_arr_len(o, 32));
		Reference.reachabilityFence(o);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.Option_TxidZ ret_hu_conv = org.ldk.structs.Option_TxidZ.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		return ret_hu_conv;
	}

	/**
	 * Constructs a new COption_TxidZ containing nothing
	 */
	public static Option_TxidZ none() {
		long ret = bindings.COption_TxidZ_none();
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.Option_TxidZ ret_hu_conv = org.ldk.structs.Option_TxidZ.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		return ret_hu_conv;
	}

	long clone_ptr() {
		long ret = bindings.COption_TxidZ_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a new COption_TxidZ which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public Option_TxidZ clone() {
		long ret = bindings.COption_TxidZ_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.Option_TxidZ ret_hu_conv = org.ldk.structs.Option_TxidZ.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

}
