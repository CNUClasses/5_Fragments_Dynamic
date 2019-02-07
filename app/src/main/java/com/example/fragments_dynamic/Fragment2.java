package com.example.fragments_dynamic;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment2 extends Fragment {

	Button b;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//KP DO NOT FORGET THE FALSE
		return  inflater.inflate(R.layout.myfrag2, container,false);
	}

}
