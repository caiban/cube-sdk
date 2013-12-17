package com.srain.sdk.app;

import android.support.v4.app.Fragment;

public abstract class BaseFragment extends Fragment implements IBaseFragment {

	protected Object mDataIn;

	public BaseFragmentActivity getContext() {
		return (BaseFragmentActivity) getActivity();
	}

	// ===========================================================
	// implements IBaseFragment
	// ===========================================================
	@Override
	public void onComeIn(Object data) {
		mDataIn = data;
	}

	@Override
	public void onLeave() {

	}

	@Override
	public void onBack(Object data) {

	}

	@Override
	public boolean stayWhenBackPressed() {
		return false;
	}
}