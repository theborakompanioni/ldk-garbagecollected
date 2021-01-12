
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class CommitmentUpdate extends CommonBase {
	CommitmentUpdate(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.CommitmentUpdate_free(ptr); }
	}

	public CommitmentUpdate clone() {
		uint32_t ret = bindings.CommitmentUpdate_clone(this.ptr);
		CommitmentUpdate ret_hu_conv = new CommitmentUpdate(null, ret);
		return ret_hu_conv;
	}

	public void set_update_add_htlcs(UpdateAddHTLC[] val) {
		bindings.CommitmentUpdate_set_update_add_htlcs(this.ptr, (uint32_t[])Arrays.stream(val).map(arr_conv_15 -> arr_conv_15 == null ? 0 : arr_conv_15.ptr & ~1).toArray());
		/* TODO 2 UpdateAddHTLC  */;
	}

	public void set_update_fulfill_htlcs(UpdateFulfillHTLC[] val) {
		bindings.CommitmentUpdate_set_update_fulfill_htlcs(this.ptr, (uint32_t[])Arrays.stream(val).map(arr_conv_19 -> arr_conv_19 == null ? 0 : arr_conv_19.ptr & ~1).toArray());
		/* TODO 2 UpdateFulfillHTLC  */;
	}

	public void set_update_fail_htlcs(UpdateFailHTLC[] val) {
		bindings.CommitmentUpdate_set_update_fail_htlcs(this.ptr, (uint32_t[])Arrays.stream(val).map(arr_conv_16 -> arr_conv_16 == null ? 0 : arr_conv_16.ptr & ~1).toArray());
		/* TODO 2 UpdateFailHTLC  */;
	}

	public void set_update_fail_malformed_htlcs(UpdateFailMalformedHTLC[] val) {
		bindings.CommitmentUpdate_set_update_fail_malformed_htlcs(this.ptr, (uint32_t[])Arrays.stream(val).map(arr_conv_25 -> arr_conv_25 == null ? 0 : arr_conv_25.ptr & ~1).toArray());
		/* TODO 2 UpdateFailMalformedHTLC  */;
	}

	public UpdateFee get_update_fee() {
		uint32_t ret = bindings.CommitmentUpdate_get_update_fee(this.ptr);
		UpdateFee ret_hu_conv = new UpdateFee(null, ret);
		return ret_hu_conv;
	}

	public void set_update_fee(UpdateFee val) {
		bindings.CommitmentUpdate_set_update_fee(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public CommitmentSigned get_commitment_signed() {
		uint32_t ret = bindings.CommitmentUpdate_get_commitment_signed(this.ptr);
		CommitmentSigned ret_hu_conv = new CommitmentSigned(null, ret);
		return ret_hu_conv;
	}

	public void set_commitment_signed(CommitmentSigned val) {
		bindings.CommitmentUpdate_set_commitment_signed(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public static CommitmentUpdate constructor_new(UpdateAddHTLC[] update_add_htlcs_arg, UpdateFulfillHTLC[] update_fulfill_htlcs_arg, UpdateFailHTLC[] update_fail_htlcs_arg, UpdateFailMalformedHTLC[] update_fail_malformed_htlcs_arg, UpdateFee update_fee_arg, CommitmentSigned commitment_signed_arg) {
		uint32_t ret = bindings.CommitmentUpdate_new((uint32_t[])Arrays.stream(update_add_htlcs_arg).map(arr_conv_15 -> arr_conv_15 == null ? 0 : arr_conv_15.ptr & ~1).toArray(), (uint32_t[])Arrays.stream(update_fulfill_htlcs_arg).map(arr_conv_19 -> arr_conv_19 == null ? 0 : arr_conv_19.ptr & ~1).toArray(), (uint32_t[])Arrays.stream(update_fail_htlcs_arg).map(arr_conv_16 -> arr_conv_16 == null ? 0 : arr_conv_16.ptr & ~1).toArray(), (uint32_t[])Arrays.stream(update_fail_malformed_htlcs_arg).map(arr_conv_25 -> arr_conv_25 == null ? 0 : arr_conv_25.ptr & ~1).toArray(), update_fee_arg == null ? 0 : update_fee_arg.ptr & ~1, commitment_signed_arg == null ? 0 : commitment_signed_arg.ptr & ~1);
		CommitmentUpdate ret_hu_conv = new CommitmentUpdate(null, ret);
		/* TODO 2 UpdateAddHTLC  */;
		/* TODO 2 UpdateFulfillHTLC  */;
		/* TODO 2 UpdateFailHTLC  */;
		/* TODO 2 UpdateFailMalformedHTLC  */;
		ret_hu_conv.ptrs_to.add(update_fee_arg);
		ret_hu_conv.ptrs_to.add(commitment_signed_arg);
		return ret_hu_conv;
	}

}
