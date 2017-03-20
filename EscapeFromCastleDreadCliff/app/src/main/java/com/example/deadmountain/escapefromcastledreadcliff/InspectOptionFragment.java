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


/**
 * A simple {@link Fragment} subclass.
 */
public class InspectOptionFragment extends Fragment {


    public InspectOptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inspect_option, container, false);
        //RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.tableLayout1);
        //RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.barb_button_container);
        //RelativeLayout mmRelativeLayout = (RelativeLayout) view.findViewById(R.id.barb_text_container);




        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        return view;
        // Inflate the layout for this fragment
    }

}
