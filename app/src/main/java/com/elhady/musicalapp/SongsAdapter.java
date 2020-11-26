package com.elhady.musicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.SongsViewHolder> {
    private ArrayList<SongModel> songList = new ArrayList<>();
    private Context context;

    public SongsAdapter(ArrayList<SongModel> songList, Context context) {
        this.songList = songList;
        this.context = context;
    }

    public void setSongList(ArrayList<SongModel> songList) {
        this.songList = songList;
    }

    @NonNull
    @Override
    public SongsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
        return new SongsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongsViewHolder holder, int position) {
        holder.title_artist.setText(songList.get(position).getArtistName());
        holder.title_song.setText(songList.get(position).getSongTitle());
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    class SongsViewHolder extends RecyclerView.ViewHolder {
        TextView title_artist, title_song;

        public SongsViewHolder(@NonNull View itemView) {
            super(itemView);
            title_artist = itemView.findViewById(R.id.title_artist);
            title_song = itemView.findViewById(R.id.title_song);
        }
    }
}
