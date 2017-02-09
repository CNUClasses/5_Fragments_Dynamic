package com.example.fragments_dynamic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//KP DO NOT FORGET THE FALSE
		return inflater.inflate(R.layout.myfrag1, container,false);	
	}

	public interface OnFragmentInteractionListener {
	}
}
