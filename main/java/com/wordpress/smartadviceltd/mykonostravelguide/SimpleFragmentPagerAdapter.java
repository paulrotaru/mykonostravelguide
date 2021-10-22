package com.wordpress.smartadviceltd.mykonostravelguide;



import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    private Context mContext;


    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new mykonos();
        } else if (position == 1) {
            return new sleep_and_eat();
        } else if (position == 2) {
            return new what_to_do();
        } else {
            return new save_money();
        }
    }
    @Override
    public int getCount () {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.mykonos_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.sleep_and_eat);
        } else if (position == 2) {
            return mContext.getString(R.string.what_to_do);
        } else {
            return mContext.getString(R.string.save_money_fragment);
        }


    }



}
