package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;

/**
 * An alternative to [`CoinSelectionSource`] that can be implemented and used along [`Wallet`] to
 * provide a default implementation to [`CoinSelectionSource`].
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class WalletSource extends CommonBase {
	final bindings.LDKWalletSource bindings_instance;
	WalletSource(Object _dummy, long ptr) { super(ptr); bindings_instance = null; }
	private WalletSource(bindings.LDKWalletSource arg) {
		super(bindings.LDKWalletSource_new(arg));
		this.ptrs_to.add(arg);
		this.bindings_instance = arg;
	}
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.WalletSource_free(ptr); } super.finalize();
	}
	/**
	 * Destroys the object, freeing associated resources. After this call, any access
	 * to this object may result in a SEGFAULT or worse.
	 *
	 * You should generally NEVER call this method. You should let the garbage collector
	 * do this for you when it finalizes objects. However, it may be useful for types
	 * which represent locks and should be closed immediately to avoid holding locks
	 * until the GC runs.
	 */
	public void destroy() {
		if (ptr != 0) { bindings.WalletSource_free(ptr); }
		ptr = 0;
	}
	public static interface WalletSourceInterface {
		/**
		 * Returns all UTXOs, with at least 1 confirmation each, that are available to spend.
		 */
		Result_CVec_UtxoZNoneZ list_confirmed_utxos();
		/**
		 * Returns a script to use for change above dust resulting from a successful coin selection
		 * attempt.
		 */
		Result_ScriptNoneZ get_change_script();
		/**
		 * Signs and provides the full [`TxIn::script_sig`] and [`TxIn::witness`] for all inputs within
		 * the transaction known to the wallet (i.e., any provided via
		 * [`WalletSource::list_confirmed_utxos`]).
		 */
		Result_TransactionNoneZ sign_tx(byte[] tx);
	}
	private static class LDKWalletSourceHolder { WalletSource held; }
	public static WalletSource new_impl(WalletSourceInterface arg) {
		final LDKWalletSourceHolder impl_holder = new LDKWalletSourceHolder();
		impl_holder.held = new WalletSource(new bindings.LDKWalletSource() {
			@Override public long list_confirmed_utxos() {
				Result_CVec_UtxoZNoneZ ret = arg.list_confirmed_utxos();
				Reference.reachabilityFence(arg);
				long result = ret == null ? 0 : ret.clone_ptr();
				return result;
			}
			@Override public long get_change_script() {
				Result_ScriptNoneZ ret = arg.get_change_script();
				Reference.reachabilityFence(arg);
				long result = ret == null ? 0 : ret.clone_ptr();
				return result;
			}
			@Override public long sign_tx(byte[] tx) {
				Result_TransactionNoneZ ret = arg.sign_tx(tx);
				Reference.reachabilityFence(arg);
				long result = ret == null ? 0 : ret.clone_ptr();
				return result;
			}
		});
		return impl_holder.held;
	}
	/**
	 * Returns all UTXOs, with at least 1 confirmation each, that are available to spend.
	 */
	public Result_CVec_UtxoZNoneZ list_confirmed_utxos() {
		long ret = bindings.WalletSource_list_confirmed_utxos(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_CVec_UtxoZNoneZ ret_hu_conv = Result_CVec_UtxoZNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Returns a script to use for change above dust resulting from a successful coin selection
	 * attempt.
	 */
	public Result_ScriptNoneZ get_change_script() {
		long ret = bindings.WalletSource_get_change_script(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_ScriptNoneZ ret_hu_conv = Result_ScriptNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Signs and provides the full [`TxIn::script_sig`] and [`TxIn::witness`] for all inputs within
	 * the transaction known to the wallet (i.e., any provided via
	 * [`WalletSource::list_confirmed_utxos`]).
	 */
	public Result_TransactionNoneZ sign_tx(byte[] tx) {
		long ret = bindings.WalletSource_sign_tx(this.ptr, tx);
		Reference.reachabilityFence(this);
		Reference.reachabilityFence(tx);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_TransactionNoneZ ret_hu_conv = Result_TransactionNoneZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
