package com.example.mohamed_araby.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CurrentPlayingSong extends AppCompatActivity implements View.OnClickListener {
    private Button playPause;
    private Button goToHomeButton;
    private Button goToFavourite;
    private Button goToRecent;
    private Button goToPlaylist;
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_playing_song);
        playPause = (Button) findViewById(R.id.playpause_currentctivty);
        playPause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (isPlaying) {
                    isPlaying = false;
                    playPause.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
                } else {
                    isPlaying = true;
                    playPause.setBackgroundResource(R.drawable.ic_play_circle_filled_white_24dp);
                }
            }
        });
        goToFavourite = (Button) findViewById(R.id.gotofavourite_currentplayingactivity);
        goToFavourite.setOnClickListener(this);
        goToHomeButton = (Button) findViewById(R.id.gotohome_currentplayingactivity);
        goToHomeButton.setOnClickListener(this);
        goToPlaylist = (Button) findViewById(R.id.gotoplaylist_currentplayingactivity);
        goToPlaylist.setOnClickListener(this);
        goToRecent = (Button) findViewById(R.id.gotorecentplaying_currentplayingactivity);
        goToRecent.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int bID = view.getId();
        switch (bID) {
            case R.id.gotofavourite_currentplayingactivity:
                Intent gotofavouriteactivity = new Intent(getApplicationContext(), Favourite.class);
                startActivity(gotofavouriteactivity);
                break;
            case R.id.gotoplaylist_currentplayingactivity:
                Intent gotoplaylistcactivity = new Intent(getApplicationContext(), PlayList.class);
                startActivity(gotoplaylistcactivity);
                break;
            case R.id.gotorecentplaying_currentplayingactivity:
                Intent gotorecentplayedactivity = new Intent(getApplicationContext(), RecentlyPlayed.class);
                startActivity(gotorecentplayedactivity);
                break;
            case R.id.gotohome_currentplayingactivity:
                Intent goToHomeButtonButtonActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goToHomeButtonButtonActivity);
                break;

        }
    }
}
