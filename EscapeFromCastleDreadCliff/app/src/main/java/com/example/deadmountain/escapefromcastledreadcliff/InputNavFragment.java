package com.example.deadmountain.escapefromcastledreadcliff;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
//import android.app.Fragment; this caused it to mess up and not read inputfragment


/**
 * Created by Jai on 7/03/2017.
 */

public class InputNavFragment extends Fragment {

    public InputNavFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_input_navigate, container, false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        Button topLEFTbtn = (Button) view.findViewById(R.id.topLEFTbtn);
        Button topRIGHTbtn = (Button) view.findViewById(R.id.topRIGHTbtn);
        Button bottomLEFTbtn = (Button) view.findViewById(R.id.bottomLEFTbtn);
        Button bottomRightbtn = (Button) view.findViewById(R.id.bottomRIGHTbtn);

        topLEFTbtn.setText(((MainActivity) getActivity()).topLeftbutton());
        topRIGHTbtn.setText(((MainActivity) getActivity()).topRightbutton());
        bottomLEFTbtn.setText(((MainActivity) getActivity()).BottomLeftbutton());
        bottomRightbtn.setText(((MainActivity) getActivity()).BottomRightbutton());






        return view;

    }


}


