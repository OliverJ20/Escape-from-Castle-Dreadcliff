package com.example.deadmountain.escapefromcastledreadcliff;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.app.Activity;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.util.Log;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class StoryFragment extends Fragment {
    private RoomCreation allRooms;
    private Room theRoom;


    public StoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        allRooms = new RoomCreation();


        View view = inflater.inflate(R.layout.fragment_barb_story, container, false);
        RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.barb_button_container);
        RelativeLayout mmRelativeLayout = (RelativeLayout) view.findViewById(R.id.barb_text_container);


        final TextView Header = (TextView) view.findViewById(R.id.barb_header);

       // Header.setText(allRooms.getRoomFromID(((MainActivity) getActivity()).getPlayerRoom()).getRoom());
        Header.setId(R.id.storyHeader);
        Header.setText(((MainActivity) getActivity()).getPlayerRoomName());


        //Header.setText("testing for barb");
        Header.setText(((MainActivity)getActivity()).getPlayerRoomName(((MainActivity)getActivity()).getPlayerRoom()));

        Context mContext = getContext();
        //Button btn = new Button(mContext);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.setMargins(30, 30,0, 0);




        //mRelativeLayout.addView(btn);
       // btn.setText("Test button");

        Log.i ("testing",((MainActivity) getActivity()).Intro());

       final TextView Intro = new TextView(mContext);
        mmRelativeLayout.addView(Intro);

        //Intro.setText(((MainActivity) getActivity()).Intro());
        Intro.setText(((MainActivity)getActivity()).getRoom(((((MainActivity) getActivity()).getPlayerRoom()))).getRoom());
        Intro.setId(R.id.intro_id);



        //btn.setId(R.id.testthing);







               //Intro.getId());



       // Button button = (Button) getView().findViewById(R.id.inspBTN);

//        btn.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view)
//            {
//               // Button b = (Button) view;
//                Intro.setText("test");
//
//            }
//        });







        return view;

    }

   public void setText(String mtext)
    {
      //  Button button = (Button) getView().findViewById(R.id.testthing);


    }

}
