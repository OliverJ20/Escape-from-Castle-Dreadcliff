package com.example.deadmountain.escapefromcastledreadcliff;

/**
 * Created by Jai on 10/03/2017.
 */

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


public class Room {
    private String inspectTheRoom = "";
    private int roomID = 0;
    private String roomName = "";
    private String barbarianInspect = ", your a barbarian";
    private String mageInspect = ", your a mage";
    private String rogueInspect = ",  your a rogue";
    private int connectedRoomsTotal = 0; // maximum of 4
    private String roomDirectionsTotal = "";
    private int[] connectedRooms = new int[4];
    private String[] roomDirections = new String[4];
    private String[][] inspectChoices = new String[3][4];
    private int maxButtons = 4;


    //constructor
    public Room(String inspect, int id, String name, int connectedRooms, int room1, int room2, int room3, int room4, String roomDirections, String Drt1, String Drt2, String Drt3, String Drt4) {
        inspectTheRoom = inspect;
        roomID = id;
        roomName = name;
        this.connectedRoomsTotal = connectedRooms;
        this.connectedRooms[0] = room1;
        this.connectedRooms[1] = room2;
        this.connectedRooms[2] = room3;
        this.connectedRooms[3] = room4;

        this.roomDirectionsTotal = roomDirections;
        this.roomDirections[0] = Drt1;
        this.roomDirections[1] = Drt2;
        this.roomDirections[2] = Drt3;
        this.roomDirections[3] = Drt4;

    }
    public String getConnectRooms(int roomIndex)

    {
        return this.roomDirections[roomIndex];
    }

    public String getRoom() {
        return  roomName;
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
    public void setClassInspect(String BarbarianInspect, String MageInspect, String RogueInspect) {
        this.barbarianInspect = BarbarianInspect;
        this.mageInspect = MageInspect;
        this.rogueInspect = RogueInspect;
    }
    public String[] getinspectChoices(String playerClass) {
        int barbarian = 0;
        int mage = 1;
        int rogue = 2;
        String[] inspectChoices = new String[maxButtons];

        if(playerClass == "Barbarian") {
            for(int i = 0; i < maxButtons; i++) {
                inspectChoices[i] = this.inspectChoices[barbarian][i];
            }
        }
        else if(playerClass == "Mage") {
            for(int i = 0; i < maxButtons; i++) {
                inspectChoices[i] = this.inspectChoices[mage][i];
            }
        }
        else if(playerClass == "Rogue"){
            for(int i = 0; i < maxButtons; i++) {
                inspectChoices[i] = this.inspectChoices[rogue][i];
            }
        }
        else {
            for(int i = 0; i < maxButtons; i++) {
                inspectChoices[i] = "NULL";
            }
        }
        return  inspectChoices;
    }
}
