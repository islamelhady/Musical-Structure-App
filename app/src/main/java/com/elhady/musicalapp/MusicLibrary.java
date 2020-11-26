package com.elhady.musicalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MusicLibrary extends AppCompatActivity {

    private SongsAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<SongModel> songsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);


        songsList.add(new SongModel("Jennifer Lopez", "Bad Blood"));
        songsList.add(new SongModel("Christina Perri", "Hannah Montana"));
        songsList.add(new SongModel("Taylor Swift ", "Rio 2"));
        songsList.add(new SongModel("Miley Cyrus", "mother "));
        songsList.add(new SongModel("Bruno Mars", "Never Say Never"));
        songsList.add(new SongModel("Justin", "Trolls "));
        songsList.add(new SongModel("Jennifer Lopez", "TCity "));
        songsList.add(new SongModel("Selena Gomez", "English"));
        songsList.add(new SongModel("Justin Bieber", "Fidler "));
        songsList.add(new SongModel("Eminem", "Skyfall"));
        songsList.add(new SongModel("Jennifer Lopez", "Aerosm fg ith"));
        songsList.add(new SongModel("Justin Timberlake", "Aedfgro dfgdsmith"));
        songsList.add(new SongModel("Rihanna", "kie i e "));
        songsList.add(new SongModel("Jennifer Lopez", "sdfskl j"));
        songsList.add(new SongModel("Katy Perry", "sdfko "));
        songsList.add(new SongModel("Adele", "klwejo rf"));
        songsList.add(new SongModel("Lady Gaga", "sdlfkowei"));
        songsList.add(new SongModel("Pitbull", "Aerosmith"));
        songsList.add(new SongModel("Usher", "A Star Is Born "));
        songsList.add(new SongModel("Steven Tyler", "A Star Is Born"));
        songsList.add(new SongModel("Chris Brown", "A Star Is Born"));
        songsList.add(new SongModel("Madonna", "sdlfkjo "));
        songsList.add(new SongModel("Michael Jackson", "A Star Is Born"));
        songsList.add(new SongModel("Akon", "A Star Is Born"));
        songsList.add(new SongModel("Ashley Tisdale", "A Star Is Born "));
        songsList.add(new SongModel("Enrique Iglesias", "A Star Is Born"));
        songsList.add(new SongModel("Jennifer Lopez", "A Star Is Born"));






        recyclerView = findViewById(R.id.recycler_view_music);
        adapter = new SongsAdapter(songsList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}