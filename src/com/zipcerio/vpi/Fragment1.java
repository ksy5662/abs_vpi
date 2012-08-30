package com.zipcerio.vpi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

public class Fragment1 extends SherlockFragment {
	private ListView mList;

	@Override
	public View onCreateView(LayoutInflater inf, ViewGroup grp, Bundle icicle) {
		View v = inf.inflate(R.layout.f_fragment1, grp, false);
		mList = (ListView) v.findViewById(R.id.listView1);
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_list_item_1, Cheese.STRINGS);
		mList.setAdapter(adapter);
	}

}
