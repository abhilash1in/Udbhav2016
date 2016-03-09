package com.msrit.abhilash.udbhavtake1.TabHost;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.widget.TextView;

import com.msrit.abhilash.udbhavtake1.R;

public class Home extends FragmentActivity {


    private static final String TAB_1_TAG = "tab_1";
    private static final String TAB_2_TAG = "tab_2";
    private static final String TAB_3_TAG = "tab_3";
    private static final String TAB_4_TAG = "tab_4";
    private static final String TAB_5_TAG = "tab_5";
    private FragmentTabHost mTabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView()
    {
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(),R.id.realtabcontent);
        mTabHost.addTab(mTabHost.newTabSpec(TAB_1_TAG).setIndicator("Tab1"), OneContainerFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec(TAB_2_TAG).setIndicator("Tab2"),TwoContainerFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec(TAB_3_TAG).setIndicator("Tab3"),ThreeContainerFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec(TAB_4_TAG).setIndicator("Tab4"),ThreeContainerFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec(TAB_5_TAG).setIndicator("Tab5"),ThreeContainerFragment.class,null);

        for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
            final TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            if (tv == null)
                continue;
            else
                tv.setTextSize(10);

        }
    }

    @Override
    public void onBackPressed() {

        boolean isPopFragment = false;
        String currentTabTag = mTabHost.getCurrentTabTag();
        if (currentTabTag.equals(TAB_1_TAG)) {
            isPopFragment = ((BaseContainerFragment)getSupportFragmentManager().findFragmentByTag(TAB_1_TAG)).popFragment();
        } else if (currentTabTag.equals(TAB_2_TAG)) {
            isPopFragment = ((BaseContainerFragment)getSupportFragmentManager().findFragmentByTag(TAB_2_TAG)).popFragment();
        } else if (currentTabTag.equals(TAB_3_TAG)) {
            isPopFragment = ((BaseContainerFragment)getSupportFragmentManager().findFragmentByTag(TAB_3_TAG)).popFragment();
        } else if (currentTabTag.equals(TAB_4_TAG)) {
            isPopFragment = ((BaseContainerFragment)getSupportFragmentManager().findFragmentByTag(TAB_4_TAG)).popFragment();
        } else if (currentTabTag.equals(TAB_5_TAG)) {
            isPopFragment = ((BaseContainerFragment)getSupportFragmentManager().findFragmentByTag(TAB_5_TAG)).popFragment();
        }
        if (!isPopFragment) {
            finish();
        }
    }
}
