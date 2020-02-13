package com.example.fragments_dynamic;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//KP DO NOT FORGET THE FALSE
		return inflater.inflate(R.layout.myfrag1, container,false);	
	}

	/**
	 * Called when the Fragment is no longer resumed.  This is generally
	 * tied to {@link Activity#onPause() Activity.onPause} of the containing
	 * Activity's lifecycle.
	 */
	@Override
	public void onPause() {
		super.onPause();
	}

	public interface OnFragmentInteractionListener {
	}
}
