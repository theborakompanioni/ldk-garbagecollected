package org.ldk.structs;
import org.ldk.impl.bindings;
import java.util.Arrays;
import org.ldk.enums.*;

public class UtilMethods {
	/**
	 * Creates a digital signature of a message given a SecretKey, like the node's secret.
	 * A receiver knowing the PublicKey (e.g. the node's id) and the message can be sure that the signature was generated by the caller.
	 * Signatures are EC recoverable, meaning that given the message and the signature the PublicKey of the signer can be extracted.
	 */
	public static Result_StringErrorZ sign(byte[] msg, byte[] sk) {
		long ret = bindings.sign(msg, sk);
		Result_StringErrorZ ret_hu_conv = Result_StringErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Recovers the PublicKey of the signer of the message given the message and the signature.
	 */
	public static Result_PublicKeyErrorZ recover_pk(byte[] msg, String sig) {
		long ret = bindings.recover_pk(msg, sig);
		Result_PublicKeyErrorZ ret_hu_conv = Result_PublicKeyErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Verifies a message was signed by a PrivateKey that derives to a given PublicKey, given a message, a signature,
	 * and the PublicKey.
	 */
	public static boolean verify(byte[] msg, String sig, byte[] pk) {
		boolean ret = bindings.verify(msg, sig, pk);
		return ret;
	}

	/**
	 * Read a C2Tuple_BlockHashChannelMonitorZ from a byte array, created by C2Tuple_BlockHashChannelMonitorZ_write
	 */
	public static Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ BlockHashChannelMonitorZ_read(byte[] ser, KeysInterface arg) {
		long ret = bindings.C2Tuple_BlockHashChannelMonitorZ_read(ser, arg == null ? 0 : arg.ptr);
		Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ ret_hu_conv = Result_C2Tuple_BlockHashChannelMonitorZDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(arg);
		return ret_hu_conv;
	}

	/**
	 * Read a C2Tuple_BlockHashChannelManagerZ from a byte array, created by C2Tuple_BlockHashChannelManagerZ_write
	 */
	public static Result_C2Tuple_BlockHashChannelManagerZDecodeErrorZ BlockHashChannelManagerZ_read(byte[] ser, KeysInterface arg_keys_manager, FeeEstimator arg_fee_estimator, Watch arg_chain_monitor, BroadcasterInterface arg_tx_broadcaster, Logger arg_logger, UserConfig arg_default_config, ChannelMonitor[] arg_channel_monitors) {
		long ret = bindings.C2Tuple_BlockHashChannelManagerZ_read(ser, bindings.ChannelManagerReadArgs_new(arg_keys_manager == null ? 0 : arg_keys_manager.ptr, arg_fee_estimator == null ? 0 : arg_fee_estimator.ptr, arg_chain_monitor == null ? 0 : arg_chain_monitor.ptr, arg_tx_broadcaster == null ? 0 : arg_tx_broadcaster.ptr, arg_logger == null ? 0 : arg_logger.ptr, arg_default_config == null ? 0 : arg_default_config.ptr & ~1, Arrays.stream(arg_channel_monitors).mapToLong(arg_channel_monitors_conv_16 -> arg_channel_monitors_conv_16 == null ? 0 : arg_channel_monitors_conv_16.ptr & ~1).toArray()));
		Result_C2Tuple_BlockHashChannelManagerZDecodeErrorZ ret_hu_conv = Result_C2Tuple_BlockHashChannelManagerZDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(arg_keys_manager);
		ret_hu_conv.ptrs_to.add(arg_fee_estimator);
		ret_hu_conv.ptrs_to.add(arg_chain_monitor);
		ret_hu_conv.ptrs_to.add(arg_tx_broadcaster);
		ret_hu_conv.ptrs_to.add(arg_logger);
		ret_hu_conv.ptrs_to.add(arg_default_config);
		/* TODO 2 ChannelMonitor  */;
		return ret_hu_conv;
	}

	/**
	 * Build the commitment secret from the seed and the commitment number
	 */
	public static byte[] build_commitment_secret(byte[] commitment_seed, long idx) {
		byte[] ret = bindings.build_commitment_secret(commitment_seed, idx);
		return ret;
	}

	/**
	 * Derives a per-commitment-transaction private key (eg an htlc key or delayed_payment key)
	 * from the base secret and the per_commitment_point.
	 * 
	 * Note that this is infallible iff we trust that at least one of the two input keys are randomly
	 * generated (ie our own).
	 */
	public static Result_SecretKeyErrorZ derive_private_key(byte[] per_commitment_point, byte[] base_secret) {
		long ret = bindings.derive_private_key(per_commitment_point, base_secret);
		Result_SecretKeyErrorZ ret_hu_conv = Result_SecretKeyErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Derives a per-commitment-transaction public key (eg an htlc key or a delayed_payment key)
	 * from the base point and the per_commitment_key. This is the public equivalent of
	 * derive_private_key - using only public keys to derive a public key instead of private keys.
	 * 
	 * Note that this is infallible iff we trust that at least one of the two input keys are randomly
	 * generated (ie our own).
	 */
	public static Result_PublicKeyErrorZ derive_public_key(byte[] per_commitment_point, byte[] base_point) {
		long ret = bindings.derive_public_key(per_commitment_point, base_point);
		Result_PublicKeyErrorZ ret_hu_conv = Result_PublicKeyErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Derives a per-commitment-transaction revocation key from its constituent parts.
	 * 
	 * Only the cheating participant owns a valid witness to propagate a revoked
	 * commitment transaction, thus per_commitment_secret always come from cheater
	 * and revocation_base_secret always come from punisher, which is the broadcaster
	 * of the transaction spending with this key knowledge.
	 * 
	 * Note that this is infallible iff we trust that at least one of the two input keys are randomly
	 * generated (ie our own).
	 */
	public static Result_SecretKeyErrorZ derive_private_revocation_key(byte[] per_commitment_secret, byte[] countersignatory_revocation_base_secret) {
		long ret = bindings.derive_private_revocation_key(per_commitment_secret, countersignatory_revocation_base_secret);
		Result_SecretKeyErrorZ ret_hu_conv = Result_SecretKeyErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Derives a per-commitment-transaction revocation public key from its constituent parts. This is
	 * the public equivalend of derive_private_revocation_key - using only public keys to derive a
	 * public key instead of private keys.
	 * 
	 * Only the cheating participant owns a valid witness to propagate a revoked
	 * commitment transaction, thus per_commitment_point always come from cheater
	 * and revocation_base_point always come from punisher, which is the broadcaster
	 * of the transaction spending with this key knowledge.
	 * 
	 * Note that this is infallible iff we trust that at least one of the two input keys are randomly
	 * generated (ie our own).
	 */
	public static Result_PublicKeyErrorZ derive_public_revocation_key(byte[] per_commitment_point, byte[] countersignatory_revocation_base_point) {
		long ret = bindings.derive_public_revocation_key(per_commitment_point, countersignatory_revocation_base_point);
		Result_PublicKeyErrorZ ret_hu_conv = Result_PublicKeyErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * A script either spendable by the revocation
	 * key or the broadcaster_delayed_payment_key and satisfying the relative-locktime OP_CSV constrain.
	 * Encumbering a `to_holder` output on a commitment transaction or 2nd-stage HTLC transactions.
	 */
	public static byte[] get_revokeable_redeemscript(byte[] revocation_key, short contest_delay, byte[] broadcaster_delayed_payment_key) {
		byte[] ret = bindings.get_revokeable_redeemscript(revocation_key, contest_delay, broadcaster_delayed_payment_key);
		return ret;
	}

	/**
	 * Gets the witness redeemscript for an HTLC output in a commitment transaction. Note that htlc
	 * does not need to have its previous_output_index filled.
	 */
	public static byte[] get_htlc_redeemscript(HTLCOutputInCommitment htlc, TxCreationKeys keys) {
		byte[] ret = bindings.get_htlc_redeemscript(htlc == null ? 0 : htlc.ptr & ~1, keys == null ? 0 : keys.ptr & ~1);
		// this.ptrs_to.add(htlc);
		// this.ptrs_to.add(keys);
		return ret;
	}

	/**
	 * Gets the redeemscript for a funding output from the two funding public keys.
	 * Note that the order of funding public keys does not matter.
	 */
	public static byte[] make_funding_redeemscript(byte[] broadcaster, byte[] countersignatory) {
		byte[] ret = bindings.make_funding_redeemscript(broadcaster, countersignatory);
		return ret;
	}

	/**
	 * Builds an unsigned HTLC-Success or HTLC-Timeout transaction from the given channel and HTLC
	 * parameters. This is used by [`TrustedCommitmentTransaction::get_htlc_sigs`] to fetch the
	 * transaction which needs signing, and can be used to construct an HTLC transaction which is
	 * broadcastable given a counterparty HTLC signature.
	 * 
	 * Panics if htlc.transaction_output_index.is_none() (as such HTLCs do not appear in the
	 * commitment transaction).
	 */
	public static byte[] build_htlc_transaction(byte[] commitment_txid, int feerate_per_kw, short contest_delay, HTLCOutputInCommitment htlc, byte[] broadcaster_delayed_payment_key, byte[] revocation_key) {
		byte[] ret = bindings.build_htlc_transaction(commitment_txid, feerate_per_kw, contest_delay, htlc == null ? 0 : htlc.ptr & ~1, broadcaster_delayed_payment_key, revocation_key);
		// this.ptrs_to.add(htlc);
		return ret;
	}

	/**
	 * Commitment transaction numbers which appear in the transactions themselves are XOR'd with a
	 * shared secret first. This prevents on-chain observers from discovering how many commitment
	 * transactions occurred in a channel before it was closed.
	 * 
	 * This function gets the shared secret from relevant channel public keys and can be used to
	 * \"decrypt\" the commitment transaction number given a commitment transaction on-chain.
	 */
	public static long get_commitment_transaction_number_obscure_factor(byte[] broadcaster_payment_basepoint, byte[] countersignatory_payment_basepoint, boolean outbound_from_broadcaster) {
		long ret = bindings.get_commitment_transaction_number_obscure_factor(broadcaster_payment_basepoint, countersignatory_payment_basepoint, outbound_from_broadcaster);
		return ret;
	}

	/**
	 * Gets a route from us (payer) to the given target node (payee).
	 * 
	 * If the payee provided features in their invoice, they should be provided via payee_features.
	 * Without this, MPP will only be used if the payee's features are available in the network graph.
	 * 
	 * Private routing paths between a public node and the target may be included in `last_hops`.
	 * Currently, only the last hop in each path is considered.
	 * 
	 * If some channels aren't announced, it may be useful to fill in a first_hops with the
	 * results from a local ChannelManager::list_usable_channels() call. If it is filled in, our
	 * view of our local channels (from net_graph_msg_handler) will be ignored, and only those
	 * in first_hops will be used.
	 * 
	 * Panics if first_hops contains channels without short_channel_ids
	 * (ChannelManager::list_usable_channels will never include such channels).
	 * 
	 * The fees on channels from us to next-hops are ignored (as they are assumed to all be
	 * equal), however the enabled/disabled bit on such channels as well as the
	 * htlc_minimum_msat/htlc_maximum_msat *are* checked as they may change based on the receiving node.
	 */
	public static Result_RouteLightningErrorZ get_route(byte[] our_node_id, NetworkGraph network, byte[] payee, InvoiceFeatures payee_features, ChannelDetails[] first_hops, RouteHint[] last_hops, long final_value_msat, int final_cltv, Logger logger) {
		long ret = bindings.get_route(our_node_id, network == null ? 0 : network.ptr & ~1, payee, payee_features == null ? 0 : payee_features.ptr & ~1, Arrays.stream(first_hops).mapToLong(first_hops_conv_16 -> first_hops_conv_16 == null ? 0 : first_hops_conv_16.ptr & ~1).toArray(), Arrays.stream(last_hops).mapToLong(last_hops_conv_11 -> last_hops_conv_11 == null ? 0 : last_hops_conv_11.ptr & ~1).toArray(), final_value_msat, final_cltv, logger == null ? 0 : logger.ptr);
		Result_RouteLightningErrorZ ret_hu_conv = Result_RouteLightningErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(network);
		ret_hu_conv.ptrs_to.add(payee_features);
		/* TODO 2 ChannelDetails  */;
		/* TODO 2 RouteHint  */;
		ret_hu_conv.ptrs_to.add(logger);
		return ret_hu_conv;
	}

	/**
	 * Writes the provided `ChannelManager` to the path provided at `FilesystemPersister`
	 * initialization, within a file called \"manager\".
	 */
	public static Result_NoneErrorZ FilesystemPersister_persist_manager(String data_dir, ChannelManager manager) {
		long ret = bindings.FilesystemPersister_persist_manager(data_dir, manager == null ? 0 : manager.ptr & ~1);
		Result_NoneErrorZ ret_hu_conv = Result_NoneErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(manager);
		return ret_hu_conv;
	}

	/**
	 * Utility to construct an invoice. Generally, unless you want to do something like a custom
	 * cltv_expiry, this is what you should be using to create an invoice. The reason being, this
	 * method stores the invoice's payment secret and preimage in `ChannelManager`, so (a) the user
	 * doesn't have to store preimage/payment secret information and (b) `ChannelManager` can verify
	 * that the payment secret is valid when the invoice is paid.
	 */
	public static Result_InvoiceSignOrCreationErrorZ create_invoice_from_channelmanager(ChannelManager channelmanager, KeysInterface keys_manager, Currency network, Option_u64Z amt_msat, String description) {
		long ret = bindings.create_invoice_from_channelmanager(channelmanager == null ? 0 : channelmanager.ptr & ~1, keys_manager == null ? 0 : keys_manager.ptr, network, amt_msat.ptr, description);
		Result_InvoiceSignOrCreationErrorZ ret_hu_conv = Result_InvoiceSignOrCreationErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(channelmanager);
		ret_hu_conv.ptrs_to.add(keys_manager);
		return ret_hu_conv;
	}

}