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
    private String[][] inspectChoices = new String[3][4];
    private int maxButtons = 4;
    private String[][] Options = new String[3][3];
    private String[] Option1 = new String[11];
    private String[] Option2 = new String[11];
    private String[] Option3 = new String[11];



    //constructor
    public Room(String inspect, int id, String name, int connectedRooms, int room1, int room2, int room3, int room4, String Drt1, String Drt2, String Drt3, String Drt4, String roomDescription, String roomInspect ) {
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
       //option1 = Option1;



    }
   // public String[] getOption1(){return Option1;}
    public String getConnectRooms(int roomIndex)

    {
        return this.roomDirections[roomIndex];
    }
    public String getRoomDescription()
    {
        return roomDescript;
    }
    public String getRoomInspection() { return roomInspection;}

    public String getRoom() {
        return  roomName;
    }

    public String [][] getRoomOptions(String playerClass)
    {
        if (playerClass == "Barbarian")
        {
            //THE INDEX RELATES TO THE ROOM ID NUMBER
            this.Option1[0] = "Attempt to open cell door";
            this.Option1[1] = "Touch the table";
            this.Option1[2] = "Take a torch";
            this.Option1[3] = "pick up a weapon";
            this.Option1[4] = "kick door";
            this.Option1[5] = "break down the guest room door";
            this.Option1[6] = "kick door";
            this.Option1[7] = "kick door";
            this.Option1[8] = "kick door";
            this.Option1[9] = "kick door";
            this.Option1[10] = "";

            this.Option2[0] = "break down the cell bars";
            this.Option2[1] = "kick door";
            this.Option2[2] = "kick door";
            this.Option2[3] = "kick door";
            this.Option2[4] = "kick door";
            this.Option2[5] = "follow your nose";
            this.Option2[6] = "kick door";
            this.Option2[7] = "kick door";
            this.Option2[8] = "kick door";
            this.Option2[9] = "kick door";
            this.Option2[10] = "kick door";

            this.Option3[0] = "";
            this.Option3[1] = "kick door";
            this.Option3[2] = "";
            this.Option3[3] = "kick door";
            this.Option3[4] = "";
            this.Option3[5] = "kick door";
            this.Option3[6] = "kick door";
            this.Option3[7] = "kick door";
            this.Option3[8] = "kick door";
            this.Option3[9] = "kick door";
            this.Option3[10] = "kick door";
           /* if (getRoom() == "Dungeon")
            {
                this.Options[0] = "you kick in the door";
                this.Options[1] = "you end your life";
                this.Options[2] = "dance";
                return this.Options;
            }*/
            this.Options[0] = this.Option1;
            this.Options[1] = this.Option2;
            this.Options[2] = this.Option3;
            return this.Options;
        }
        /*if (playerClass == "Mage")
        {
            if (getRoom() == "Dungeon")
            {
                this.Options[0] = "cast magic";
                this.Options[1] = "put on pointy hat";
                this.Options[2] = "lick staff";
                return this.Options;
            }
        }
        if (playerClass == "Rogue")
        {
            if (getRoom() == "Dungeon")
            {
                this.Options[0] = "sneak in da back";
                this.Options[1] = "drink posion";
                this.Options[2] = "party";
                return this.Options;
            }
        }*/

            return null;

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
    /*public String[] getInspectRooms(String playerClass)
    {
        if (playerClass == "Barbarian")
        {

        }
    }*/
}
