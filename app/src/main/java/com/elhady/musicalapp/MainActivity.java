package com.elhady.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView music, back_skip, play_music, forward_skip, albums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = findViewById(R.id.music);
        back_skip = findViewById(R.id.back_skip);
        play_music = findViewById(R.id.play_music);
        forward_skip = findViewById(R.id.forward_skip);
        albums = findViewById(R.id.albums);

        setOnclick();
    }

    private void setOnclick() {
        back_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skipBack();
            }
        });
        forward_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skipForward();
            }
        });
        play_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicPlay();
            }
        });
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumLibrary.class);
                startActivity(albumIntent);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MusicLibrary.class);
                startActivity(intent);
            }
        });
    }

    public void musicPlay() {
        Toast.makeText(this, "Music is playing", Toast.LENGTH_SHORT).show();
    }

    public void skipForward() {
        Toast.makeText(this, "Skip to next song", Toast.LENGTH_SHORT).show();
    }

    public void skipBack() {
        Toast.makeText(this, "Skip to last song", Toast.LENGTH_SHORT).show();
    }
}