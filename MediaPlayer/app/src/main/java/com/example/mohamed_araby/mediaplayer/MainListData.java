package com.example.mohamed_araby.mediaplayer;

/**
 * Created by mohamed_araby on 2/22/18.
 */

public class MainListData {
    private String songName;
    private String songArtistName;


    public MainListData(String songName, String songArtistName) {
        this.songName = songName;
        this.songArtistName = songArtistName;

    }

    public String getSongName() {
        return songName;
    }

    public String getSongArtistName() {
        return songArtistName;
    }
}
