package com.example.deadmountain.escapefromcastledreadcliff;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InspectionFragment extends Fragment {


    public InspectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_inspection, container, false);
        RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.barb_button_container);
        RelativeLayout mmRelativeLayout = (RelativeLayout) view.findViewById(R.id.inspect_text_container);

        final TextView Header = (TextView) view.findViewById(R.id.inspect_header);

        // Header.setText(allRooms.getRoomFromID(((MainActivity) getActivity()).getPlayerRoom()).getRoom());
        //Header.setId(R.id.storyHeader);
        Header.setText("You are inspecting" +((MainActivity) getActivity()).getPlayerRoomName());


        Context mContext = getContext();
        //Button btn = new Button(mContext);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.setMargins(30, 30,0, 0);




        //mRelativeLayout.addView(btn);
        // btn.setText("Test button");

        Log.i ("testing",((MainActivity) getActivity()).Intro());

        final TextView Inspection = new TextView(mContext);
        mmRelativeLayout.addView(Inspection);

        //Intro.setText(((MainActivity) getActivity()).Intro());
        //Intro.setText(((MainActivity)getActivity()).getRoom(((((MainActivity) getActivity()).getPlayerRoom()))).getRoom());
        Inspection.setText(((MainActivity)getActivity()).getRoomInspection());
        Inspection.setId(R.id.inspectInput);




        // Inflate the layout for this fragment
        return view;
    }

}
