package com.example.deadmountain.escapefromcastledreadcliff;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.content.Context;
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
    private StoryFragment StoryFragment;
    private InputFragment inputFragment;
    private InputNavFragment inputNavFragment;
    private LoadScreenFragment loadScreenFragment;
    private InspectOptionFragment inspectOptionFragment;
    private InspectionFragment inspectionFragment;

    private int selectedOption = 0;
    private String selectedString = "0";
    private String PlayerClass = "";
    private Integer PlayerRoom = 1;
    private String inspectRoom = "";
    private RoomCreation allRooms;

    private String[] PlayerConditions = new String[10];

    private int Classid = 0;

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
        StoryFragment = new StoryFragment();
        inputFragment = new InputFragment();
        inputNavFragment = new InputNavFragment();
        loadScreenFragment = new LoadScreenFragment();
        inspectOptionFragment = new InspectOptionFragment();
        inspectionFragment =  new InspectionFragment();
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
        View loadbutton = findViewById(R.id.loadGameButton);
        loadbutton.setVisibility(View.GONE);
        getSupportFragmentManager()
                .beginTransaction()
//                .addToBackStack("test?")
                .replace(R.id.fragment_container, selectClassFragment)
                .commit();

        // FragmentManager fm = getSupportFragmentManager();
        //SelectClassFragment selectFragment = new SelectClassFragment();
        // FragmentTransaction ft = fm.beginTransaction();
        // ft.replace(R.id.fragment_container, selectFragment);
        // ft.commit();


    }

    public void saveGame() {
        String toSave = getPlayerClass() + ", " + getPlayerRoom();
        String fileName = "saveFile";
        try {
            FileOutputStream fOut = openFileOutput(fileName, MODE_PRIVATE);
            fOut.write(toSave.getBytes());
            fOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    String loadedContent = "";
    public void loadGame() {
        String fileName = "saveFile";
        try {
            FileInputStream fIn = openFileInput(fileName);
            InputStreamReader isr = new InputStreamReader(fIn);
            BufferedReader bR = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bR.readLine()) != null) {
                loadedContent = line;
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadGameHandler(View view) {
        // Remove the new game and load game buttons
        view.setVisibility(View.GONE);
        View newbutton = findViewById(R.id.newGameButton);
        newbutton.setVisibility(View.GONE);

        // Read the file

        // Process the file

        // Set veriables
        this.PlayerRoom = 2;
        this.PlayerClass = "Mage";

        // Load the story fragment and input fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, StoryFragment)
                .commit();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.button_container, inputFragment)
                .commit();
    }
    public String getPlayerClass() {
        return this.PlayerClass;
    }

    public Integer getPlayerRoom() {
        return this.PlayerRoom;
    }

    public String getPlayerRoomName(int currentRoom) {
        return allRooms.getRoomFromID(currentRoom).getRoom();
    }

    public Room getRoom(int roomID) {
        return allRooms.getRoomFromID(roomID);
    }

    public void onMoveButtonClicked(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack("navinput")
                .replace(R.id.button_container, inputNavFragment)
                .commit();

    }

    public void test(View view) {
        this.PlayerRoom = 1;
    }
    public void updateStoryFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .detach(StoryFragment)
                .commitNowAllowingStateLoss();
        getSupportFragmentManager()
                .beginTransaction()
                .attach(StoryFragment)
                .commitAllowingStateLoss();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.button_container, inputFragment)
                .commit();
    }
    public void onCombatButtonClicked(View view) {
        saveGame();
    }

    public void onInventoryButtonClicked(View view) {

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
    public void buttonSubmitClick(View view) {
        if (selectedOption == 1) {
          //Button button = (Button) findViewById(R.id.option1RadioButton);
           getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, StoryFragment)
                    .commit();
            PlayerClass = "Barbarian";
            PlayerRoom = 0;
            Classid = 0;

        }
        else if (selectedOption == 2) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, StoryFragment)
                    .commit();
            PlayerClass = "Mage";
            PlayerRoom = 0;
            Classid = 1;
        }
        else if (selectedOption == 3) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, StoryFragment)
                    .commit();
            PlayerClass = "Rogue";
            PlayerRoom = 0;
            Classid = 2;
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
       return allRooms.getRoomFromID(PlayerRoom).getConnectRooms(1);

    }
    public String topLeftbutton()
    {
        return allRooms.getRoomFromID(PlayerRoom).getConnectRooms(0);
    }
    public String BottomLeftbutton()
    {
        return allRooms.getRoomFromID(PlayerRoom).getConnectRooms(2);
    }
    public String BottomRightbutton()
    {
        return allRooms.getRoomFromID(PlayerRoom).getConnectRooms(3);

    }

    public void topLeftButtonClickHandaler(View view) {
        this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(0);
        updateStoryFragment();
    }
    public void topRightButtonClickHandaler(View view) {
        this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(1);

        updateStoryFragment();
    }
    public void bottomLeftButtonClickHandaler(View view) {
        this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(2);
        updateStoryFragment();
    }
    public void bottomRightButtonClickHandaler(View view) {
        this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(3);
        updateStoryFragment();
    }

    public String roomAndInspectText()
    {
      //  TextView Inspect = (TextView) StoryFragment.getActivity().findViewById(R.id.intro_id);
     //   Inspect.setText(allRooms.getRoomFromID(PlayerRoom).getRoomDescription() + "\n\n" +allRooms.getRoomFromID(PlayerRoom).getRoomInspection());
        return  allRooms.getRoomFromID(PlayerRoom).getRoomDescription() + "\n\n" +allRooms.getRoomFromID(PlayerRoom).getRoomInspection();
    }



   public void inspectButtonHandler(View view)
    {
        TextView Inspect = (TextView) StoryFragment.getActivity().findViewById(R.id.intro_id);
       // Inspect.setText(allRooms.getRoomFromID(PlayerRoom).getRoomDescription() + "\n\n" +allRooms.getRoomFromID(PlayerRoom).getRoomInspection());
        //Inspect.setText(roomAndInspectText()+ "\n"+"Option 1 is to kill a dude\nOption 2 do a thing\nOption 3 have fun");



        /*Inspect.setText(roomAndInspectText()+ "\n"
                + allRooms.getRoomFromID(PlayerRoom).getRoomOptions(PlayerClass)[0][allRooms.getRoomFromID(PlayerRoom).getRoomID()]
                +"\n"+allRooms.getRoomFromID(PlayerRoom).getRoomOptions(PlayerClass)[1][allRooms.getRoomFromID(PlayerRoom).getRoomID()]
                +"\n"+allRooms.getRoomFromID(PlayerRoom).getRoomOptions(PlayerClass)[2][allRooms.getRoomFromID(PlayerRoom).getRoomID()]);*/


        Inspect.setText(roomAndInspectText() + "\n"
        + allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][0]
        + "\n" + allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][1]
        + "\n" + allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][2]);
               // allRooms.getRoomFromID(PlayerRoom).getRoomOptions(PlayerClass)[0][allRooms.getRoomFromID(PlayerRoom).getRoomID()]


        if (allRooms.getRoomFromID(PlayerRoom).getRoom() == "Storage Room")
        {
            if (PlayerConditions[0] != "Torch") {
                Inspect.setText( "the room is to dark to see");
            }

        }


        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack("navinput")
                .replace(R.id.button_container, inspectOptionFragment)
                .commit();



    }
    public String option1ButtonCheck()
    {
        return allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][0];
    }
    public String option2ButtonCheck()
    {
        return allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][1];
    }

    public String option3ButtonCheck()
    {
        return allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][2];
    }


    public void moveRoomButtonHandler(View view)
    {
            if (allRooms.getRoomFromID(PlayerRoom).getConnectRooms(0) == "S")
            {
                PlayerRoom = 1;
                Log.i("testing",allRooms.getRoomFromID(PlayerRoom).getRoom() );
                // TextView Header = (TextView) StoryFragment.getActivity().findViewById(R.id.storyHeader);
                //Header.setText(allRooms.getRoomFromID(PlayerRoom).getRoom());
                getSupportFragmentManager()
                        .beginTransaction()
                        .detach(StoryFragment)
                        .commitNowAllowingStateLoss();
                getSupportFragmentManager()
                        .beginTransaction()
                        .attach(StoryFragment)
                        .commitAllowingStateLoss();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.button_container, inputFragment)
                        .commit();

            }
    }

    public String getPlayerRoomName()
    {
        return allRooms.getRoomFromID(PlayerRoom).getRoom();

    }
    public String getRoomDescription()
    {
        String roomDescript = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
        if (allRooms.getRoomFromID(PlayerRoom).getRoom() == "Storage Room")
        {
            if (PlayerConditions[0] != "Torch") {
                roomDescript = "the room is to dark to see";
            }

        }
        return roomDescript;

    }
    public String getRoomInspection()
    {
        return allRooms.getRoomFromID(PlayerRoom).getRoomInspection();
    }
    public String[] inspectOptions()
    {
        if (allRooms.getRoomFromID(PlayerRoom).getRoomID() == 0 )
        {
            String option1 = "hit thing";
            String option2 = "break thing";
            String option3 = "end thing";
            String[] options = {option1, option2, option3};
            return options;
        }
        return null;

    }

    public void option1ButtonHandler(View view)
    {
        this.PlayerConditions[0] = "Torch";
        getSupportFragmentManager()
                .beginTransaction()
                .detach(StoryFragment)
                .commitNowAllowingStateLoss();
        getSupportFragmentManager()
                .beginTransaction()
                .attach(StoryFragment)
                .commitAllowingStateLoss();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.button_container, inputFragment)
                .commit();


    }





}
