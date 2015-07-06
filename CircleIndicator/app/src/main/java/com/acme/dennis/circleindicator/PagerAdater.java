package com.acme.dennis.circleindicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DENNIS on 05/07/2015.
 */
public class PagerAdater extends FragmentPagerAdapter{
    private final int NUMS_ITEM=3   ;

    public PagerAdater(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return LayoutUno.newInstance();
            case 1:
                return LayoutDos.newInstance();
            case 2:
                return LayoutTres.newInstance();
            default: return LayoutUno.newInstance();

        }

    }

    @Override
    public int getCount() {
        return NUMS_ITEM;
    }
}
