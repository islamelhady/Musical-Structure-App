package com.elhady.musicalapp;

public class SongModel {
    private String artistName;
    private String songTitle;

    public SongModel(String artistName, String songTitle) {
        this.artistName = artistName;
        this.songTitle = songTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
}
