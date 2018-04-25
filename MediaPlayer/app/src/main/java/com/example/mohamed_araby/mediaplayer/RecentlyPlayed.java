package com.example.mohamed_araby.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecentlyPlayed extends AppCompatActivity implements View.OnClickListener {
    private List<MainListData> values;
    private CustomeAdapter adapter;
    private Button goToHome;
    private Button goToCurrentPlaying;
    private Button goToPlaylist;
    private Button goToFavourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);
        values = new ArrayList<>();
        values.add(new MainListData("lose your self  ", "Eminem"));
        values.add(new MainListData("set it all free  ", "Scarlett johnasson"));
        values.add(new MainListData("Try EveryThing  ", "Shakira"));

        adapter = new CustomeAdapter(getApplicationContext(), values);
        ListView listView = (ListView) findViewById(R.id.lisview_recentlyplayed);
        listView.setAdapter(adapter);
        goToCurrentPlaying = (Button) findViewById(R.id.gotcurrentplaying_recentplayingactivtity);
        goToCurrentPlaying.setOnClickListener(this);
        goToHome = (Button) findViewById(R.id.gotohome_recentplayingactivtity);
        goToHome.setOnClickListener(this);
        goToFavourite = (Button) findViewById(R.id.gotofavourite_recentplayingactivtity);
        goToFavourite.setOnClickListener(this);
        goToPlaylist = (Button) findViewById(R.id.gotoplaylist_recentplayingactivtity);
        goToPlaylist.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int bID = view.getId();
        switch (bID) {
            case R.id.gotcurrentplaying_recentplayingactivtity:
                Intent gotocurrentactivity = new Intent(getApplicationContext(), CurrentPlayingSong.class);
                startActivity(gotocurrentactivity);
                break;
            case R.id.gotofavourite_recentplayingactivtity:
                Intent gotofavouritecactivity = new Intent(getApplicationContext(), Favourite.class);
                startActivity(gotofavouritecactivity);
                break;
            case R.id.gotoplaylist_recentplayingactivtity:
                Intent gotoPlaylistactivity = new Intent(getApplicationContext(), PlayList.class);
                startActivity(gotoPlaylistactivity);
                break;
            case R.id.gotohome_recentplayingactivtity:
                Intent gotoHomeActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(gotoHomeActivity);
                break;

        }
    }
}