package com.example.amauryesparza.xmlstylessample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.amauryesparza.xmlstylessample.PagerBar;
import com.example.amauryesparza.xmlstylessample.PagerMap;

/**
 * Created by AmauryEsparza on 10/22/15.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numTabs;

    public PagerAdapter(FragmentManager fragmentManager, int numTabs){
        super(fragmentManager);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return new PagerMap();
            default:
                return new PagerBar();
        }
    }

    @Override
    public int getCount(){
        return numTabs;
    }
}
