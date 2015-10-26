package com.example.amauryesparza.xmlstylessample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AmauryEsparza on 10/22/15.
 */
public class PagerBar extends Fragment{

    public PagerBar(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.pager_bar, container, false);
    }
}
