package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        TextView tvArtist = findViewById(R.id.tv_artist);
        TextView tvAlbum = findViewById(R.id.tv_album);
        TextView tvSongs = findViewById(R.id.tv_songs);

        tvArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        tvAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(PlaylistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        tvSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(PlaylistActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Metallica", "", "Battery", R.drawable.master));
        songs.add(new Song("Eminem", "", "Cold Wind Blows", R.drawable.recovery));
        songs.add(new Song("Metallica", "", "Disposable Heroes", R.drawable.master));
        songs.add(new Song("Metallica", "", "Leper Messiah", R.drawable.master));
        songs.add(new Song("Rihanna", "", "S&M", R.drawable.loud));
        songs.add(new Song("Rihanna", "", "What's My Name?", R.drawable.loud));
        songs.add(new Song("Eminem", "", "Talkin' 2 Myself", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "On Fire", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Won't Back Down", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "W.T.P.", R.drawable.recovery));
        songs.add(new Song("Rihanna", "", "Cheers", R.drawable.loud));
        songs.add(new Song("Rihanna", "", "Fading", R.drawable.loud));
        songs.add(new Song("Rihanna", "", "Only Girl", R.drawable.loud));
        songs.add(new Song("Rihanna", "", "California King Bed", R.drawable.loud));
        songs.add(new Song("Rihanna", "", "Man Down", R.drawable.loud));
        songs.add(new Song("Metallica", "", "Master of Puppets", R.drawable.master));
        songs.add(new Song("Metallica", "", "The Thing That Should Not Be", R.drawable.master));
        songs.add(new Song("Metallica", "", "Welcome Home", R.drawable.master));
        songs.add(new Song("Eminem", "", "Going Through Changes", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Not Afraid", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Seduction", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "No Love", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Space Bound", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Cinderella Man", R.drawable.recovery));
        songs.add(new Song("Rihanna", "", "Raining Men", R.drawable.loud));
        songs.add(new Song("Rihanna", "", "Complicated", R.drawable.loud));
        songs.add(new Song("Eminem", "", "25 To Life", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "So Bad", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Almost Famous", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Love the Way You Lie", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "You're Never Over", R.drawable.recovery));
        songs.add(new Song("Eminem", "", "Untitled", R.drawable.recovery));
        songs.add(new Song("Rihanna", "", "Skin", R.drawable.loud));

        SongAdapter saSongs = new SongAdapter(this, songs);

        ListView lvSongs = findViewById(R.id.list);

        lvSongs.setAdapter(saSongs);
    }
}
