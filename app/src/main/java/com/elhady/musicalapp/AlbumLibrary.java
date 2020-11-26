package com.elhady.musicalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AlbumLibrary extends AppCompatActivity {

    private SongsAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<SongModel> albumsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_library);

        albumsList.add(new SongModel("Amr Diab", "Tamaly maak"));
        albumsList.add(new SongModel("Amr Diab", "mraiya"));
        albumsList.add(new SongModel("Amr Diab", "sd sdf"));
        albumsList.add(new SongModel("Mounir", "sdf ehe "));
        albumsList.add(new SongModel("Adel Hany", "ery"));
        albumsList.add(new SongModel("Mounir", "werw"));
        albumsList.add(new SongModel("Adel Hany", "wer w werw "));
        albumsList.add(new SongModel("Adel Hany", "Awerw BBA"));
        albumsList.add(new SongModel("Amr Diab", "ABwer BA"));
        albumsList.add(new SongModel("Amr Diab", "werw wer"));
        albumsList.add(new SongModel("Adel Hany", "wer wer"));
        albumsList.add(new SongModel("Adel Hany", "ABwerC"));
        albumsList.add(new SongModel("Adel Hany", "werwer"));
        albumsList.add(new SongModel("Jannat", "werwer wer"));
        albumsList.add(new SongModel("Islam", "Abstwerwewrracts"));
        albumsList.add(new SongModel("Jannat", "wer/werwe wer"));
        albumsList.add(new SongModel("Islam", "Awer wer C/wer"));
        albumsList.add(new SongModel("Amr Diab", "wer wer wer"));
        albumsList.add(new SongModel("Islam", "wer werw er"));
        albumsList.add(new SongModel("Mounir", "wer wer wer wwehy"));
        albumsList.add(new SongModel("Islam", "erte ert wer"));
        albumsList.add(new SongModel("Islam", "wert ert wert"));
        albumsList.add(new SongModel("Adel Hany", "ABwerC"));
        albumsList.add(new SongModel("Adel Hany", "werwer"));
        albumsList.add(new SongModel("Jannat", "werwer wer"));
        albumsList.add(new SongModel("Islam", "Abstwerwewrracts"));
        albumsList.add(new SongModel("Jannat", "wer/werwe wer"));
        albumsList.add(new SongModel("Islam", "Awer wer C/wer"));
        albumsList.add(new SongModel("Islam", "wert wert werter"));
        albumsList.add(new SongModel("Mounir", "ert ertej5y6 t"));

        recyclerView = findViewById(R.id.recycler_view_album);
        adapter = new SongsAdapter(albumsList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}