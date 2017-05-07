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
import android.widget.Toast;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private SelectClassFragment selectClassFragment;
    private StoryFragment StoryFragment;
    private InputFragment inputFragment;
    private InputNavFragment inputNavFragment;
    private LoadScreenFragment loadScreenFragment;
    private InspectOptionFragment inspectOptionFragment;
    private InspectionFragment inspectionFragment;
    private MainMenuFragment mainMenuFragment;
    private GameOverFragment gameOverFragment;
    private int selectedOption = 0;
    private String selectedString = "0";
    private String PlayerClass = "";
    private Integer PlayerRoom = 0;
    private String inspectRoom = "";
    private RoomCreation allRooms;
    private RoomOption roomOption;
    private String roomDescript = "";
    private int Item = 0;
    private String[] PlayerConditions = new String[10];
    private ArrayList<Integer> PlayerItems;
    private int Classid = 0;
    private int inSelectScreen = 0;
    private int inLoadingScreen = 0;
    private String backUpRoomDescription = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_menu);
        selectClassFragment = new SelectClassFragment();
        gameOverFragment = new GameOverFragment();
        StoryFragment = new StoryFragment();
        inputFragment = new InputFragment();
        inputNavFragment = new InputNavFragment();
        loadScreenFragment = new LoadScreenFragment();
        inspectOptionFragment = new InspectOptionFragment();
        inspectionFragment =  new InspectionFragment();
        allRooms = new RoomCreation(this);
        try {
            allRooms.loadRooms();
        } catch (IOException e) {
            e.printStackTrace();
        }
        roomOption = new RoomOption();
        roomOption.AddRoomOptions(allRooms.getAllRooms());
        mainMenuFragment = new MainMenuFragment();
        roomDescript = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
        PlayerItems  = new ArrayList<Integer>();


        loadData loaddata = new loadData(this);
        try {
            loaddata.loadAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() != 0) {
            getFragmentManager().popBackStack();
        }
        else if (inSelectScreen == 1 || inLoadingScreen == 1)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,mainMenuFragment)
                    .commit();
        }
        else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.button_container,inputFragment)
                    .commit();
        }
    }

    public void startGameHandler(View view) {
        inSelectScreen = 1;
        view.setVisibility(View.INVISIBLE);
        View loadbutton = findViewById(R.id.loadGameButton);
        loadbutton.setVisibility(View.INVISIBLE);
        View MainTitle = findViewById(R.id.mainTitle);
        MainTitle.setVisibility(View.INVISIBLE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, selectClassFragment)
                .commit();
    }
    public void mainMenuHandler(View view) {
        inSelectScreen = 1;
        view.setVisibility(View.INVISIBLE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, gameOverFragment)
                .commit();
    }
    public void loadScreenHandler(View view) {
        inLoadingScreen = 1;
        view.setVisibility(View.GONE);
        View newbutton = findViewById(R.id.newGameButton);
        newbutton.setVisibility(View.GONE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, loadScreenFragment)
                .commit();
    }

    public void saveGame() {
        String toSave = getPlayerClass() + ", " + getPlayerRoom();
        String fileName = "";
        if (getPlayerClass() == "Barbarian"){
            fileName = "barbarianSave";
        }
        else if(getPlayerClass() == "Mage") {
            fileName = "mageSave";
        }
        else if(getPlayerClass() == "Rogue") {
            fileName = "rogueSave";
        }
        else {
            fileName = "unknownSave";
        }
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

    public String loadGameFile(String loadClass) {
        String fileName = "saveFile";
        if (loadClass == "Barbarian"){
            fileName = "barbarianSave";
        }
        else if(loadClass == "Mage") {
            fileName = "mageSave";
        }
        else if(loadClass == "Rogue") {
            fileName = "rogueSave";
        }
        else {
            fileName = "unknownSave";
        }
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
            return "error_no_save";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  loadedContent;

    }
    public void loadBarbarian(View view) {
        loadGameHandler(view,"Barbarian");
    }
    public void loadMage(View view) {
        loadGameHandler(view, "Mage");
    }
    public void loadRogue(View view) {
        loadGameHandler(view, "Rogue");
    }
    public void loadGameHandler(View view, String saveFile) {
        Integer loadedPlayerRoom = 0;
        String loadedPlayerClass = "";
        String loadedFile = "";
        String[] loadedTokens;

        // Read the file
        loadedFile = loadGameFile(saveFile);
        // Process the file
        if (loadedFile != "error_no_save") {
            loadedTokens = loadedFile.split(", +");
            loadedPlayerClass = loadedTokens[0];
            loadedPlayerRoom = Integer.parseInt(loadedTokens[1]);
            // Set veriables
            this.PlayerRoom = loadedPlayerRoom;
            this.PlayerClass = loadedPlayerClass;

            // Load the story fragment and input fragment
            inSelectScreen = 0;
            inLoadingScreen = 0;
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, StoryFragment)
                    .commit();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.button_container, inputFragment)
                    .commit();
        }
        else {
            Toast.makeText(getApplicationContext(), "The save file is empty",Toast.LENGTH_SHORT).show();
        }

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
        saveGame();
    }

    public void onCombatButtonClicked(View view) {
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

           inSelectScreen = 0;
           inLoadingScreen = 0;
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, StoryFragment)
                    .commit();
            PlayerClass = "Barbarian";
            PlayerRoom = 0;
            Classid = 0;
            PlayerItems.add(0);
            Item = allRooms.getRoomFromID(PlayerRoom).getRequiredItem();
            Log.i ("testingrequireditem", Integer.toString(allRooms.getRoomFromID(PlayerRoom).getRequiredItem()));
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.button_container, inputFragment)
                    .commit();
        }
        else if (selectedOption == 2) {
            inSelectScreen = 0;
            inLoadingScreen = 0;
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, StoryFragment)
                    .commit();
            PlayerClass = "Mage";
            PlayerRoom = 0;
            Classid = 1;
            PlayerItems.add(0);
            Item = allRooms.getRoomFromID(PlayerRoom).getRequiredItem();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.button_container, inputFragment)
                    .commit();

        }
        else if (selectedOption == 3) {
            inSelectScreen = 0;
            inLoadingScreen = 0;
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, StoryFragment)
                    .commit();
            PlayerClass = "Rogue";
            PlayerRoom = 0;
            Classid = 2;
            PlayerItems.add(0);
            Item = allRooms.getRoomFromID(PlayerRoom).getRequiredItem();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.button_container, inputFragment)
                    .commit();
        }
    }

    public String topLeftbutton()
    {
        return allRooms.getRoomFromID(PlayerRoom).getConnectRooms(0);
    }
    public String topRightbutton()
    {
       return allRooms.getRoomFromID(PlayerRoom).getConnectRooms(1);
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

        for (int i = 0; i < PlayerItems.size(); i++) {
            int item = PlayerItems.get(i);
            int movingToRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(0);
            Item = allRooms.getRoomFromID(movingToRoom).getRequiredItem();
            if (Item != item )
            {
                roomDescript = allRooms.getRoomFromID(movingToRoom).getLockedRoomDescription();

            }
            else if (Item == item) {
                this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(0);
                roomDescript = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
                Log.i ("testing room descript", roomDescript);
                backUpRoomDescription = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
            }
        }
        updateStoryFragment();
    }
    public void topRightButtonClickHandaler(View view) {
        for (int i = 0; i < PlayerItems.size(); i++) {
            int item = PlayerItems.get(i);
            int movingToRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(1);
            Item = allRooms.getRoomFromID(movingToRoom).getRequiredItem();
            if (Item != item) {
                roomDescript = allRooms.getRoomFromID(movingToRoom).getLockedRoomDescription();

            }
            else if (Item == item) {
                this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(1);
                roomDescript = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
                Log.i ("testing room descript", roomDescript);
                backUpRoomDescription = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
            }
        }
        updateStoryFragment();
    }
    public void bottomLeftButtonClickHandaler(View view) {
        for (int i = 0; i < PlayerItems.size(); i++) {
            int item = PlayerItems.get(i);
            int movingToRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(2);
            Item = allRooms.getRoomFromID(movingToRoom).getRequiredItem();
            if (Item != item) {
                roomDescript = allRooms.getRoomFromID(movingToRoom).getLockedRoomDescription();

            }
            else if (Item == item) {
                this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(2);
                roomDescript = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
                Log.i ("testing room descript", roomDescript);
                backUpRoomDescription = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
            }
        }

        updateStoryFragment();

    }
    public void bottomRightButtonClickHandaler(View view) {
        for (int i = 0; i < PlayerItems.size(); i++) {
            int item = PlayerItems.get(i);
            int movingToRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(3);
            Item = allRooms.getRoomFromID(movingToRoom).getRequiredItem();
            if (Item != item) {
                roomDescript = allRooms.getRoomFromID(movingToRoom).getLockedRoomDescription();
            }
            else if (Item == item) {
                this.PlayerRoom = allRooms.getRoomFromID(this.PlayerRoom).getConnectedRoomID(3);
                roomDescript = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
                Log.i ("testing room descript", roomDescript);
                backUpRoomDescription = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();
            }
        }
        updateStoryFragment();
    }

    public String roomAndInspectText()
    {
        return  allRooms.getRoomFromID(PlayerRoom).getRoomDescription() + "\n\n" +allRooms.getRoomFromID(PlayerRoom).getRoomInspection();
    }


   public void inspectButtonHandler(View view)
    {
        TextView Inspect = (TextView) StoryFragment.getActivity().findViewById(R.id.main_text_id);
        Inspect.setText(roomAndInspectText() + "\n"
        + allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][0]
        + "\n" + allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][1]
        + "\n" + allRooms.getRoomFromID(PlayerRoom).getOptions(PlayerClass)[Classid][2]);
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

    public String getPlayerRoomName()
    {
        return allRooms.getRoomFromID(PlayerRoom).getRoom();

    }
    public String getRoomDescription()
    {
      //  roomDescript = allRooms.getRoomFromID(PlayerRoom).getRoomDescription();

        Log.i ("teng DROOOfbdfbgr222", roomDescript);
        if (roomDescript.equals("") || roomDescript.equals(null))
        {
            roomDescript = backUpRoomDescription;
        }
        return roomDescript;

    }

    public String getRoomInspection()
    {
        return allRooms.getRoomFromID(PlayerRoom).getRoomInspection();
    }

    public void option1ButtonHandler(View view)
    {
        roomDescript = roomAndInspectText() + "\n" + allRooms.getRoomFromID(PlayerRoom).getOptionText()[Classid][0];
        if (allRooms.getRoomFromID(PlayerRoom).getRoomItems()[Classid][0] != 0) {
            PlayerItems.add(allRooms.getRoomFromID(PlayerRoom).getRoomItems()[Classid][0]);
        }
        updateStoryFragment();


    }
    public void option2ButtonHandler(View view)
    {
        roomDescript = roomAndInspectText() + "\n" + allRooms.getRoomFromID(PlayerRoom).getOptionText()[Classid][1];
        if (allRooms.getRoomFromID(PlayerRoom).getRoomItems()[Classid][1] != 0) {
            PlayerItems.add(allRooms.getRoomFromID(PlayerRoom).getRoomItems()[Classid][1]);
        }
        updateStoryFragment();
    }
    public void option3ButtonHandler(View view)
    {
        roomDescript = roomAndInspectText() + "\n" + allRooms.getRoomFromID(PlayerRoom).getOptionText()[Classid][2];
        if (allRooms.getRoomFromID(PlayerRoom).getRoomItems()[Classid][0] != 0) {
            PlayerItems.add(allRooms.getRoomFromID(PlayerRoom).getRoomItems()[Classid][0]);
        }
       updateStoryFragment();
    }
}
