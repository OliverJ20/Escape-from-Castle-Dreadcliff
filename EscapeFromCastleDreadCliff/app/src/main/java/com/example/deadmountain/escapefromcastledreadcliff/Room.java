package com.example.deadmountain.escapefromcastledreadcliff;

/**
 * Created by Jai on 10/03/2017.
 */

public class Room {
    private String inspectTheRoom = "";
    private int roomID = 0;
    private String roomName = "";
    private String barbarianInspect = ", your a barbarian";
    private String mageInspect = ", your a mage";
    private String rogueInspect = ",  your a rogue";
    private int connectedRooms = 0; // maximum of 4


    //constructor
    public Room(String inspect, int id, String name)
    {
        inspectTheRoom = inspect; ///We can have it so you call rooms to set all the room info or we could have present inspect room variables
        ///setup that we insert
        ///I also assume that when the onclick is called to move the player is when the Rooms will be called to setup the new room.
        roomID = id;
        roomName = name;
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
}
