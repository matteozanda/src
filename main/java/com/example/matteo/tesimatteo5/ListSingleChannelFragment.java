package com.example.matteo.tesimatteo5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Matteo on 30/01/2017.
 */

public class ListSingleChannelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Layout inflate
        View view = inflater.inflate(R.layout.fragment_single_list, container, false);
        return view;
    }
}
