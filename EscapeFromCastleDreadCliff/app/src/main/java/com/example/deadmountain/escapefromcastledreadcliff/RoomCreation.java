package com.example.deadmountain.escapefromcastledreadcliff;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Jai on 14/03/2017.
 */

public class RoomCreation {
    private Context context;
    private ArrayList<Room> allRooms;
    private String[][] RoomOptions = new String[3][3];

    public RoomCreation(Context current) {
        this.context = current;
    }

    public void loadRooms() throws IOException {
        allRooms = new ArrayList<Room>();
        InputStreamReader itemStream = new InputStreamReader(context.getAssets().open("rooms.tsv"));
        BufferedReader itemReader = new BufferedReader(itemStream);
        itemReader.readLine();
        try {
            String line;
            int current = 0;
            while ((line = itemReader.readLine()) != null) {
                String[] RowData = line.split("\\t");
                allRooms.add(current, new Room(
                        RowData[1], // inspect
                        current, // id
                        RowData[1], // name
                        Integer.parseInt(RowData[2]), // connectedRooms
                        Integer.parseInt(RowData[3]), // room1
                        Integer.parseInt(RowData[4]), // room2
                        Integer.parseInt(RowData[5]), // room3
                        Integer.parseInt(RowData[6]), // room4
                        RowData[7], // drt 1
                        RowData[8], // drt 2
                        RowData[9], // drt 3
                        RowData[10], // drt 4
                        RowData[11], // roomDescription
                        RowData[12], // roomInspect
                        RowData[13], // lockedRoomDescription
                        Integer.parseInt(RowData[14]) // requiredItem
                ));
                current++;
            }
        }
        catch (IOException ex) {

        }
    }

    public Room getRoomFromID(int roomID) {
        return allRooms.get(roomID);
    }

    public ArrayList<Room> getAllRooms() { return allRooms; }
}
