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
    private String[][] RoomOptions = new String[3][3];

    public void createAllRooms() {

        String dungeonDescription ="You awake to the sound of thunder echoing from outside" +
                "\nthe sound of rain hitting stone." +
                "\nYou find yourself in a small jail cell, with rust covering the bars." +
                "\nAs you peer into the surrounding darkness you see no one" +
                "\nthe room only being lit by brief cracks of thunder and light descending downwards from a stair case";

        String dungeonInspectDescription = "you are inspecting the old dungeon";



        String tortureDescription ="When you enter this room you are over come by the horrible smell of burnt flesh" +
                "\n a single flicking torch across from the door lights the room." +
                "\nDisplaying a large wooden table with hundreds of spikes in the center" +
                "\nwith an assurtment of tools in all manner of shapes and sizes placed neatly on the wall" ;
        String tortuInspectDescription = "you are inspecting the old torture";
        String lockedTortureDescription = "YOU CANT GET IN ";


        String hallwayDescription ="The hallway is well lit by several torches evenly spaced out along the walls";
        String hallwayInspectDescription = "you are inspecting the old hallway";
        String lockedHallwayDescription = dungeonDescription + "\n\n You attempt to leave your cell, only to be stopped by series of bars" +
                "who would of thought?";


        String storageDescription ="The room is shrouded in darkness, the only source of light" +
                "\n spilling in from the torches in the hallway" +
                "\n at first glance all you can make out are medium sized wooden constructs";
        String storageInspectDescription = "you are inspecting the old storage";
        String lockedStorageDescription = "You look into this room but it is shrouded in darkness, you can't make out anything";


        String stairs1stfloorDescription ="You feel like you are on the first floor" +
                "\nTorches line the walls and a vibrant red carpet stretches along the floors." +
                "\nThe carpet appears already ruined by your grimmy feet.";

        String guestDescription ="The room is lit by two candle stands besides a four poster bed." +
                "\nThe bed is covered in deep red colours of incredible quality" +
                "\nit seems fit for someone of royal blood.";

        String pantryDescription ="Rows of selves are filled with various breads, spices" +
                "\n,savourys and sweets." +
                "\nThe variance in food seems endless, it would be a master cooks" +
                "\ndream pantry";

        String stairsupwardsDescription ="You begin to climb the stairs upwards to the second floor" +
                "\nas you make your way to the top an incredible sense of dread takes hold of you";

        String waitingDescription ="The light from the outside storm briely lighting up the room through two large windows." +
                "\nThrough the flicks of light you can make out two lavish couches in the center" +
                "\nseperated by a rectangular coffee table of high quality.";

        String livingDescription ="The room is well lit from a chandelier in the center." +
                "\nA large blood red carpet with a picture of a dragon with out stetched wings" +
                "\ncovering nearly the entire floor";

        String kitchenDescription ="The kitchen appears to be covered in dust, lit from a small" +
                "\nchandelier in the center." +
                "\nPans are rusted through, knives as dull as clubs, stoves that appear to have not been used in years.";

        String frontdoorDescription ="You stand before a large wooden double door that appears to be your only hope of escape." +
                "However it seems to be reinforced with steel, being impossible for a single person to break down." +
                "\nThough there appears to be a keyhole in the center, there may be hope yet.";

        String dinningDescription ="A large table takes up most of the room, with three large candle sticks" +
                "\nproviding light to the room." +
                "\nA large feast appears to be on the table, with all sorts of fruits and meats" +
                "\ncovering all surfaces, with a large roasted pig in the middle";



        allRooms = new ArrayList<Room>();

        allRooms.add(0, new Room ("You are in a dark dungeon", 0, "Dungeon", 1, 2,0,0,0, "South", "", "", "",dungeonDescription, dungeonInspectDescription,"",0 ));
        allRooms.add(1, new Room ("Torture Room", 1, "Torture Room", 1, 2,0,0,0, "East", "", "", "",tortureDescription, tortuInspectDescription,lockedTortureDescription ,2));
        allRooms.add(2, new Room ("Hallway", 2, "Hallway", 4,1,3,5,0,"West", "East", "South", "North",hallwayDescription,hallwayInspectDescription,lockedHallwayDescription,2));
        allRooms.add(3, new Room ("Storage Room", 3, "Storage Room", 1, 2,0,0,0,"West", "", "", "",storageDescription,storageInspectDescription,lockedStorageDescription,3));
        allRooms.add(4, new Room ("Guest bedroom", 4, "Guest Bedroom", 1, 5,0,0,0,"East", "", "", "",guestDescription, "","TEST HELP",0));
        allRooms.add(5, new Room ("stairs 1st floor", 5, "stairs 1st floor", 4, 9,4,6,2,"South", "West", "East", "North",stairs1stfloorDescription, "","TESTHLLLLL",0));
        allRooms.add(6, new Room ("pantry", 6, "pantry", 2, 5,10,0,0,"West", "South", "", "",pantryDescription,"","",0));
        allRooms.add(7, new Room ("Stairs leading upstairs", 7, "Stairs leading upstairs", 1, 9,0,0,0,"South East", "", "", "",stairsupwardsDescription,"","",0));
        allRooms.add(8, new Room ("Waiting room", 8, "Waiting room", 1, 11,0,0,0,"South East", "", "", "",waitingDescription,"","",0));
        allRooms.add(9, new Room ("Living room", 9, "Living room", 4, 11,12,7,5,"South", "South East", "North West", "North",livingDescription,"","",0));
        allRooms.add(10, new Room ("Kitchen", 10, "Kitchen", 2, 12,6,0,0,"South", "North", "", "",kitchenDescription,"","",0));
        allRooms.add(11, new Room ("Front door", 11, "Front door",3, 8,12,9,0,"North West", "South East", "North", "",frontdoorDescription,"","",0));
        allRooms.add(12, new Room ("Dinning room", 12, "Dinning room", 3, 9,11,10,0,"North West", "South West", "North", "",dinningDescription,"","",0));

    }

    public Room getRoomFromID(int roomID) {
        return allRooms.get(roomID);
    }

    public ArrayList<Room> getAllRooms() { return allRooms; }
}
