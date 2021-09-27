package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import javax.annotation.Nullable;


/**
 * A Tuple
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class TwoTuple_BlockHashChannelManagerZ extends CommonBase {
	TwoTuple_BlockHashChannelManagerZ(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.C2Tuple_BlockHashChannelManagerZ_free(ptr); }
	}

	/**
	 * 
	 */
	public byte[] get_a() {
		byte[] ret = bindings.C2Tuple_BlockHashChannelManagerZ_get_a(this.ptr);
		return ret;
	}

	/**
	 * 
	 */
	public ChannelManager get_b() {
		long ret = bindings.C2Tuple_BlockHashChannelManagerZ_get_b(this.ptr);
		if (ret < 1024) { return null; }
		ChannelManager ret_hu_conv = new ChannelManager(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Creates a new C2Tuple_BlockHashChannelManagerZ from the contained elements.
	 */
	public static TwoTuple_BlockHashChannelManagerZ of(byte[] a, FeeEstimator b_fee_est, Watch b_chain_monitor, BroadcasterInterface b_tx_broadcaster, Logger b_logger, KeysInterface b_keys_manager, UserConfig b_config, ChainParameters b_params) {
		long ret = bindings.C2Tuple_BlockHashChannelManagerZ_new(a, bindings.ChannelManager_new(b_fee_est == null ? 0 : b_fee_est.ptr, b_chain_monitor == null ? 0 : b_chain_monitor.ptr, b_tx_broadcaster == null ? 0 : b_tx_broadcaster.ptr, b_logger == null ? 0 : b_logger.ptr, b_keys_manager == null ? 0 : b_keys_manager.ptr, b_config == null ? 0 : b_config.ptr & ~1, b_params == null ? 0 : b_params.ptr & ~1));
		if (ret < 1024) { return null; }
		TwoTuple_BlockHashChannelManagerZ ret_hu_conv = new TwoTuple_BlockHashChannelManagerZ(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		ret_hu_conv.ptrs_to.add(b_fee_est);
		ret_hu_conv.ptrs_to.add(b_chain_monitor);
		ret_hu_conv.ptrs_to.add(b_tx_broadcaster);
		ret_hu_conv.ptrs_to.add(b_logger);
		ret_hu_conv.ptrs_to.add(b_keys_manager);
		ret_hu_conv.ptrs_to.add(b_config);
		ret_hu_conv.ptrs_to.add(b_params);
		return ret_hu_conv;
	}

}
