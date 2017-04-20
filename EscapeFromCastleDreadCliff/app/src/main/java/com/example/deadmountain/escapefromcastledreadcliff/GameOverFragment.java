package com.example.deadmountain.escapefromcastledreadcliff;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jai on 20/04/2017.
 */

public class GameOverFragment extends Fragment {

    public GameOverFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_game_over, container, false);
        return view;

    }
}
