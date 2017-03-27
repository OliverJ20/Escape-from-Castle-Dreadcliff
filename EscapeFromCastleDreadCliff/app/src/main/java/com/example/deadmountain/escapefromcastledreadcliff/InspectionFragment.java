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

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inspection, container, false);
        RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.story_button_container);
        RelativeLayout mmRelativeLayout = (RelativeLayout) view.findViewById(R.id.inspect_text_container);

        final TextView Header = (TextView) view.findViewById(R.id.inspect_header);
        Header.setText("You are inspecting" +((MainActivity) getActivity()).getPlayerRoomName());

        Context mContext = getContext();

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.setMargins(30, 30,0, 0);

        final TextView Inspection = new TextView(mContext);
        mmRelativeLayout.addView(Inspection);
        Inspection.setText(((MainActivity)getActivity()).getRoomInspection());
        Inspection.setId(R.id.inspectInput);

        return view;
    }

}
