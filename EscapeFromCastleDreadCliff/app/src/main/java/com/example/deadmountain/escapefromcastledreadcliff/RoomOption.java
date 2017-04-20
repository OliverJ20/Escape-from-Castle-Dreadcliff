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
        RoomOptions2[0][0] = "Option1 Open the cell door";
        RoomOptions2[0][1] = "Option2 Attack the door";
        RoomOptions2[0][2] = "Option3 Look out the window";
        roomOptionDisplayText [0][0] = "the door is locked idiot";
        roomOptionDisplayText [0][1] = "you make your own door wow";
        roomOptionDisplayText [0][2] = "As you stare out of the single window of your cell, you are greating by the familiar light of thunder, its sound shaking the very walls.\n" +
                               "It also reveals that below you are many large sharp rocks, jumping out the window is probably not the best idea.";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 2;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Open the cell door";
        RoomOptions2[1][1] = "Option2 cast fireball";
        RoomOptions2[1][2] = "Option3 Look out the window";
        roomOptionDisplayText [1][0] = "the door is locked idiot";
        roomOptionDisplayText [1][1] = "You extend your hands, chanting arcanic words, as your hands begin to glow" +
                "a small ball of fire explodes from your hands, blasting the lock.";
        roomOptionDisplayText [1][2] = "As you stare out of the single window of your cell, you are greating by the familiar light of thunder, its sound shaking the very walls." +
                "\nIt also reveals that below you are many large sharp rocks, jumping out the window is probably not the best idea. ";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 2;
        RoomItems[1][2] = 0;


        RoomOptions2[2][0] = "Option1 Open the cell door";
        RoomOptions2[2][1] = "Option2 Attempt to pick lock the door";
        RoomOptions2[2][2] = "Option3 Look out the window";
        roomOptionDisplayText [2][0] = "the door is locked idiot";
        roomOptionDisplayText [2][1] = "You pull out a trusty bobby pin from your hair, keep it secret keep it safe as you always say.\n" +
                "Using the bobby pin and putting years of training as a thief to work, you pick lock the cell door, which opens wide before you.";
        roomOptionDisplayText [2][2] = "As you stare out of the single window of your cell, you are greating by the familiar light of thunder, its sound shaking the very walls." +
                "\nIt also reveals that below you are many large sharp rocks, jumping out the window is probably not the best idea. ";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 2;
        RoomItems[2][2] = 0;



        allRooms.get(0).AddOptions(RoomOptions2);
        allRooms.get(0).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(0).AddRoomItems(RoomItems);

        //Torture room

        RoomOptions2[0][0] = "Option1 Pick up a torture tool";
        RoomOptions2[0][1] = "Option2 Lay on the table";
        RoomOptions2[0][2] = "Option3 Pick up bloody tool";
        roomOptionDisplayText [0][0] = "You reach to pick a sharpe tool from a rack, however has you try to pull it off you are unable to." +
                "\nUsing all your might you simply can't remove one of these tools, something has bound them to this spot.";
        roomOptionDisplayText [0][1] = "As you lie down on the table, in a room stained with blood all around you ask yourself 'why?'";
        roomOptionDisplayText [0][2] = "Pick up bloody tool";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 4;


        RoomOptions2[1][0] = "Option1 Cast a arcania spell";
        RoomOptions2[1][1] = "Option2 Lay on the table";
        RoomOptions2[1][2] = "Option3 Pick up bloody tool";
        roomOptionDisplayText [1][0] = "The ominousness precnese of this room has put you on edge, you start to cast a spell call detect magic." +
                "\nbegining to chant once more, runes start floating around you and with a sudden clap of your hands they explode out lighting the room in a blue aura." +
                "\nWhatever has happened in this room, it is coated with incredible magic everywhere, blinding you with blue light till the effect of the spells fades away.";
        roomOptionDisplayText [1][1] = "As you lie down on the table, in a room stained with blood all around you ask yourself 'why?'";
        roomOptionDisplayText [1][2] = "ya pick up the tool";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 4;


        RoomOptions2[2][0] = "Option1 Inspect the asortment of tools along the wall";
        RoomOptions2[2][1] = "Option2 Lay on the table";
        RoomOptions2[2][2] = "Option3 Pick up bloody tool";
        roomOptionDisplayText [2][0] = "As you inspect the tools, you recognize quiet a few of them from dealings in the past." +
                "\nThe more you notice however the more you realize, this room was not used to gain information, it was used to gain pleasure out of others pain.";
        roomOptionDisplayText [2][1] = "As you lie down on the table, in a room stained with blood all around you ask yourself 'why?'";
        roomOptionDisplayText [2][2] = "ya pick up the tool";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 4;



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
        RoomOptions2[0][0] = "Option1 search for a suitable weapon";
        RoomOptions2[0][1] = "Option2 search for some clothes";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "As you pick up rusted weapon after rested weapon you finally set your eyes on a glorious wooden stick. You take the stick";
        roomOptionDisplayText [0][1] = "You look around the storage room, opening crates in the hopes of something better then rags." +
                "\nafter all your searching you find a old dented steel helmet, it isn't much but it fits, 'ah these rags are fine anyway, they show of my ripped muscles' you say to yourself" +
                "\ntrying to convience yourself your not insecure about being in rags.";
        roomOptionDisplayText [1][2] = "";
        RoomItems[0][0] = 5;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;



        RoomOptions2[1][0] = "Option1 search for a suitable weapon";
        RoomOptions2[1][1] = "Option2 search for some clothes";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "You find a wooden stick, its feels right in your hand";
        roomOptionDisplayText [1][1] = "You look around the storage room, opening crates in the hopes of something better then rags." +
                "\nafter all your searching you find a dirty old black robe, covered in dust and spots of blood, with letters intitched that you don't recognize." +
                "\n'Its better then rags you say' as you put on the old robe";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 5;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;


        RoomOptions2[2][0] = "Option1 search for a suitable weapon";
        RoomOptions2[2][1] = "Option2 search for some clothes";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "Inspecting the room you find that the only instrument useful in combat is a wooden stick in the corner." +
                "\nusing dull rusted weapons you eventually fiddle one end of the stick into some what of a point, you feel more comfotable having a piecing weapon in your hand " +
                "\nthen a bludgeoning one";
        roomOptionDisplayText [2][1] = "You look around the storage room, opening crates in the hopes of something better then rags." +
                "\nafter all your searching you find a dirty old black robe, covered in dust and spots of blood, with letters intitched that you don't recognize." +
                "\n'Its better then rags you say, least the black helps me blend into the shadows better' as you put on the old robe";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 5;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;

        allRooms.get(3).AddOptions(RoomOptions2);
        allRooms.get(3).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(3).AddRoomItems(RoomItems);

        //guest room

        RoomOptions2[0][0] = "Option1 Lie down in the bed";
        RoomOptions2[0][1] = "";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "You lie down on perhaps the softest matress you have ever slept on, dirtying all the fine bed sheets layed out." +
                "\nAlthough nice at first the bed begins to itch and you decide it might be better to keep going then taking a nap";
        roomOptionDisplayText [0][1] = "";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Lie down in the bed";
        RoomOptions2[1][1] = "";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "You lie down on perhaps the softest matress you have ever slept on, dirtying all the fine bed sheets layed out." +
                "\nAlthough nice at first the bed begins to itch and you decide it might be better to keep going then taking a nap";
        roomOptionDisplayText [1][1] = "";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;


        RoomOptions2[2][0] = "Option1 Lie down in the bed";
        RoomOptions2[2][1] = "Look for something to steal";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "You lie down on perhaps the softest matress you have ever slept on, dirtying all the fine bed sheets layed out." +
                "\nAlthough nice at first the bed begins to itch and you decide it might be better to keep going then taking a nap";
        roomOptionDisplayText [2][1] = "You begin to search the room more thoroughly, however all you seem to find is a small rabbit doll." +
                "Thinking it potentially has emotional value to someone over monetary you decide to keep it";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 6;
        RoomItems[2][2] = 0;



        allRooms.get(4).AddOptions(RoomOptions2);
        allRooms.get(4).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(4).AddRoomItems(RoomItems);


        //first floor

        RoomOptions2[0][0] = "Option1 Attempt to open the guest room door";
        RoomOptions2[0][1] = "Option2 Take another torch";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "Putting years of combat expierence and training into action you decide to run at the door with everything you have. Yelling a fierce battle cry you shoulder slam into the wooden door." +
                "\nThe door being clearly no match for you crumbles before you, as you burst into the room. You pick yourself up feeling mighty proud of you, not noticing all the small pieces of wood stabbed into your body.";
        roomOptionDisplayText [0][1] = "You pick a torch, hopefully this doesn't become a problem";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 4;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;



        RoomOptions2[0][0] = "Option1 Attempt to open the guest room door";
        RoomOptions2[0][1] = "Option2 Take another torch";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "You walk up to the guest room door, thinking back to the old days, 5 minutes ago were you broke up your cell door you cast fireball." +
                "\n Working in a similiar fashion you cast the spell and fire explodes from your hand, blasting the poor wooden door like apart. ";
        roomOptionDisplayText [0][1] = "You pick a torch, hopefully this doesn't become a problem";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 4;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;



        RoomOptions2[0][0] = "Option1 Attempt to open the guest room door";
        RoomOptions2[0][1] = "Option2 Take another torch";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [2][0] = "Walking up to the locked door, you pull out the same hair pin as before and being working your magic. After a minute or so you hear the familiar click and the door swings open.";
        roomOptionDisplayText [2][1] = "You pick a torch, hopefully this doesn't become a problem";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 4;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;


        allRooms.get(5).AddOptions(RoomOptions2);
        allRooms.get(5).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(5).AddRoomItems(RoomItems);

        // Pantry

        RoomOptions2[0][0] = "Option1 Eat some of the food anyway";
        RoomOptions2[0][1] = "";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "It tastes as you expect, like shit, as soon as it touched your tongue you convulsed and spat it out, almost vomitting.";
        roomOptionDisplayText [0][1] = "";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Cast detect magic";
        RoomOptions2[1][1] = "";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "You stretch out your hands can whisper the familiar words of the spell. As you cast the spell all the food begins to glow a bright blue, confirming that some spell was cast of the food to make it seem fresh and appealing.";
        roomOptionDisplayText [1][1] = "";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "Option1 Take some of the rotten food";
        RoomOptions2[2][1] = "";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "For reasons your not entirely sure, perhaps to feed your inner klepto, you pocket some rotten apple cores and moldy bread.";
        roomOptionDisplayText [2][1] = "";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(6).AddOptions(RoomOptions2);
        allRooms.get(6).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(6).AddRoomItems(RoomItems);

        //Stairs leading upwards
        RoomOptions2[0][0] = "";
        RoomOptions2[0][1] = "";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "";
        roomOptionDisplayText [0][1] = "";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "";
        RoomOptions2[1][1] = "";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "";
        roomOptionDisplayText [1][1] = "";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "";
        RoomOptions2[2][1] = "";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "";
        roomOptionDisplayText [2][1] = "";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(7).AddOptions(RoomOptions2);
        allRooms.get(7).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(7).AddRoomItems(RoomItems);

        //waiting room
        RoomOptions2[0][0] = "Option1 Take the picture";
        RoomOptions2[0][1] = "Option2 drink the tea";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "As you pick up the photo, a feeling of familiarity washes over you, you swear you have seen this women before but you can't put a name to face.";
        roomOptionDisplayText [0][1] = "As you sip the tea, it is very cold, it must of been sitting here for hours, maybe even days. ";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 7;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Take the picture";
        RoomOptions2[1][1] = "Option2 drink the tea";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "As you pick up the photo, a feeling of familiarity washes over you, you swear you have seen this women before but you can't put a name to face.";
        roomOptionDisplayText [1][1] = "As you sip the tea, it is very cold, it must of been sitting here for hours, maybe even days. ";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 7;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "Option1 Take the picture";
        RoomOptions2[2][1] = "Option2 drink the tea";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "As you pick up the photo, a feeling of familiarity washes over you, you swear you have seen this women before but you can't put a name to face.";
        roomOptionDisplayText [2][1] = "As you sip the tea, it is very cold, it must of been sitting here for hours, maybe even days. ";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 7;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(8).AddOptions(RoomOptions2);
        allRooms.get(8).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(8).AddRoomItems(RoomItems);


        //Living room
        RoomOptions2[0][0] = "Option1 Attack the carpet";
        RoomOptions2[0][1] = "";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "Reeling back from what you saw, your fear turns to anger and you begin attacking the carpet, ripping it up and cutting it. However not to long after your senseless violence, you hear a mighty roar that deafens your ears." +
                "\nAs you recoil backwards, you look back down at the carpet seeing that it is in perfect condition once again, not a single mark anywhere.";
        roomOptionDisplayText [0][1] = "";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Cast a spell";
        RoomOptions2[1][1] = "";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "Fearing what just took place you go to summon your magic, however as you out stretch your hands, the carpet appears to glow a faint red." +
                "\nAs you cast your spell nothing happens, leaving you confused and even more fearful of your situation.";
        roomOptionDisplayText [1][1] = "";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "";
        RoomOptions2[2][1] = "";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "";
        roomOptionDisplayText [2][1] = "";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(9).AddOptions(RoomOptions2);
        allRooms.get(9).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(9).AddRoomItems(RoomItems);


        //kitchen
        RoomOptions2[0][0] = "";
        RoomOptions2[0][1] = "";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "";
        roomOptionDisplayText [0][1] = "";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "";
        RoomOptions2[1][1] = "";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "";
        roomOptionDisplayText [1][1] = "";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "";
        RoomOptions2[2][1] = "";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "";
        roomOptionDisplayText [2][1] = "";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(10).AddOptions(RoomOptions2);
        allRooms.get(10).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(10).AddRoomItems(RoomItems);


        //front door
        RoomOptions2[0][0] = "Option1 Attack the door.";
        RoomOptions2[0][1] = "";
        RoomOptions2[0][2] = "";
        roomOptionDisplayText [0][0] = "Ignore your better judge you try slamming into the door, however it doesn't budge, and your body starts to ache.";
        roomOptionDisplayText [0][1] = "";
        roomOptionDisplayText [0][2] = "";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Cast fireball";
        RoomOptions2[1][1] = "";
        RoomOptions2[1][2] = "";
        roomOptionDisplayText [1][0] = "'Nothing can stop my magic' you shout, as you cast old faithful ball at the door, however as the fire hits the door it explodes backwards nearly hitting you. " +
                "\nThe door then rippling a light blue aura from the impact point.";
        roomOptionDisplayText [1][1] = "";
        roomOptionDisplayText [1][2] = "";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "Option1 picklock the door";
        RoomOptions2[2][1] = "";
        RoomOptions2[2][2] = "";
        roomOptionDisplayText [2][0] = "Once more you pull out your hair pin to picklock the door, however staring at the pin in your hand and the lock, you realize that this wouldn't work and could break your pin." +
                "\nit wasn't worth the risk.";
        roomOptionDisplayText [2][1] = "";
        roomOptionDisplayText [2][2] = "";
        RoomItems[2][0] = 003;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(11).AddOptions(RoomOptions2);
        allRooms.get(11).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(11).AddRoomItems(RoomItems);

        //dinning room
        RoomOptions2[0][0] = "Option1 Take a bite of food";
        RoomOptions2[0][1] = "Option2 Take a bite of the pig";
        RoomOptions2[0][2] = "Option3 Throw some food on the ground";
        roomOptionDisplayText [0][0] = "You take a bit of some chicken on the table that looks so delicious, as bite into however, you realize it is rotten and crawling with maggots, unable to control yourself you spit it out and vommit all of the table." +
                "\nScraping your tongue of the foul food you just placed there.";
        roomOptionDisplayText [0][1] = "You cut a piece out of the big and put a big chunk in your mouth. Mere moments afters putting it in your mouth you chew, a sickly horrid feeling over comes you. As you spit what is now a horrid rotten piece of meat you look at the big." +
                "\nWhat appeared to be a lovely roasted pig, to your horror is the corpse of an unrecognisable man, in whicb you have just carved a large chunk out of his chest.";
        roomOptionDisplayText [0][2] = "Going agasint your gut you grab some of the food and throw it to the ground, stomping on it just to be safe. As you lean down to look at it you realized the food is all rotten and crawlling with maggots." +
                "\nDespite what it appears you quickly decern that the food infront of you is all rotten. ";
        RoomItems[0][0] = 0;
        RoomItems[0][1] = 0;
        RoomItems[0][2] = 0;


        RoomOptions2[1][0] = "Option1 Take a bite of food";
        RoomOptions2[1][1] = "Option2 Take a bite of the pig";
        RoomOptions2[1][2] = "Option3 Cast magic";
        roomOptionDisplayText [1][0] = "You take a bit of some chicken on the table that looks so delicious, as bite into however, you realize it is rotten and crawling with maggots, unable to control yourself you spit it out and vommit all of the table." +
                "\nScraping your tongue of the foul food you just placed there.";
        roomOptionDisplayText [1][1] = "You cut a piece out of the big and put a big chunk in your mouth. Mere moments afters putting it in your mouth you chew, a sickly horrid feeling over comes you. As you spit what is now a horrid rotten piece of meat you look at the big." +
                "\nWhat appeared to be a lovely roasted pig, to your horror is the corpse of an unrecognisable man, in whicb you have just carved a large chunk out of his chest.";
        roomOptionDisplayText [1][2] = "Going on instincts you decide to cast dispel magic on the entire room. To your horror as the spell goes off, all the food changes from there fresh edible form, into rotten, maggot crawling food." +
                "\n The smell of decay and death replace the sweet smell from before, making you sick to your stomach.";
        RoomItems[1][0] = 0;
        RoomItems[1][1] = 0;
        RoomItems[1][2] = 0;

        RoomOptions2[2][0] = "Option1 Take a bite of food";
        RoomOptions2[2][1] = "Option2 Take a bite of the pig";
        RoomOptions2[2][2] = "Option3 Throw some food on the ground";
        roomOptionDisplayText [2][0] = "You take a bit of some chicken on the table that looks so delicious, as bite into however, you realize it is rotten and crawling with maggots, unable to control yourself you spit it out and vommit all of the table." +
                "\nScraping your tongue of the foul food you just placed there.";
        roomOptionDisplayText [2][1] = "You cut a piece out of the big and put a big chunk in your mouth. Mere moments afters putting it in your mouth you chew, a sickly horrid feeling over comes you. As you spit what is now a horrid rotten piece of meat you look at the big." +
                "\nWhat appeared to be a lovely roasted pig, to your horror is the corpse of an unrecognisable man, in whicb you have just carved a large chunk out of his chest.";
        roomOptionDisplayText [2][2] = "Going agasint your gut you grab some of the food and throw it to the ground, stomping on it just to be safe. As you lean down to look at it you realized the food is all rotten and crawlling with maggots." +
                "\nDespite what it appears you quickly decern that the food infront of you is all rotten. ";
        RoomItems[2][0] = 0;
        RoomItems[2][1] = 0;
        RoomItems[2][2] = 0;



        allRooms.get(12).AddOptions(RoomOptions2);
        allRooms.get(12).AddOptionsDisplayText(roomOptionDisplayText);
        allRooms.get(12).AddRoomItems(RoomItems);





    }
}
