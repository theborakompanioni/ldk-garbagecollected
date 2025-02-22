package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;


/**
 * An [`update_add_htlc`] message to be sent to or received from a peer.
 * 
 * [`update_add_htlc`]: https://github.com/lightning/bolts/blob/master/02-peer-protocol.md#adding-an-htlc-update_add_htlc
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class UpdateAddHTLC extends CommonBase {
	UpdateAddHTLC(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.UpdateAddHTLC_free(ptr); }
	}

	/**
	 * The channel ID
	 */
	public byte[] get_channel_id() {
		byte[] ret = bindings.UpdateAddHTLC_get_channel_id(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * The channel ID
	 */
	public void set_channel_id(byte[] val) {
		bindings.UpdateAddHTLC_set_channel_id(this.ptr, InternalUtils.check_arr_len(val, 32));
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(val);
	}

	/**
	 * The HTLC ID
	 */
	public long get_htlc_id() {
		long ret = bindings.UpdateAddHTLC_get_htlc_id(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * The HTLC ID
	 */
	public void set_htlc_id(long val) {
		bindings.UpdateAddHTLC_set_htlc_id(this.ptr, val);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(val);
	}

	/**
	 * The HTLC value in milli-satoshi
	 */
	public long get_amount_msat() {
		long ret = bindings.UpdateAddHTLC_get_amount_msat(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * The HTLC value in milli-satoshi
	 */
	public void set_amount_msat(long val) {
		bindings.UpdateAddHTLC_set_amount_msat(this.ptr, val);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(val);
	}

	/**
	 * The payment hash, the pre-image of which controls HTLC redemption
	 */
	public byte[] get_payment_hash() {
		byte[] ret = bindings.UpdateAddHTLC_get_payment_hash(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * The payment hash, the pre-image of which controls HTLC redemption
	 */
	public void set_payment_hash(byte[] val) {
		bindings.UpdateAddHTLC_set_payment_hash(this.ptr, InternalUtils.check_arr_len(val, 32));
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(val);
	}

	/**
	 * The expiry height of the HTLC
	 */
	public int get_cltv_expiry() {
		int ret = bindings.UpdateAddHTLC_get_cltv_expiry(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * The expiry height of the HTLC
	 */
	public void set_cltv_expiry(int val) {
		bindings.UpdateAddHTLC_set_cltv_expiry(this.ptr, val);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(val);
	}

	/**
	 * The extra fee skimmed by the sender of this message. See
	 * [`ChannelConfig::accept_underpaying_htlcs`].
	 * 
	 * [`ChannelConfig::accept_underpaying_htlcs`]: crate::util::config::ChannelConfig::accept_underpaying_htlcs
	 */
	public Option_u64Z get_skimmed_fee_msat() {
		long ret = bindings.UpdateAddHTLC_get_skimmed_fee_msat(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.Option_u64Z ret_hu_conv = org.ldk.structs.Option_u64Z.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	/**
	 * The extra fee skimmed by the sender of this message. See
	 * [`ChannelConfig::accept_underpaying_htlcs`].
	 * 
	 * [`ChannelConfig::accept_underpaying_htlcs`]: crate::util::config::ChannelConfig::accept_underpaying_htlcs
	 */
	public void set_skimmed_fee_msat(org.ldk.structs.Option_u64Z val) {
		bindings.UpdateAddHTLC_set_skimmed_fee_msat(this.ptr, val.ptr);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(val);
		if (this != null) { this.ptrs_to.add(val); };
	}

	long clone_ptr() {
		long ret = bindings.UpdateAddHTLC_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a copy of the UpdateAddHTLC
	 */
	public UpdateAddHTLC clone() {
		long ret = bindings.UpdateAddHTLC_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.UpdateAddHTLC ret_hu_conv = null; if (ret < 0 || ret > 4096) { ret_hu_conv = new org.ldk.structs.UpdateAddHTLC(null, ret); }
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	/**
	 * Checks if two UpdateAddHTLCs contain equal inner contents.
	 * This ignores pointers and is_owned flags and looks at the values in fields.
	 * Two objects with NULL inner values will be considered "equal" here.
	 */
	public boolean eq(org.ldk.structs.UpdateAddHTLC b) {
		boolean ret = bindings.UpdateAddHTLC_eq(this.ptr, b == null ? 0 : b.ptr);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(b);
		if (this != null) { this.ptrs_to.add(b); };
		return ret;
	}

	@Override public boolean equals(Object o) {
		if (!(o instanceof UpdateAddHTLC)) return false;
		return this.eq((UpdateAddHTLC)o);
	}
	/**
	 * Serialize the UpdateAddHTLC object into a byte array which can be read by UpdateAddHTLC_read
	 */
	public byte[] write() {
		byte[] ret = bindings.UpdateAddHTLC_write(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Read a UpdateAddHTLC from a byte array, created by UpdateAddHTLC_write
	 */
	public static Result_UpdateAddHTLCDecodeErrorZ read(byte[] ser) {
		long ret = bindings.UpdateAddHTLC_read(ser);
		Reference.reachabilityFence(ser);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_UpdateAddHTLCDecodeErrorZ ret_hu_conv = Result_UpdateAddHTLCDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
