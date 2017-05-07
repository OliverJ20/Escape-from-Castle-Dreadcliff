package com.example.deadmountain.escapefromcastledreadcliff;

/**
 * Created by Jai on 10/03/2017.
 */

import java.util.ArrayList;

import android.graphics.Path;
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


public class Room {
    private String inspectTheRoom = "";
    private int roomID = 0;
    private String roomDescript = "";
    private String roomInspection ="";
    private String roomName = "";
    private String barbarianInspect = ", your a barbarian";
    private String mageInspect = ", your a mage";
    private String rogueInspect = ",  your a rogue";
    private int connectedRoomsTotal = 0; // maximum of 4
    private String roomDirectionsTotal = "";
    private int[] connectedRooms = new int[4];
    private String[] roomDirections = new String[4];
    private String[][] inspectChoices = new String[3][3];
    private String[][] Options = new String[3][3];
    private String[][] OptionsText = new String[3][3];
    private int[][]RoomItem = new int [3][3];
    private String[] Option1 = new String[11];
    private String[] Option2 = new String[11];
    private String[] Option3 = new String[11];
    private String option1Test = "";
    private int requiredItem = 0;
    private String lockedRoomDescription = "";



    //constructor
    public Room(String inspect, int id, String name, int connectedRooms, int room1, int room2, int room3, int room4, String Drt1, String Drt2, String Drt3, String Drt4, String roomDescription, String roomInspect,String LockedRoomDescription, int RequiredItem ) {
        inspectTheRoom = inspect;
        roomID = id;
        roomName = name;
        roomDescript = roomDescription;
        roomInspection = roomInspect;
        this.connectedRoomsTotal = connectedRooms;
        this.connectedRooms[0] = room1;
        this.connectedRooms[1] = room2;
        this.connectedRooms[2] = room3;
        this.connectedRooms[3] = room4;

        this.roomDirections[0] = Drt1;
        this.roomDirections[1] = Drt2;
        this.roomDirections[2] = Drt3;
        this.roomDirections[3] = Drt4;

        requiredItem = RequiredItem;
        lockedRoomDescription = LockedRoomDescription;
    }

    public String getLockedRoomDescription()
    {
        return lockedRoomDescription;
    }
    public int getRequiredItem()
    {
        return requiredItem;
    }
    public String getConnectRooms(int roomIndex)

    {
        return this.roomDirections[roomIndex];
    }
    public String getRoomDescription()
    {
        return this.roomDescript;
    }
    public String getRoomInspection() { return roomInspection;}

    public String getRoom() {
        return  roomName;
    }
    public void AddOptionsDisplayText (String [][] optionText)
    {
        this.OptionsText[0][0] = optionText[0][0];
        this.OptionsText[0][1] = optionText[0][1];
        this.OptionsText[0][2] = optionText[0][2];
        this.OptionsText[1][0] = optionText[1][0];
        this.OptionsText[1][1] = optionText[1][1];
        this.OptionsText[1][2] = optionText[1][2];
        this.OptionsText[2][0] = optionText[2][0];
        this.OptionsText[2][1] = optionText[2][1];
        this.OptionsText[2][2] = optionText[2][2];
    }
    public String [][] getOptionText ()
    {
        return OptionsText;
    }
    public void AddRoomItems(int [][]roomItem)
    {
        this.RoomItem[0][0] = roomItem[0][0];
        this.RoomItem[0][1] = roomItem[0][1];
        this.RoomItem[0][2] = roomItem[2][2];
        this.RoomItem[1][0] = roomItem[0][0];
        this.RoomItem[1][1] = roomItem[1][1];
        this.RoomItem[1][2] = roomItem[2][2];
        this.RoomItem[2][0] = roomItem[0][0];
        this.RoomItem[2][1] = roomItem[1][1];
        this.RoomItem[2][2] = roomItem[2][2];

    }
    public int[][] getRoomItems()
    {
        return RoomItem;
    }

    public void AddOptions (String[][] option) {
        this.Options[0][0] = option[0][0];
        this.Options[0][1] = option[0][1];
        this.Options[0][2] = option[0][2];
        this.Options[1][0] = option[1][0];
        this.Options[1][1] = option[1][1];
        this.Options[1][2] = option[1][2];
        this.Options[2][0] = option[2][0];
        this.Options[2][1] = option[2][1];
        this.Options[2][2] = option[2][2];
        //this.Options = option;
    }
    public String [][] getOptions (String playerClass)
    {

        Log.i ("help test", Options[0][0]);
        Log.i ("helppppp test", Options[0][1]);
           return Options;


    }

    public String GetOption1Test () {
        return option1Test;
    }

    public String getRoomInspect(String playerClass) {
        String returnString = "";
        if(playerClass == "Barbarian") {
            returnString = inspectTheRoom + barbarianInspect;
        }
        else if(playerClass == "Mage") {
            returnString = inspectTheRoom + mageInspect;
        }
        else if(playerClass == "Rogue"){
            returnString = inspectTheRoom + rogueInspect;
        }
        else {
            returnString = "There has been an error there is no class set";
        }
        return returnString;
    }
    public int getRoomID() {
        return roomID;
    }
    public int getConnectedRoomID(int roomIndex) {
        return this.connectedRooms[roomIndex];
    }
    public void setClassInspect(String BarbarianInspect, String MageInspect, String RogueInspect) {
        this.barbarianInspect = BarbarianInspect;
        this.mageInspect = MageInspect;
        this.rogueInspect = RogueInspect;
    }

}
