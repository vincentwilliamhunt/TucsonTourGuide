package com.example.android.tucson;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DayFragment();
        }
        else if (position == 1) {
            return new NightFragment();
        }
        else if (position == 2) {
            return new DineFragment();
        }
        else {
            return new WildlifeFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_day);
        }
        else if (position == 1) {
            return mContext.getString(R.string.category_night);
        }
        else if (position == 2) {
            return mContext.getString(R.string.category_dine);
        }
        else {
            return mContext.getString(R.string.category_wildlife);
        }
    }
}

