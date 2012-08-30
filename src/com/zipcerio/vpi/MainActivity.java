package com.zipcerio.vpi;

import java.util.ArrayList;
import java.util.List;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.viewpagerindicator.TitlePageIndicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

public class MainActivity extends SherlockFragmentActivity {
	private ViewPager mPager;
	private TitlePageIndicator mIndicator;
	private MainPagerAdapter mAdapter;
	private List<Fragment> mFragments;
	
	private static final String FRAGMENT1 = Fragment1.class.getName();
	private static final String FRAGMENT2 = Fragment1.class.getName();
	private static final String FRAGMENT3 = Fragment1.class.getName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_main);
		
		// add fragments
		mFragments = new ArrayList<Fragment>();
		mFragments.add(Fragment.instantiate(this, FRAGMENT1));
		mFragments.add(Fragment.instantiate(this, FRAGMENT2));
		mFragments.add(Fragment.instantiate(this, FRAGMENT3));
		
		// adapter
		mAdapter = new MainPagerAdapter(getSupportFragmentManager(), mFragments);
		
		// pager
		mPager = (ViewPager) findViewById(R.id.view_pager);
		mPager.setAdapter(mAdapter);
		
		// indicator
		mIndicator = (TitlePageIndicator) findViewById(R.id.title_indicator);
		mIndicator.setViewPager(mPager);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}
	
}