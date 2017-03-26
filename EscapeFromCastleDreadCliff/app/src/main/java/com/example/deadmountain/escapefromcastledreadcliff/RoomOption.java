package com.example.deadmountain.escapefromcastledreadcliff;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Jai on 23/03/2017.
 */

public class RoomOption {
    private String[][] RoomOptions = new String[3][3];
    private String[][] RoomOptions2 = new String[3][3];
    private String[][] roomOptionDisplayText = new String[3][3];
    private int[][] RoomItems = new int [3][3];
    public void AddRoomOptions (ArrayList<Room> allRooms) {
        RoomOptions2[0][0] = "Option1 open door";
        RoomOptions2[0][1] = "Option2 kick door in";
        RoomOptions2[0][2] = "Option3 Look out the window";
        roomOptionDisplayText [0][0] = "the door is locked idiot";
        roomOptionDisplayText [0][1] = "you make your own door wow";
        roomOptionDisplayText [0][2] = "As you stare out of the single window of your cell, you are greating by the familiar light of thunder, its sound shaking the very walls.\n" +
                               "It also reveals that below you are many large sharp rocks, jumping out the window is probably not the best idea.";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 002;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 open the cell door";
        RoomOptions2[1][1] = "Option2 cast fireball";
        RoomOptions2[1][2] = "Option3 Look out the window";
        roomOptionDisplayText [1][0] = "the door is locked idiot";
        roomOptionDisplayText [1][1] = "You extend your hands, chanting arcanic words, as your hands begin to glow" +
                "a small ball of fire explodes from your hands, blasting the lock.";
        roomOptionDisplayText [1][2] = "As you stare out of the single window of your cell, you are greating by the familiar light of thunder, its sound shaking the very walls." +
                "\nIt also reveals that below you are many large sharp rocks, jumping out the window is probably not the best idea. ";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 002;
        RoomItems[1][2] = 0;


        RoomOptions2[2][0] = "Option1 open the cell door";
        RoomOptions2[2][1] = "Option2 Attempt to pick lock the door";
        RoomOptions2[2][2] = "Option3 Look out the window";
        roomOptionDisplayText [2][0] = "the door is locked idiot";
        roomOptionDisplayText [2][1] = "You pull out a trusty bobby pin from your hair, keep it secret keep it safe as you always say.\n" +
                "Using the bobby pin and putting years of training as a thief to work, you pick lock the cell door, which opens wide before you.";
        roomOptionDisplayText [2][2] = "As you stare out of the single window of your cell, you are greating by the familiar light of thunder, its sound shaking the very walls." +
                "\nIt also reveals that below you are many large sharp rocks, jumping out the window is probably not the best idea. ";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 002;
        RoomItems[2][2] = 0;



        allRooms.get(0).AddOptions(RoomOptions2);
        allRooms.get(0).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(0).AddRoomItems(RoomItems);

        //Torture room

        RoomOptions2[0][0] = "Option1 Pick up a torture tool";
        RoomOptions2[0][1] = "Option2 Lay on the table";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "You reach to pick a sharpe tool from a rack, however has you try to pull it off you are unable to." +
                "\nUsing all your might you simply can't remove one of these tools, something has bound them to this spot.";
        roomOptionDisplayText [0][1] = "As you lie down on the table, in a room stained with blood all around you ask yourself 'why?'";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Cast a arcania spell";
        RoomOptions2[1][1] = "Option2 Lay on the table";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "The ominousness precnese of this room has put you on edge, you start to cast a spell call detect magic." +
                "\nbegining to chant once more, runes start floating around you and with a sudden clap of your hands they explode out lighting the room in a blue aura." +
                "\nWhatever has happened in this room, it is coated with incredible magic everywhere, blinding you with blue light till the effect of the spells fades away.";
        roomOptionDisplayText [1][1] = "As you lie down on the table, in a room stained with blood all around you ask yourself 'why?'";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;


        RoomOptions2[2][0] = "Option1 Inspect the asortment of tools along the wall";
        RoomOptions2[2][1] = "Option2 Lay on the table";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "As you inspect the tools, you recognize quiet a few of them from dealings in the past." +
                "\nThe more you notice however the more you realize, this room was not used to gain information, it was used to gain pleasure out of others pain.";
        roomOptionDisplayText [2][1] = "As you lie down on the table, in a room stained with blood all around you ask yourself 'why?'";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(1).AddOptions(RoomOptions2);
        allRooms.get(1).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(1).AddRoomItems(RoomItems);

        //Hallway
        RoomOptions2[0][0] = "Option1 Take one of the torches";
        RoomOptions2[0][1] = "";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "You take one of the torches of the wall, you now have a source of light with you.";
        roomOptionDisplayText [0][1] = "";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 003;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Take one of the torches";
        RoomOptions2[1][1] = "";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "You take one of the torches of the wall, you now have a source of light with you.";
        roomOptionDisplayText [1][1] = "";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 003;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "Option1 Take one of the torches";
        RoomOptions2[2][1] = "";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "You take one of the torches of the wall, you now have a source of light with you.";
        roomOptionDisplayText [2][1] = "";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 003;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(2).AddOptions(RoomOptions2);
        allRooms.get(2).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(2).AddRoomItems(RoomItems);

        //Storage room
        RoomOptions2[1][0] = "Option1 search for a suitable weapon";
        RoomOptions2[1][1] = "Option2 search for some clothes";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "As you pick up rusted weapon after rested weapon you finally set your eyes on a glorious wooden stick. You take the stick";
        roomOptionDisplayText [1][1] = "You look around the storage room, opening crates in the hopes of something better then rags." +
                "\nafter all your searching you find a old dented steel helmet, it isn't much but it fits, 'ah these rags are fine anyway, they show of my ripped muscles' you say to yourself" +
                "\ntrying to convience yourself your not insecure about being in rags.";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;



        RoomOptions2[1][0] = "Option1 search for a suitable weapon";
        RoomOptions2[1][1] = "Option2 search for some clothes";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "You find a wooden stick, its feels right in your hand";
        roomOptionDisplayText [1][1] = "You look around the storage room, opening crates in the hopes of something better then rags." +
                "\nafter all your searching you find a dirty old black robe, covered in dust and spots of blood, with letters intitched that you don't recognize." +
                "\n'Its better then rags you say' as you put on the old robe";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;


        RoomOptions2[1][0] = "Option1 search for a suitable weapon";
        RoomOptions2[1][1] = "Option2 search for some clothes";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "Inspecting the room you find that the only instrument useful in combat is a wooden stick in the corner." +
                "\nusing dull rusted weapons you eventually fiddle one end of the stick into some what of a point, you feel more comfotable having a piecing weapon in your hand " +
                "\nthen a bludgeoning one";
        roomOptionDisplayText [1][1] = "You look around the storage room, opening crates in the hopes of something better then rags." +
                "\nafter all your searching you find a dirty old black robe, covered in dust and spots of blood, with letters intitched that you don't recognize." +
                "\n'Its better then rags you say, least the black helps me blend into the shadows better' as you put on the old robe";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        allRooms.get(3).AddOptions(RoomOptions2);
        allRooms.get(3).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(3).AddRoomItems(RoomItems);



    }
}
