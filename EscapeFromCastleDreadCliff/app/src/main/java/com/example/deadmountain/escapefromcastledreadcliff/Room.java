package com.example.deadmountain.escapefromcastledreadcliff;

/**
 * Created by Jai on 10/03/2017.
 */

public class Room {
    private String inspectTheRoom = "";
    private int roomID = 0;
    private String roomName = "";

    //constructor
    public Room(String a, int b, String c)
    {
        inspectTheRoom = a; ///We can have it so you call rooms to set all the room info or we could have present inspect room variables
        ///setup that we insert
        ///I also assume that when the onclick is called to move the player is when the Rooms will be called to setup the new room.
        roomID = b;
        roomName = c;
    }

    public String getRoom()
    {
        return  roomName;
    }
    public String getRoomInspect()
    {
        return inspectTheRoom;
    }
    public int getRoomID()
    {
        return roomID;
    }
}
