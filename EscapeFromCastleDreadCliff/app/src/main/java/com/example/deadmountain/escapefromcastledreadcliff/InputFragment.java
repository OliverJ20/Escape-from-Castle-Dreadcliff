package com.example.deadmountain.escapefromcastledreadcliff;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Jai on 7/03/2017.
 */

public class InputFragment extends Fragment {

    public InputFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_input, container, false);
        RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.tableLayout1)
        //RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.barb_button_container);
        //RelativeLayout mmRelativeLayout = (RelativeLayout) view.findViewById(R.id.barb_text_container);




        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        return view;

    }
}



