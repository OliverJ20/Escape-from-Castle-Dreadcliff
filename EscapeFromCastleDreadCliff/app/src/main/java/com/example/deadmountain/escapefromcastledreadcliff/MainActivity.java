package com.example.deadmountain.escapefromcastledreadcliff;

import java.util.ArrayList;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.RadioButton;
import android.widget.Button;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

import android.content.Intent;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    // private NewGameFragment newGamefragment;
    // private SelectClassFragment selectClassfragment;
    private SelectClassFragment selectClassFragment;
    private BarbStoryFragment barbStoryFragment;
    private MageStoryFragment mageStoryFragment;
    private RogueStoryFragment rogueStoryFragment;
    private InputFragment inputFragment;
    private InputNavFragment inputNavFragment;
    private int selectedOption = 0;
    private String selectedString = "0";
    private String PlayerClass = "";
    private Integer PlayerRoom = 0;
    private String inspectRoom = "";
    private RoomCreation allRooms;

//    ArrayList<Room> allRooms = new ArrayList<Room>();
//    Room gameRooms = new Room ("You are in a dark dungeon", 0, "Dungeon");
//    boolean test = allRooms.add(gameRooms);

    //RoomCreation test = new RoomCreation();



    private String intro = "";
    private int J = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //   newGamefragment = new NewGameFragment();
        selectClassFragment = new SelectClassFragment();
        barbStoryFragment = new BarbStoryFragment();
        mageStoryFragment = new MageStoryFragment();
        rogueStoryFragment = new RogueStoryFragment();
        inputFragment = new InputFragment();
        inputNavFragment = new InputNavFragment();
        allRooms = new RoomCreation();
        allRooms.createAllRooms();


    }

    @Override
    public void onBackPressed() {
//        if (getFragmentManager().getBackStackEntryCount() > 0) {
//            getFragmentManager().popBackStack();
//        } else {
//            super.onBackPressed();
//        }

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.button_container, inputFragment )
                .commit();
    }

    // public void newGame()
    // {
    //     final Button button = (Button) findViewById(R.id.newGamebutton);

    // }

///CREATE OBJECTS !.




    public void startGameHandler(View view) {
        view.setVisibility(View.GONE);

        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack("test?")
                .replace(R.id.fragment_container, selectClassFragment)
                .commit();

        // FragmentManager fm = getSupportFragmentManager();
        //SelectClassFragment selectFragment = new SelectClassFragment();
        // FragmentTransaction ft = fm.beginTransaction();
        // ft.replace(R.id.fragment_container, selectFragment);
        // ft.commit();


    }

    public void onMoveButtonClicked(View view) {






        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack("navinput")
                .replace(R.id.button_container, inputNavFragment)
                .commit();

    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton)view).isChecked();
        switch(view.getId())
        {
            case R.id.option1RadioButton:
                if (checked)
                {
                    selectedOption = 1;
                    selectedString = "1";
                    Log.i ("hello", selectedString);
                    break;
                }
            case R.id.option2RadioButton:
                if (checked)
                {
                    selectedOption = 2;
                    selectedString = "2";
                    Log.i ("hello", selectedString);
                    break;
                }
            case R.id.option3RadioButton:
                if (checked)
                {
                    selectedOption = 3;
                    selectedString = "3";
                    Log.i ("hello", selectedString);
                    break;
                }
        }
    }
    public void buttonSubmitClick(View view)
    {


        if (selectedOption == 1) {
          //Button button = (Button) findViewById(R.id.option1RadioButton);
           getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, barbStoryFragment)
                    .commit();
            PlayerClass = "Barbarian";
            PlayerRoom = 0;
        }
        else if (selectedOption == 2) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, mageStoryFragment)

                    .commit();
            PlayerClass = "Mage";
            PlayerRoom = 0;


        }
        else if (selectedOption == 3) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, rogueStoryFragment)



                    .commit();
            PlayerClass = "Rogue";
            PlayerRoom = 0;


        }
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.button_container, inputFragment)
                .commit();

        //Intent intent = new Intent (SelectClassFragment.this, MainActivity);



    }


    public String Intro()
    {
         intro = "You awake to the sound of thunder echoing from outside" +
                "\nthe sound of rain hitting stone." +
                "\nYou find yourself in a small jail cell, with a single torch on the" +
                "\non the other side lighting the room. ";







        return intro;

    }
   // onInputNavButtonClicked

    public String InspectRoom()
    {
       /* if (PlayerRoom == "Dungeon")
        {
            inspectRoom = "your in the dungeon";

               Button button = (Button) inputNavFragment.getActivity().findViewById(R.id.bottomLEFTbtn);
                //button.setText("N");
           // Log.i("testo", (inputNavFragment.getActivity().findViewById(R.id.bottomLEFTbtn).toString()));

            return inspectRoom;
        }



        return"";*/
       // Button button = (Button) inputNavFragment.getActivity().findViewById(R.id.bottomLEFTbtn);
        Integer help = 0;
        return allRooms.getRoomFromID(PlayerRoom).getRoomInspect(PlayerClass);

        //return gameRooms.getRoomInspect(PlayerClass);
    }
    public String topRightbutton()
    {
        return "N";
    }
    public String topLeftbutton()
    {
        return "E";
    }
    public String BottomLeftbutton()
    {
        return "W";
    }
    public String BottomRightbutton()
    {
        return "S";
    }





   public void inspectButtonHandler(View view)
    {


        if (PlayerClass == "Barbarian")
        {
             TextView Inspect = (TextView) barbStoryFragment.getActivity().findViewById(R.id.intro_id);
            Inspect.setText(InspectRoom());
        }
        else if (PlayerClass == "Mage")
        {
            TextView Inspect = (TextView) mageStoryFragment.getActivity().findViewById(R.id.intro_id);
            Inspect.setText(InspectRoom());
        }
       else if (PlayerClass == "Rogue")
        {
            TextView Inspect = (TextView) rogueStoryFragment.getActivity().findViewById(R.id.intro_id);
            Inspect.setText(InspectRoom());
        }
        


    }


}
