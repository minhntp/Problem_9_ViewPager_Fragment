package com.bkdn.nqminh.problem_9_viewpager_fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.bkdn.nqminh.problem_9_viewpager_fragment.BlankFragment;
import com.bkdn.nqminh.problem_9_viewpager_fragment.BlankFragment2;
import com.bkdn.nqminh.problem_9_viewpager_fragment.BlankFragment3;

/**
 * Created by nqminh on 28/03/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BlankFragment tab1 = new BlankFragment();
                return tab1;
            case 1:
                BlankFragment2 tab2 = new BlankFragment2();
                return tab2;
            case 2:
                BlankFragment3 tab3 = new BlankFragment3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
