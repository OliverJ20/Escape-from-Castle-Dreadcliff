package com.example.deadmountain.escapefromcastledreadcliff;

/**
 * Created by Jai on 3/05/2017.
 */

public class item {
    Integer id = 0;
    String Name = "";
    String Type = "";
    String Location = "";
    Integer Effect = 0;

    public item(Integer id, String name, String type, String location, Integer effect) {
        this.id = id;
        this.Name = name;
        this.Type = type;
        this.Location = location;
        this.Effect = effect;
    }
}
