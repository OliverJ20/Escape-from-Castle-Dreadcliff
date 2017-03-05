package com.example.deadmountain.escapefromcastledreadcliff;


import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.RadioButton;
import android.widget.Button;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    // private NewGameFragment newGamefragment;
    // private SelectClassFragment selectClassfragment;
    private SelectClassFragment selectClassFragment;
    private BarbStoryFragment barbStoryFragment;
    private MageStoryFragment mageStoryFragment;
    private RogueStoryFragment rogueStoryFragment;
    private int selectedOption = 0;
    private String selectedString = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //   newGamefragment = new NewGameFragment();
        selectClassFragment = new SelectClassFragment();
        barbStoryFragment = new BarbStoryFragment();
        mageStoryFragment = new MageStoryFragment();
        rogueStoryFragment = new RogueStoryFragment();

    }


    // public void newGame()
    // {
    //     final Button button = (Button) findViewById(R.id.newGamebutton);

    // }

    public void startGameHandler(View view) {
        view.setVisibility(View.GONE);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, selectClassFragment)
                .commit();

        // FragmentManager fm = getSupportFragmentManager();
        //SelectClassFragment selectFragment = new SelectClassFragment();
        // FragmentTransaction ft = fm.beginTransaction();
        // ft.replace(R.id.fragment_container, selectFragment);
        // ft.commit();


    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton)view).isChecked();
        switch(view.getId())
        {
            case R.id.option1RadioButton:
                if (checked)
                {
                    selectedOption = 1;
                    selectedString = "1";
                    Log.i ("hello", selectedString);
                    break;
                }
            case R.id.option2RadioButton:
                if (checked)
                {
                    selectedOption = 2;
                    selectedString = "2";
                    Log.i ("hello", selectedString);
                    break;
                }
            case R.id.option3RadioButton:
                if (checked)
                {
                    selectedOption = 3;
                    selectedString = "3";
                    Log.i ("hello", selectedString);
                    break;
                }
        }
    }
    public void buttonSubmitClick(View view)
    {

        if (selectedOption == 1) {
          //Button button = (Button) findViewById(R.id.option1RadioButton);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, barbStoryFragment)
                    .commit();
        }
        if (selectedOption == 2) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, mageStoryFragment)
                    .commit();


        }
        if (selectedOption == 3) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, rogueStoryFragment)
                    .commit();


        }
    }


}
