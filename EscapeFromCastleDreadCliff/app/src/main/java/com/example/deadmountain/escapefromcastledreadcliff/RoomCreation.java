package com.example.deadmountain.escapefromcastledreadcliff;

import java.util.ArrayList;

/**
 * Created by Jai on 14/03/2017.
 */

public class RoomCreation {
    int roomID = 0;
    private ArrayList<Room> allRooms;

    public void createAllRooms() {
        allRooms = new ArrayList<Room>();
        //allRooms.add(new Room ("You are in a dark dungeon", roomID, "Dungeon"));
        Room gameRooms = new Room ("You are in a dark dungeon", roomID, "Dungeon");
        allRooms.add(roomID, gameRooms);
        roomID++;
        // basic skeleton of how each room will be made

    }

    public Room getRoomFromID(int roomID) {
        return allRooms.get(roomID);
    }
}
