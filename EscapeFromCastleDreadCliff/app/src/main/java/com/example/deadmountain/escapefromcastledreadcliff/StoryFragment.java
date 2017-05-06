package com.example.deadmountain.escapefromcastledreadcliff;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StoryFragment extends Fragment {
    private RoomCreation allRooms;
    private Room theRoom;


    public StoryFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_story, container, false);
//        RelativeLayout mRelativeLayout = (RelativeLayout) view.findViewById(R.id.story_button_container);
//        RelativeLayout mmRelativeLayout = (RelativeLayout) view.findViewById(R.id.story_text_container);



        final TextView Header = (TextView) view.findViewById(R.id.story_header);


        Header.setId(R.id.storyHeader);
        Header.setText("You are in the" +((MainActivity) getActivity()).getPlayerRoomName());



        Header.setText(((MainActivity)getActivity()).getPlayerRoomName(((MainActivity)getActivity()).getPlayerRoom()));

        Context mContext = getContext();


//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
//        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
//        layoutParams.setMargins(30, 30,0, 0);
//
//       final TextView MainText = new TextView(mContext);
//        mmRelativeLayout.addView(MainText);
//        MainText.setText(((MainActivity)getActivity()).getRoomDescription());
//        MainText.setId(R.id.main_text_id);

        final TextView MainText = (TextView) view.findViewById(R.id.story_text);
        MainText.setText(((MainActivity)getActivity()).getRoomDescription());
        MainText.setId(R.id.main_text_id);
        return view;

    }
}
