package com.example.deadmountain.escapefromcastledreadcliff;

import java.util.ArrayList;

/**
 * Created by Jai on 14/03/2017.
 */

public class RoomCreation {
    private ArrayList<Room> allRooms;
    private String[][] RoomOptions = new String[3][3];

    public void createAllRooms() {

        String dungeonDescription ="You awake to the sound of thunder echoing from outside" +
                "\nthe sound of rain hitting stone." +
                "\nYou find yourself in a small jail cell, with rust covering the bars." +
                "\nAs you peer into the surrounding darkness you see no one" +
                "\nthe room only being lit by brief cracks of thunder and light descending downwards from a stair case";

        String dungeonInspectDescription = "You inspect your surroundings but confirm that you are alone except for a skeleton lying opporsite to you, with a shattered pelvis.\n";



        String tortureDescription ="When you enter this room you are over come by the horrible smell of burnt flesh, a single flicking torch at the back of the room lighting the room." +
                "\nFrom peering in you notice a large steel table in the centre with an assortment of tools of all different sizes and spikes placed neartly on hooks on the wall.";
        String tortuInspectDescription = "Over coming your sense of smell you step in further, noticing that the room is appears to be stained a dark red colour."+
                "\nYou also notice an assortment of tools of all different sizes and spikes hanging on hooks on the wall, some rusty, some glimmying bright in the torch light.\n";
        String lockedTortureDescription = "";


        String hallwayDescription ="The hallway is well lit by several torches evenly spaced out along the walls, it appears to lead to a set of spiraling stair case at the end.";
        String hallwayInspectDescription = "Looking around you notice very little, the stone walls seem to be worn, giving you the impression that it was built long ago." +
                "\nYou also notice two rooms to the side, one with a hint of light inside, the other appearing pitch black\n";
        String lockedHallwayDescription = dungeonDescription + "\n\n You attempt to leave your cell, only to be stopped by series of bars who would of thought?";


        String storageDescription ="With the Torch held in your hand you are able to illuminate the room, revealing crates and bags scatered throughout, some opened some sealed, all covered in a thick layer of dust." +
                "\nYou are also able to see some rusted weapons placed along the wall. ";
        String storageInspectDescription = "Walking around the room you are able to see some clothes and what appear to be old clothes thrown away, along with a range of weapons scattered throughout the room.\n";
        String lockedStorageDescription = hallwayDescription + "\n\nYou look into this room but it is shrouded in darkness, you can't make out anything";


        String stairs1stfloorDescription ="You stand at the enterence of what appeared to be the basement or dungeon room, Stretched out before you is the first floor of the castle." +
                "\nTorches line the walls and a vibrant red carpet stretches along the floors." +
                "\nThe carpet appears already ruined by your grimmy feet.";
        String stairs1stfloorInspectDescription = "Torches line the walls, with a vibrant red carpet stretching along the floor in all directions."+
                "\nTo the east however the faint aroma of food fills your nostrils.\n";

        String guestDescription ="The room is lit by two candle stands besides a four poster bed, the bed beng covered in deep red colours of incredible quality." +
                "\nwho ever would sleep here must of been individuals of high standing.";
        String guestInspectionDescription = "Taking a closer look at the room you notice two important things." +
                "The first is that the room is covered in dust like many rooms you have visted, the second is that the bed is not covered in dust, it appears" +
                " to of been freshly made, not a spec of dust on it.\n";
        String lockedGuestDescription = stairs1stfloorDescription +  "\n\nTurning the handle reveals that the door is locked.";

        String pantryDescription ="Rows of selves are filled with various breads, spices, savourys and sweets." +
                "\nThe variance in food seems endless, it would be a master cooks dream pantry";
        String pantryInspectDescription = "Feeling your belly rumble at the site, you reach for a loaf of bread to eat. As you bring it up to your mouth however you notice that this bread is covered in mold." +
                "\nShocked you through the moldy bread to the ground, and reach for a delcious apple, only for it to become rotten and spoil in your hands." +
                "\nAs you continue to grab food you quickly realize that all this food is rotten and expired many years ago, though at first glance appeared in perfect condition.\n";

        String stairsupwardsDescription ="You begin to climb the stairs upwards to the second floor as you make your way to the top an incredible sense of dread takes hold of you";
        String stairsupwardsInspectDescription = "to be continued.\n";


        String waitingDescription ="The light from the outside storm briely lighting up the room through two large windows." +
                "\nThrough the flicks of light you can make out two lavish couches in the center" +
                "\nseperated by a rectangular coffee table of high quality.";
        String waitingInspectDescription = "Stepping carefully around the furniture your drawn to the coffee table." +
                "\n On it you see a cup of tea next to a photo of a women.\n";

        String livingDescription ="The room is well lit from a chandelier in the center, a large blood red carpet with a picture of a dragon with out stetched wings, covers nearly the entire floor";
        String livingInspectDescription = "You feel charmed by the image of the dragon and stare at it more and more."+
                "\nIt seems so familiar, something is at the edge of your mind you can feel it." +
                "\nJust when your about to move on however the image of a dragon flashes in your mind, the image of a dragon that transforms into a man draped in fine red cloaks." +
                "\nAs you snap back to reality, a feeling of impending doom creeps into your mind, whatever that image was, you wish to never see it again\n";

        String kitchenDescription ="The kitchen appears to be covered in dust, lit from a small chandelier in the center." +
                "\nPans are rusted through, knives as dull as clubs, stoves that appear to have not been used in years.";
        String kitchenInspectDescription = "Pacing around the kitchen looking for anything useful, you come up empty handed, all you seem to find is rusted kitchen utensils.\n";

        String frontdoorDescription ="You stand before a large wooden double door that appears to be your only hope of escape." +
                "\nAlthough the door is locked as you attempt to open it, there is a large keyhole in the center, there may be hope yet, just got to find the key.";
        String frontdoorInspectDescription = "The door appears to be reinforced with steel and iron, it would be take a battering ram if that to bring it down." +
                "\nImpossible for any single person.\n";

        String dinningDescription ="A large table takes up most of the room, with three large candle sticks evenly placed along it providing light to the room." +
                "\nA large feast is layed out on the table, with all sorts of fruits and meats covering all surfaces, a large roasted pig being the center piece of it all.";
        String dinningInspectDescription = "Looking around the room, the smell of the food is overwhelming, in this very moment you realize how hungry you are." +
                "\nYour mouth begins to water at the site of it all, however through all of that a part of you questions all of this, it seems so out of place, so strange.\n";



        allRooms = new ArrayList<Room>();

        allRooms.add(0, new Room ("You are in a dark dungeon", 0, "Dungeon", 1, 2,0,0,0, "South", "", "", "",dungeonDescription, dungeonInspectDescription,"",0 ));
        allRooms.add(1, new Room ("Torture Room", 1, "Torture Room", 1, 2,0,0,0, "East", "", "", "",tortureDescription, tortuInspectDescription,lockedTortureDescription ,2));
        allRooms.add(2, new Room ("Hallway", 2, "Hallway", 4,1,3,5,0,"West", "East", "South", "North",hallwayDescription,hallwayInspectDescription,lockedHallwayDescription,2));
        allRooms.add(3, new Room ("Storage Room", 3, "Storage Room", 1, 2,0,0,0,"West", "", "", "",storageDescription,storageInspectDescription,lockedStorageDescription,3));
        allRooms.add(4, new Room ("Guest bedroom", 4, "Guest Bedroom", 1, 5,0,0,0,"East", "", "", "",guestDescription, guestInspectionDescription,lockedGuestDescription,4));
        allRooms.add(5, new Room ("stairs 1st floor", 5, "stairs 1st floor", 4, 9,4,6,2,"South", "West", "East", "North",stairs1stfloorDescription, stairs1stfloorInspectDescription,"",0));
        allRooms.add(6, new Room ("pantry", 6, "pantry", 2, 5,10,0,0,"West", "South", "", "",pantryDescription,pantryInspectDescription,"",0));
        allRooms.add(7, new Room ("Stairs leading upstairs", 7, "Stairs leading upstairs", 1, 9,0,0,0,"South East", "", "", "",stairsupwardsDescription,stairsupwardsInspectDescription,"",0));
        allRooms.add(8, new Room ("Waiting room", 8, "Waiting room", 1, 11,0,0,0,"South East", "", "", "",waitingDescription,waitingInspectDescription,"",0));
        allRooms.add(9, new Room ("Living room", 9, "Living room", 4, 11,12,7,5,"South", "South East", "North West", "North",livingDescription,livingInspectDescription,"",0));
        allRooms.add(10, new Room ("Kitchen", 10, "Kitchen", 2, 12,6,0,0,"South", "North", "", "",kitchenDescription,kitchenInspectDescription,"",0));
        allRooms.add(11, new Room ("Front door", 11, "Front door",3, 8,12,9,0,"North West", "South East", "North", "",frontdoorDescription,frontdoorInspectDescription,"",0));
        allRooms.add(12, new Room ("Dinning room", 12, "Dinning room", 3, 9,11,10,0,"North West", "South West", "North", "",dinningDescription,dinningInspectDescription,"",0));

    }

    public Room getRoomFromID(int roomID) {
        return allRooms.get(roomID);
    }

    public ArrayList<Room> getAllRooms() { return allRooms; }
}
