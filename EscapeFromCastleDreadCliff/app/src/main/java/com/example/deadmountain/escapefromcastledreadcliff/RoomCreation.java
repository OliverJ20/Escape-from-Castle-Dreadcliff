package com.example.deadmountain.escapefromcastledreadcliff;

import java.util.ArrayList;

/**
 * Created by Jai on 14/03/2017.
 */

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
public class RoomCreation {
    private ArrayList<Room> allRooms;

    public void createAllRooms() {
        allRooms = new ArrayList<Room>();

        allRooms.add(0, new Room ("You are in a dark dungeon", 0, "Dungeon", 1, 2,0,0,0,"", "S", "", "", ""));
     /*   allRooms.add(1, new Room ("Torture Room", 1, "Torture Room", 1, 2,0,0,0));
        allRooms.add(2, new Room ("Hallway", 2, "Hallway", 4,1,3,4,0));
        allRooms.add(3, new Room ("Storage Room", 3, "Storage Room", 1, 2,0,0,0));
        allRooms.add(4, new Room ("Guest bedroom", 4, "Guest Bedroom", 1, 5,0,0,0));
        allRooms.add(5, new Room ("stairs 1st floor", 5, "stairs 1st floor", 4, 4,9,6,2));
        allRooms.add(6, new Room ("pantry", 6, "pantry", 2, 10,5,0,0));*/

        // basic skeleton of how each room will be made





    }

    public Room getRoomFromID(int roomID) {
        return allRooms.get(roomID);
    }
}
