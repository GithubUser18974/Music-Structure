package com.example.mohamed_araby.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button playlist;
    private Button favoutite;
    private Button recently;
    private Button currentPlaying;
    private Button playPause;
    private boolean isPlaying_mainActivity = false;
    private List<MainListData> values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        values = new ArrayList<>();
        values.add(new MainListData("lose your self  ", "Eminem"));
        values.add(new MainListData("set it all free  ", "Scarlett johnasson"));
        values.add(new MainListData("Try EveryThing  ", "Shakira"));
        values.add(new MainListData("Twenty One Pilot  ", "Heathens"));
        values.add(new MainListData("My way  ", "Seth MacFralane"));
        values.add(new MainListData("waadtak  ", "Amr Diab"));
        values.add(new MainListData("Hello  ", "Adele"));
        values.add(new MainListData("Ragea  ", "Amr Diab"));
        values.add(new MainListData("All I do is Win  ", "Dj Khaled"));
        values.add(new MainListData("Brave  ", "Sara Bareilles"));
        values.add(new MainListData("I still Standing  ", "Taron Egerton"));
        values.add(new MainListData("Till I collapse  ", "Eminem"));
        values.add(new MainListData("Set Fire To The Rain", "Adele"));
        ListView listview = (ListView) findViewById(R.id.songslistviewID);
        CustomeAdapter customeAdapter = new CustomeAdapter(this, values);
        listview.setAdapter(customeAdapter);
        playPause = (Button) findViewById(R.id.playpause_mian_activity);
        playPause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (isPlaying_mainActivity) {
                    isPlaying_mainActivity = false;
                    playPause.setBackgroundResource(R.drawable.ic_pause_circle_filled_black_24dp);
                } else {
                    isPlaying_mainActivity = true;
                    playPause.setBackgroundResource(R.drawable.ic_play_circle_filled_black_24dp);
                }
            }
        });
        playlist = (Button) findViewById(R.id.playlist_mainactivity);
        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PlayList.class);
                startActivity(intent);
            }
        });
        currentPlaying = (Button) findViewById(R.id.currentplaying_mainactivity);
        currentPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent currentPlayingIntent = new Intent(getApplicationContext(), CurrentPlayingSong.class);
                startActivity(currentPlayingIntent);
            }
        });
        favoutite = (Button) findViewById(R.id.favourite_mainactivity);
        favoutite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent favouriteIntent = new Intent(getApplicationContext(), Favourite.class);
                startActivity(favouriteIntent);
            }
        });
        recently = (Button) findViewById(R.id.recently_mainactivity);
        recently.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent recentPlayedIntent = new Intent(getApplicationContext(), RecentlyPlayed.class);
                startActivity(recentPlayedIntent);
            }
        });
    }

    public List<MainListData> getValues() {
        return values;
    }
}
