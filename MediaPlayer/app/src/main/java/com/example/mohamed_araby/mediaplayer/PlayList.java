package com.example.mohamed_araby.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PlayList extends AppCompatActivity implements View.OnClickListener {
    private CustomeAdapterForOneTextView adapter;
    private List<MainListData> values;
    private Button goToHome;
    private Button goToCurrentPlaying;
    private Button goToRecent;
    private Button goToFavourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        values = new ArrayList<>();
        values.add(new MainListData("favoutite  ", ""));
        values.add(new MainListData("quran  ", ""));
        values.add(new MainListData("adele  ", ""));

        adapter = new CustomeAdapterForOneTextView(getApplicationContext(), values);
        ListView listView = (ListView) findViewById(R.id.listview_playlist);
        listView.setAdapter(adapter);
        goToCurrentPlaying = (Button) findViewById(R.id.gotcurrentplaying_plylistactivtity);
        goToCurrentPlaying.setOnClickListener(this);
        goToHome = (Button) findViewById(R.id.gotohome_plylistactivtity);
        goToHome.setOnClickListener(this);
        goToFavourite = (Button) findViewById(R.id.gotofavourite_plylistactivtity);
        goToFavourite.setOnClickListener(this);
        goToRecent = (Button) findViewById(R.id.gotorecentplayed_plylistactivtity);
        goToRecent.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int bID = view.getId();
        switch (bID) {
            case R.id.gotcurrentplaying_plylistactivtity:
                Intent gotocurrentactivity = new Intent(getApplicationContext(), CurrentPlayingSong.class);
                startActivity(gotocurrentactivity);
                break;
            case R.id.gotofavourite_plylistactivtity:
                Intent gotofavouritecactivity = new Intent(getApplicationContext(), Favourite.class);
                startActivity(gotofavouritecactivity);
                break;
            case R.id.gotorecentplayed_plylistactivtity:
                Intent gotorecentplayedactivity = new Intent(getApplicationContext(), RecentlyPlayed.class);
                startActivity(gotorecentplayedactivity);
                break;
            case R.id.gotohome_plylistactivtity:
                Intent gotoHomeActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(gotoHomeActivity);
                break;

        }
    }
}
