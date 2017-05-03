package com.example.deadmountain.escapefromcastledreadcliff;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Jai on 3/05/2017.
 */

public class loadData {
    private Context context;
    private ArrayList<item> itemList;

    public loadData(Context current) {
        this.context = current;
    }

    public void loadAll() throws IOException {
        loaditems();
        ArrayList<item> test = itemList;
    }

    public void loaditems() throws IOException {
        itemList = new ArrayList<item>();
        InputStreamReader itemStream = new InputStreamReader(context.getAssets().open("items.csv"));
        BufferedReader itemReader = new BufferedReader(itemStream);
        itemReader.readLine();
        try {
            String line;
            int current = 0;
            while ((line = itemReader.readLine()) != null) {
                String[] RowData = line.split(",");
                itemList.add(current, new item(Integer.parseInt(RowData[0]), RowData[1], RowData[2], RowData[3], 0));
                current++;
            }
        }
        catch (IOException ex) {

        }
    }

}
