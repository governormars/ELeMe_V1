package com.yanghan.fragment_tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a1141705068qq.class_one.R;

public class FragmentPage2 extends Fragment{
	private View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		view=inflater.inflate(R.layout.tab_fragment2, null);
		return view;
	}
}
