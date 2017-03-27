package com.example.deadmountain.escapefromcastledreadcliff;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jai on 17/03/2017.
 */

public class LoadScreenFragment extends Fragment {

    public LoadScreenFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_load_screen, container, false);
    }
}