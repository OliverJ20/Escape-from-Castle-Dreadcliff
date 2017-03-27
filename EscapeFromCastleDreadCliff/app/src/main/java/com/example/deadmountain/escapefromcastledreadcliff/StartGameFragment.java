package com.example.deadmountain.escapefromcastledreadcliff;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.util.Log;
/**
 * A simple {@link Fragment} subclass.
 */
public class StartGameFragment extends Fragment {


    public static StartGameFragment newInstance() {
        // Required empty public constructor
        StartGameFragment fragment = new StartGameFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start_game, container, false);
        RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.button_container);

        Context mContext = getContext();
        Button btn = new Button(mContext);
        mRelativeLayout.addView(btn);
        btn.setText("New Game");


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Button b = (Button) view;
                ((MainActivity)getActivity()).startGameHandler(view);
            }
        });
        return view;
    }
}
