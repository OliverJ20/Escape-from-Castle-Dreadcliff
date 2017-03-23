package com.example.deadmountain.escapefromcastledreadcliff;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Jai on 23/03/2017.
 */

public class RoomOption {
    private String[][] RoomOptions = new String[3][3];
    private String[][] RoomOptions2 = new String[3][3];
    public void AddRoomOptions (ArrayList<Room> allRooms) {
        RoomOptions2[0][0] = "BarbarianOption1";
        RoomOptions2[0][1] = "BarbarianOption2";
        RoomOptions2[0][2] = "BarbarianOption3";
        RoomOptions2[1][0] = "MageOption1";
        RoomOptions2[1][1] = "MageOption2";
        RoomOptions2[1][2] = "MageOption3";
        RoomOptions2[2][0] = "RougeOption1";
        RoomOptions2[2][1] = "RougeOption2";
        RoomOptions2[2][2] = "RougeOption3";



        allRooms.get(0).AddOptions(RoomOptions2);

//        Log.i ("testing a thing", RoomOptions[0][0]);

        RoomOptions[0][0] = "BarbarianOption1TORT";
        RoomOptions[0][1] = "BarbarianOption2TORT";
        RoomOptions[0][2] = "BarbarianOption3TORT";
        RoomOptions[1][0] = "MageOption1TORT";
        RoomOptions[1][1] = "MageOption2TORT";
        RoomOptions[1][2] = "MageOption3TORT";
        RoomOptions[2][0] = "RougeOption1TORT";
        RoomOptions[2][1] = "RougeOption2TORT";
        RoomOptions[2][2] = "RougeOption3TORT";
        // Pass RoomOptions to room0

        allRooms.get(1).AddOptions(RoomOptions);
        Log.i ("testing a thing", RoomOptions[0][0]);



        // basic skeleton of how each room will be made
        RoomOptions[0][0] = "BarbarianOption1HALLWAY";
        RoomOptions[0][1] = "BarbarianOption2HALLWAY";
        RoomOptions[0][2] = "BarbarianOption3HALLWAY";
        RoomOptions[1][0] = "MageOption1HALLWAY";
        RoomOptions[1][1] = "MageOption2HALLWAY";
        RoomOptions[1][2] = "MageOption3HALLWAY";
        RoomOptions[2][0] = "RougeOption1HALLWAY";
        RoomOptions[2][1] = "RougeOption2HALLWAY";
        RoomOptions[2][2] = "RougeOption3HALLWAY";


        allRooms.get(2).AddOptions(RoomOptions);

        RoomOptions[0][0] = "BarbarianOption1STORAGE";
        RoomOptions[0][1] = "BarbarianOption2STORAGE";
        RoomOptions[0][2] = "BarbarianOption3STORAGE";
        RoomOptions[1][0] = "MageOption1TORTSTORAGE";
        RoomOptions[1][1] = "MageOption2TORTSTORAGE";
        RoomOptions[1][2] = "MageOption3TORTSTORAGE";
        RoomOptions[2][0] = "RougeOption1TORTSTORAGE";
        RoomOptions[2][1] = "RougeOption2STORAGE";
        RoomOptions[2][2] = "RougeOption3STORAGE";
        // Pass RoomOptions to room0

        allRooms.get(3).AddOptions(RoomOptions);
    }
}
