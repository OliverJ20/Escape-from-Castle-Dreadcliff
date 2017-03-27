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

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        Button option1btn  = (Button) view.findViewById(R.id.Option1);

        Button option2btn  = (Button) view.findViewById(R.id.Option2);

        Button option3btn  = (Button) view.findViewById(R.id.Option3);

        if ( ((MainActivity)getActivity()).option1ButtonCheck() == "")
        {
            option1btn.setVisibility(View.INVISIBLE);
        }
        else
        {
            option1btn.setVisibility(View.VISIBLE);
        }

        if ( ((MainActivity)getActivity()).option2ButtonCheck() == "")
        {
            option2btn.setVisibility(View.INVISIBLE);
        }
        else
        {
            option1btn.setVisibility(View.VISIBLE);
        }

        if ( ((MainActivity)getActivity()).option3ButtonCheck() == "")
        {
            option3btn.setVisibility(View.INVISIBLE);
        }
        else
        {
            option1btn.setVisibility(View.VISIBLE);
        }
        return view;

    }
}
