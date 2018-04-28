package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        TextView tvPlaylist = findViewById(R.id.tv_playlist);
        TextView tvAlbum = findViewById(R.id.tv_album);
        TextView tvSongs = findViewById(R.id.tv_songs);

        tvPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(ArtistActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);
            }
        });

        tvAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        tvSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(ArtistActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("", "", "Metallica", R.drawable.master));
        songs.add(new Song("", "", "Sia", R.drawable.acting));
        songs.add(new Song("", "", "Coldplay", R.drawable.head));
        songs.add(new Song("", "", "Eminem", R.drawable.recovery));
        songs.add(new Song("", "", "Rihanna", R.drawable.loud));

        SongAdapter saSongs = new SongAdapter(this, songs);

        ListView lvSongs = findViewById(R.id.list);

        lvSongs.setAdapter(saSongs);
    }
}
