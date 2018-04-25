package com.example.mohamed_araby.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Favourite extends AppCompatActivity implements View.OnClickListener {
    private List<MainListData> values;
    private Button goToHome;
    private Button gotToCurrentplaying;
    private Button goToRecent;
    private Button goToPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        values = new ArrayList<>();
        values.add(new MainListData("lose your self  ", "Eminem"));
        values.add(new MainListData("set it all free  ", "Scarlett johnasson"));
        values.add(new MainListData("Try EveryThing  ", "Shakira"));
        ListView listview = (ListView) findViewById(R.id.listview_favourite);
        CustomeAdapter customeAdapter = new CustomeAdapter(this, values);
        listview.setAdapter(customeAdapter);
        gotToCurrentplaying = (Button) findViewById(R.id.gotcurrentplaying_favouriteactivtity);
        gotToCurrentplaying.setOnClickListener(this);
        goToHome = (Button) findViewById(R.id.gotohome_favouriteactivtity);
        goToHome.setOnClickListener(this);
        goToPlaylist = (Button) findViewById(R.id.gotoplaylist_favouriteactivtity);
        goToPlaylist.setOnClickListener(this);
        goToRecent = (Button) findViewById(R.id.gotorecentplayed_favouriteactivtity);
        goToRecent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int bID = view.getId();
        switch (bID) {
            case R.id.gotcurrentplaying_favouriteactivtity:
                Intent gotoCurrentPlayingactivity = new Intent(getApplicationContext(), CurrentPlayingSong.class);
                startActivity(gotoCurrentPlayingactivity);
                break;
            case R.id.gotoplaylist_favouriteactivtity:
                Intent gotoplaylistcactivity = new Intent(getApplicationContext(), PlayList.class);
                startActivity(gotoplaylistcactivity);
                break;
            case R.id.gotorecentplayed_favouriteactivtity:
                Intent gotorecentplayedactivity = new Intent(getApplicationContext(), RecentlyPlayed.class);
                startActivity(gotorecentplayedactivity);
                break;
            case R.id.gotohome_favouriteactivtity:
                Intent gotoHomeActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(gotoHomeActivity);
                break;

        }
    }
}
