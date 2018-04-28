package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icon_grid);

        TextView tvPlaylist = findViewById(R.id.tv_playlist);
        TextView tvArtist = findViewById(R.id.tv_artist);
        TextView tvSongs = findViewById(R.id.tv_songs);

        tvPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(AlbumActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);
            }
        });

        tvArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        tvSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(AlbumActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Metallica", "Master of Puppets", "", R.drawable.master));
        songs.add(new Song("Rihanna", "Loud", "", R.drawable.loud));
        songs.add(new Song("Coldplay", "A Head Full of Dreams", "", R.drawable.head));
        songs.add(new Song("Eminem", "Recovery", "", R.drawable.recovery));
        songs.add(new Song("Sia", "This is Acting", "", R.drawable.acting));

        GridAdapter gaSongs = new GridAdapter(this, songs);

        GridView gvSongs = findViewById(R.id.grid);

        gvSongs.setAdapter(gaSongs);
    }
}
