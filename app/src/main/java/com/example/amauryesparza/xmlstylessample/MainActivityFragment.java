package com.example.amauryesparza.xmlstylessample;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.amauryesparza.xmlstylessample.communicator.FragmentEventCallback;

import java.util.zip.Inflater;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener{

    //Callback to the activity
    FragmentEventCallback fragmentCallback;
    public MainActivityFragment() {
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof Activity){
            fragmentCallback = (FragmentEventCallback) context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button bttn = (Button) view.findViewById(R.id.button);
        bttn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onClick(View v){
        //call the callback activity
        fragmentCallback.onFragmentClickEvent(v);
    }


}
