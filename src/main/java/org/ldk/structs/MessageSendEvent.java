package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;


/**
 * An event generated by ChannelManager which indicates a message should be sent to a peer (or
 * broadcast to most peers).
 * These events are handled by PeerManager::process_events if you are using a PeerManager.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class MessageSendEvent extends CommonBase {
	private MessageSendEvent(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.MessageSendEvent_free(ptr); }
	}
	static MessageSendEvent constr_from_ptr(long ptr) {
		bindings.LDKMessageSendEvent raw_val = bindings.LDKMessageSendEvent_ref_from_ptr(ptr);
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendAcceptChannel.class) {
			return new SendAcceptChannel(ptr, (bindings.LDKMessageSendEvent.SendAcceptChannel)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendOpenChannel.class) {
			return new SendOpenChannel(ptr, (bindings.LDKMessageSendEvent.SendOpenChannel)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendFundingCreated.class) {
			return new SendFundingCreated(ptr, (bindings.LDKMessageSendEvent.SendFundingCreated)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendFundingSigned.class) {
			return new SendFundingSigned(ptr, (bindings.LDKMessageSendEvent.SendFundingSigned)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendChannelReady.class) {
			return new SendChannelReady(ptr, (bindings.LDKMessageSendEvent.SendChannelReady)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendAnnouncementSignatures.class) {
			return new SendAnnouncementSignatures(ptr, (bindings.LDKMessageSendEvent.SendAnnouncementSignatures)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.UpdateHTLCs.class) {
			return new UpdateHTLCs(ptr, (bindings.LDKMessageSendEvent.UpdateHTLCs)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendRevokeAndACK.class) {
			return new SendRevokeAndACK(ptr, (bindings.LDKMessageSendEvent.SendRevokeAndACK)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendClosingSigned.class) {
			return new SendClosingSigned(ptr, (bindings.LDKMessageSendEvent.SendClosingSigned)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendShutdown.class) {
			return new SendShutdown(ptr, (bindings.LDKMessageSendEvent.SendShutdown)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendChannelReestablish.class) {
			return new SendChannelReestablish(ptr, (bindings.LDKMessageSendEvent.SendChannelReestablish)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendChannelAnnouncement.class) {
			return new SendChannelAnnouncement(ptr, (bindings.LDKMessageSendEvent.SendChannelAnnouncement)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.BroadcastChannelAnnouncement.class) {
			return new BroadcastChannelAnnouncement(ptr, (bindings.LDKMessageSendEvent.BroadcastChannelAnnouncement)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.BroadcastChannelUpdate.class) {
			return new BroadcastChannelUpdate(ptr, (bindings.LDKMessageSendEvent.BroadcastChannelUpdate)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendChannelUpdate.class) {
			return new SendChannelUpdate(ptr, (bindings.LDKMessageSendEvent.SendChannelUpdate)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.HandleError.class) {
			return new HandleError(ptr, (bindings.LDKMessageSendEvent.HandleError)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendChannelRangeQuery.class) {
			return new SendChannelRangeQuery(ptr, (bindings.LDKMessageSendEvent.SendChannelRangeQuery)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendShortIdsQuery.class) {
			return new SendShortIdsQuery(ptr, (bindings.LDKMessageSendEvent.SendShortIdsQuery)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendReplyChannelRange.class) {
			return new SendReplyChannelRange(ptr, (bindings.LDKMessageSendEvent.SendReplyChannelRange)raw_val);
		}
		if (raw_val.getClass() == bindings.LDKMessageSendEvent.SendGossipTimestampFilter.class) {
			return new SendGossipTimestampFilter(ptr, (bindings.LDKMessageSendEvent.SendGossipTimestampFilter)raw_val);
		}
		assert false; return null; // Unreachable without extending the (internal) bindings interface
	}

	/**
	 * Used to indicate that we've accepted a channel open and should send the accept_channel
	 * message provided to the given peer.
	 */
	public final static class SendAcceptChannel extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.AcceptChannel msg;
		private SendAcceptChannel(long ptr, bindings.LDKMessageSendEvent.SendAcceptChannel obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.AcceptChannel msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.AcceptChannel(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that we've initiated a channel open and should send the open_channel
	 * message provided to the given peer.
	 */
	public final static class SendOpenChannel extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.OpenChannel msg;
		private SendOpenChannel(long ptr, bindings.LDKMessageSendEvent.SendOpenChannel obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.OpenChannel msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.OpenChannel(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a funding_created message should be sent to the peer with the given node_id.
	 */
	public final static class SendFundingCreated extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.FundingCreated msg;
		private SendFundingCreated(long ptr, bindings.LDKMessageSendEvent.SendFundingCreated obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.FundingCreated msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.FundingCreated(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a funding_signed message should be sent to the peer with the given node_id.
	 */
	public final static class SendFundingSigned extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.FundingSigned msg;
		private SendFundingSigned(long ptr, bindings.LDKMessageSendEvent.SendFundingSigned obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.FundingSigned msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.FundingSigned(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a channel_ready message should be sent to the peer with the given node_id.
	 */
	public final static class SendChannelReady extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive these message(s)
		*/
		public final byte[] node_id;
		/**
		 * The channel_ready message which should be sent.
		*/
		public final org.ldk.structs.ChannelReady msg;
		private SendChannelReady(long ptr, bindings.LDKMessageSendEvent.SendChannelReady obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.ChannelReady msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ChannelReady(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that an announcement_signatures message should be sent to the peer with the given node_id.
	 */
	public final static class SendAnnouncementSignatures extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive these message(s)
		*/
		public final byte[] node_id;
		/**
		 * The announcement_signatures message which should be sent.
		*/
		public final org.ldk.structs.AnnouncementSignatures msg;
		private SendAnnouncementSignatures(long ptr, bindings.LDKMessageSendEvent.SendAnnouncementSignatures obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.AnnouncementSignatures msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.AnnouncementSignatures(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a series of HTLC update messages, as well as a commitment_signed
	 * message should be sent to the peer with the given node_id.
	 */
	public final static class UpdateHTLCs extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive these message(s)
		*/
		public final byte[] node_id;
		/**
		 * The update messages which should be sent. ALL messages in the struct should be sent!
		*/
		public final org.ldk.structs.CommitmentUpdate updates;
		private UpdateHTLCs(long ptr, bindings.LDKMessageSendEvent.UpdateHTLCs obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long updates = obj.updates;
			org.ldk.structs.CommitmentUpdate updates_hu_conv = null; if (updates < 0 || updates > 4096) { updates_hu_conv = new org.ldk.structs.CommitmentUpdate(null, updates); }
			if (updates_hu_conv != null) { updates_hu_conv.ptrs_to.add(this); };
			this.updates = updates_hu_conv;
		}
	}
	/**
	 * Used to indicate that a revoke_and_ack message should be sent to the peer with the given node_id.
	 */
	public final static class SendRevokeAndACK extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.RevokeAndACK msg;
		private SendRevokeAndACK(long ptr, bindings.LDKMessageSendEvent.SendRevokeAndACK obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.RevokeAndACK msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.RevokeAndACK(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a closing_signed message should be sent to the peer with the given node_id.
	 */
	public final static class SendClosingSigned extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.ClosingSigned msg;
		private SendClosingSigned(long ptr, bindings.LDKMessageSendEvent.SendClosingSigned obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.ClosingSigned msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ClosingSigned(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a shutdown message should be sent to the peer with the given node_id.
	 */
	public final static class SendShutdown extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.Shutdown msg;
		private SendShutdown(long ptr, bindings.LDKMessageSendEvent.SendShutdown obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.Shutdown msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.Shutdown(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a channel_reestablish message should be sent to the peer with the given node_id.
	 */
	public final static class SendChannelReestablish extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The message which should be sent.
		*/
		public final org.ldk.structs.ChannelReestablish msg;
		private SendChannelReestablish(long ptr, bindings.LDKMessageSendEvent.SendChannelReestablish obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.ChannelReestablish msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ChannelReestablish(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to send a channel_announcement and channel_update to a specific peer, likely on
	 * initial connection to ensure our peers know about our channels.
	 */
	public final static class SendChannelAnnouncement extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The channel_announcement which should be sent.
		*/
		public final org.ldk.structs.ChannelAnnouncement msg;
		/**
		 * The followup channel_update which should be sent.
		*/
		public final org.ldk.structs.ChannelUpdate update_msg;
		private SendChannelAnnouncement(long ptr, bindings.LDKMessageSendEvent.SendChannelAnnouncement obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.ChannelAnnouncement msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ChannelAnnouncement(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
			long update_msg = obj.update_msg;
			org.ldk.structs.ChannelUpdate update_msg_hu_conv = null; if (update_msg < 0 || update_msg > 4096) { update_msg_hu_conv = new org.ldk.structs.ChannelUpdate(null, update_msg); }
			if (update_msg_hu_conv != null) { update_msg_hu_conv.ptrs_to.add(this); };
			this.update_msg = update_msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a channel_announcement and channel_update should be broadcast to all
	 * peers (except the peer with node_id either msg.contents.node_id_1 or msg.contents.node_id_2).
	 * 
	 * Note that after doing so, you very likely (unless you did so very recently) want to
	 * broadcast a node_announcement (e.g. via [`PeerManager::broadcast_node_announcement`]). This
	 * ensures that any nodes which see our channel_announcement also have a relevant
	 * node_announcement, including relevant feature flags which may be important for routing
	 * through or to us.
	 * 
	 * [`PeerManager::broadcast_node_announcement`]: crate::ln::peer_handler::PeerManager::broadcast_node_announcement
	 */
	public final static class BroadcastChannelAnnouncement extends MessageSendEvent {
		/**
		 * The channel_announcement which should be sent.
		*/
		public final org.ldk.structs.ChannelAnnouncement msg;
		/**
		 * The followup channel_update which should be sent.
		*/
		public final org.ldk.structs.ChannelUpdate update_msg;
		private BroadcastChannelAnnouncement(long ptr, bindings.LDKMessageSendEvent.BroadcastChannelAnnouncement obj) {
			super(null, ptr);
			long msg = obj.msg;
			org.ldk.structs.ChannelAnnouncement msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ChannelAnnouncement(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
			long update_msg = obj.update_msg;
			org.ldk.structs.ChannelUpdate update_msg_hu_conv = null; if (update_msg < 0 || update_msg > 4096) { update_msg_hu_conv = new org.ldk.structs.ChannelUpdate(null, update_msg); }
			if (update_msg_hu_conv != null) { update_msg_hu_conv.ptrs_to.add(this); };
			this.update_msg = update_msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a channel_update should be broadcast to all peers.
	 */
	public final static class BroadcastChannelUpdate extends MessageSendEvent {
		/**
		 * The channel_update which should be sent.
		*/
		public final org.ldk.structs.ChannelUpdate msg;
		private BroadcastChannelUpdate(long ptr, bindings.LDKMessageSendEvent.BroadcastChannelUpdate obj) {
			super(null, ptr);
			long msg = obj.msg;
			org.ldk.structs.ChannelUpdate msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ChannelUpdate(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Used to indicate that a channel_update should be sent to a single peer.
	 * In contrast to [`Self::BroadcastChannelUpdate`], this is used when the channel is a
	 * private channel and we shouldn't be informing all of our peers of channel parameters.
	 */
	public final static class SendChannelUpdate extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The channel_update which should be sent.
		*/
		public final org.ldk.structs.ChannelUpdate msg;
		private SendChannelUpdate(long ptr, bindings.LDKMessageSendEvent.SendChannelUpdate obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.ChannelUpdate msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ChannelUpdate(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Broadcast an error downstream to be handled
	 */
	public final static class HandleError extends MessageSendEvent {
		/**
		 * The node_id of the node which should receive this message
		*/
		public final byte[] node_id;
		/**
		 * The action which should be taken.
		*/
		public final org.ldk.structs.ErrorAction action;
		private HandleError(long ptr, bindings.LDKMessageSendEvent.HandleError obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long action = obj.action;
			org.ldk.structs.ErrorAction action_hu_conv = org.ldk.structs.ErrorAction.constr_from_ptr(action);
			if (action_hu_conv != null) { action_hu_conv.ptrs_to.add(this); };
			this.action = action_hu_conv;
		}
	}
	/**
	 * Query a peer for channels with funding transaction UTXOs in a block range.
	 */
	public final static class SendChannelRangeQuery extends MessageSendEvent {
		/**
		 * The node_id of this message recipient
		*/
		public final byte[] node_id;
		/**
		 * The query_channel_range which should be sent.
		*/
		public final org.ldk.structs.QueryChannelRange msg;
		private SendChannelRangeQuery(long ptr, bindings.LDKMessageSendEvent.SendChannelRangeQuery obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.QueryChannelRange msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.QueryChannelRange(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Request routing gossip messages from a peer for a list of channels identified by
	 * their short_channel_ids.
	 */
	public final static class SendShortIdsQuery extends MessageSendEvent {
		/**
		 * The node_id of this message recipient
		*/
		public final byte[] node_id;
		/**
		 * The query_short_channel_ids which should be sent.
		*/
		public final org.ldk.structs.QueryShortChannelIds msg;
		private SendShortIdsQuery(long ptr, bindings.LDKMessageSendEvent.SendShortIdsQuery obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.QueryShortChannelIds msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.QueryShortChannelIds(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Sends a reply to a channel range query. This may be one of several SendReplyChannelRange events
	 * emitted during processing of the query.
	 */
	public final static class SendReplyChannelRange extends MessageSendEvent {
		/**
		 * The node_id of this message recipient
		*/
		public final byte[] node_id;
		/**
		 * The reply_channel_range which should be sent.
		*/
		public final org.ldk.structs.ReplyChannelRange msg;
		private SendReplyChannelRange(long ptr, bindings.LDKMessageSendEvent.SendReplyChannelRange obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.ReplyChannelRange msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.ReplyChannelRange(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	/**
	 * Sends a timestamp filter for inbound gossip. This should be sent on each new connection to
	 * enable receiving gossip messages from the peer.
	 */
	public final static class SendGossipTimestampFilter extends MessageSendEvent {
		/**
		 * The node_id of this message recipient
		*/
		public final byte[] node_id;
		/**
		 * The gossip_timestamp_filter which should be sent.
		*/
		public final org.ldk.structs.GossipTimestampFilter msg;
		private SendGossipTimestampFilter(long ptr, bindings.LDKMessageSendEvent.SendGossipTimestampFilter obj) {
			super(null, ptr);
			this.node_id = obj.node_id;
			long msg = obj.msg;
			org.ldk.structs.GossipTimestampFilter msg_hu_conv = null; if (msg < 0 || msg > 4096) { msg_hu_conv = new org.ldk.structs.GossipTimestampFilter(null, msg); }
			if (msg_hu_conv != null) { msg_hu_conv.ptrs_to.add(this); };
			this.msg = msg_hu_conv;
		}
	}
	long clone_ptr() {
		long ret = bindings.MessageSendEvent_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a copy of the MessageSendEvent
	 */
	public MessageSendEvent clone() {
		long ret = bindings.MessageSendEvent_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendAcceptChannel-variant MessageSendEvent
	 */
	public static MessageSendEvent send_accept_channel(byte[] node_id, org.ldk.structs.AcceptChannel msg) {
		long ret = bindings.MessageSendEvent_send_accept_channel(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendOpenChannel-variant MessageSendEvent
	 */
	public static MessageSendEvent send_open_channel(byte[] node_id, org.ldk.structs.OpenChannel msg) {
		long ret = bindings.MessageSendEvent_send_open_channel(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendFundingCreated-variant MessageSendEvent
	 */
	public static MessageSendEvent send_funding_created(byte[] node_id, org.ldk.structs.FundingCreated msg) {
		long ret = bindings.MessageSendEvent_send_funding_created(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendFundingSigned-variant MessageSendEvent
	 */
	public static MessageSendEvent send_funding_signed(byte[] node_id, org.ldk.structs.FundingSigned msg) {
		long ret = bindings.MessageSendEvent_send_funding_signed(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendChannelReady-variant MessageSendEvent
	 */
	public static MessageSendEvent send_channel_ready(byte[] node_id, org.ldk.structs.ChannelReady msg) {
		long ret = bindings.MessageSendEvent_send_channel_ready(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendAnnouncementSignatures-variant MessageSendEvent
	 */
	public static MessageSendEvent send_announcement_signatures(byte[] node_id, org.ldk.structs.AnnouncementSignatures msg) {
		long ret = bindings.MessageSendEvent_send_announcement_signatures(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new UpdateHTLCs-variant MessageSendEvent
	 */
	public static MessageSendEvent update_htlcs(byte[] node_id, org.ldk.structs.CommitmentUpdate updates) {
		long ret = bindings.MessageSendEvent_update_htlcs(InternalUtils.check_arr_len(node_id, 33), updates == null ? 0 : updates.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(updates);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(updates); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendRevokeAndACK-variant MessageSendEvent
	 */
	public static MessageSendEvent send_revoke_and_ack(byte[] node_id, org.ldk.structs.RevokeAndACK msg) {
		long ret = bindings.MessageSendEvent_send_revoke_and_ack(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendClosingSigned-variant MessageSendEvent
	 */
	public static MessageSendEvent send_closing_signed(byte[] node_id, org.ldk.structs.ClosingSigned msg) {
		long ret = bindings.MessageSendEvent_send_closing_signed(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendShutdown-variant MessageSendEvent
	 */
	public static MessageSendEvent send_shutdown(byte[] node_id, org.ldk.structs.Shutdown msg) {
		long ret = bindings.MessageSendEvent_send_shutdown(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendChannelReestablish-variant MessageSendEvent
	 */
	public static MessageSendEvent send_channel_reestablish(byte[] node_id, org.ldk.structs.ChannelReestablish msg) {
		long ret = bindings.MessageSendEvent_send_channel_reestablish(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendChannelAnnouncement-variant MessageSendEvent
	 */
	public static MessageSendEvent send_channel_announcement(byte[] node_id, org.ldk.structs.ChannelAnnouncement msg, org.ldk.structs.ChannelUpdate update_msg) {
		long ret = bindings.MessageSendEvent_send_channel_announcement(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr, update_msg == null ? 0 : update_msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		Reference.reachabilityFence(update_msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(update_msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new BroadcastChannelAnnouncement-variant MessageSendEvent
	 */
	public static MessageSendEvent broadcast_channel_announcement(org.ldk.structs.ChannelAnnouncement msg, org.ldk.structs.ChannelUpdate update_msg) {
		long ret = bindings.MessageSendEvent_broadcast_channel_announcement(msg == null ? 0 : msg.ptr, update_msg == null ? 0 : update_msg.ptr);
		Reference.reachabilityFence(msg);
		Reference.reachabilityFence(update_msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(update_msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new BroadcastChannelUpdate-variant MessageSendEvent
	 */
	public static MessageSendEvent broadcast_channel_update(org.ldk.structs.ChannelUpdate msg) {
		long ret = bindings.MessageSendEvent_broadcast_channel_update(msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendChannelUpdate-variant MessageSendEvent
	 */
	public static MessageSendEvent send_channel_update(byte[] node_id, org.ldk.structs.ChannelUpdate msg) {
		long ret = bindings.MessageSendEvent_send_channel_update(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new HandleError-variant MessageSendEvent
	 */
	public static MessageSendEvent handle_error(byte[] node_id, org.ldk.structs.ErrorAction action) {
		long ret = bindings.MessageSendEvent_handle_error(InternalUtils.check_arr_len(node_id, 33), action.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(action);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendChannelRangeQuery-variant MessageSendEvent
	 */
	public static MessageSendEvent send_channel_range_query(byte[] node_id, org.ldk.structs.QueryChannelRange msg) {
		long ret = bindings.MessageSendEvent_send_channel_range_query(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendShortIdsQuery-variant MessageSendEvent
	 */
	public static MessageSendEvent send_short_ids_query(byte[] node_id, org.ldk.structs.QueryShortChannelIds msg) {
		long ret = bindings.MessageSendEvent_send_short_ids_query(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendReplyChannelRange-variant MessageSendEvent
	 */
	public static MessageSendEvent send_reply_channel_range(byte[] node_id, org.ldk.structs.ReplyChannelRange msg) {
		long ret = bindings.MessageSendEvent_send_reply_channel_range(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

	/**
	 * Utility method to constructs a new SendGossipTimestampFilter-variant MessageSendEvent
	 */
	public static MessageSendEvent send_gossip_timestamp_filter(byte[] node_id, org.ldk.structs.GossipTimestampFilter msg) {
		long ret = bindings.MessageSendEvent_send_gossip_timestamp_filter(InternalUtils.check_arr_len(node_id, 33), msg == null ? 0 : msg.ptr);
		Reference.reachabilityFence(node_id);
		Reference.reachabilityFence(msg);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendEvent ret_hu_conv = org.ldk.structs.MessageSendEvent.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(msg); };
		return ret_hu_conv;
	}

}
