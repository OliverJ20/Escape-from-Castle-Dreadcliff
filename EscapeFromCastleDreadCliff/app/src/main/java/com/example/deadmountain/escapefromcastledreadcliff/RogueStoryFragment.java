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
public class RogueStoryFragment extends Fragment {


    public RogueStoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rogue_story, container, false);
        RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.rogue_button_container);
        RelativeLayout mmRelativeLayout = (RelativeLayout) view.findViewById(R.id.rogue_text_container);


        final TextView Header = (TextView) view.findViewById(R.id.rogue_header);
        Header.setText("testing for rogue");

        Context mContext = getContext();
        Button btn = new Button(mContext);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.setMargins(30, 30,0, 0);

        mRelativeLayout.addView(btn);
        btn.setText("Test button");
        Log.i ("testing",((MainActivity) getActivity()).Intro());

        TextView Intro = new TextView(mContext);
        mmRelativeLayout.addView(Intro);
        Intro.setText(((MainActivity) getActivity()).Intro());


        return view;
    }

}
