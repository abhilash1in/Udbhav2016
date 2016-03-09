package com.msrit.abhilash.udbhavtake1.Main.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.msrit.abhilash.udbhavtake1.Main.Fragments.RegisterFragment;
import com.msrit.abhilash.udbhavtake1.Main.Fragments.RootFragment;
import com.msrit.abhilash.udbhavtake1.Main.Fragments.StaticFragment;
import com.msrit.abhilash.udbhavtake1.R;

public class Home2 extends AppCompatActivity {

    // For this example, only two pages
    static final int NUM_ITEMS = 2;

    private Toolbar toolbar;
    static ViewPager mPager;
    private TabLayout tabLayout;
    SlidePagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

		/* Instantiate a ViewPager and a PagerAdapter. */
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new SlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int value = extras.getInt("EXTRA_PAGE");
            mPager.setCurrentItem(value);
        }

        tabLayout = (TabLayout) findViewById(R.id.tabs2);
        tabLayout.setupWithViewPager(mPager);

    }

    public static void setPage(int i)
    {
        mPager.setCurrentItem(i, true);
    }

    /* PagerAdapter class */
    public class SlidePagerAdapter extends FragmentPagerAdapter {
        public SlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
			/*
			 * IMPORTANT: This is the point. We create a RootFragment acting as
			 * a container for other fragments
			 */
            if (position == 0)
                return new RootFragment();
            else
                return new RegisterFragment();
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if(position==0)
                return "Events";
            else if(position==1)
                return "Register";
            return "Heading";

        }
    }

}
