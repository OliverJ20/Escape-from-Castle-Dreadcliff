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
    private int connectedRoomsTotal = 0; // maximum of 4
    private int[] connectedRooms = new int[4];


    //constructor
    public Room(String inspect, int id, String name) {
        inspectTheRoom = inspect;
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
