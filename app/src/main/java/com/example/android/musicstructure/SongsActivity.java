package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        TextView tvPlaylist = findViewById(R.id.tv_playlist);
        TextView tvArtist = findViewById(R.id.tv_artist);
        TextView tvAlbum = findViewById(R.id.tv_album);

        tvPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(SongsActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);
            }
        });

        tvArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(SongsActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        tvAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(SongsActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Metallica", "Master of Puppets", "Battery", R.drawable.master));
        songs.add(new Song("Metallica", "Master of Puppets", "Master of Puppets", R.drawable.master));
        songs.add(new Song("Metallica", "Master of Puppets", "The Thing That Should Not Be", R.drawable.master));
        songs.add(new Song("Metallica", "Master of Puppets", "Welcome Home", R.drawable.master));
        songs.add(new Song("Metallica", "Master of Puppets","Disposable Heroes", R.drawable.master));
        songs.add(new Song("Metallica", "Master of Puppets", "Leper Messiah", R.drawable.master));
        songs.add(new Song("Metallica", "Master of Puppets", "Orion", R.drawable.master));
        songs.add(new Song("Metallica", "Master of Puppets", "Damage, Inc", R.drawable.master));
        songs.add(new Song("Eminem", "Recovery", "Cold Wind Blows", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Talkin' 2 Myself", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "On Fire", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Won't Back Down", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "W.T.P.", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Going Through Changes", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Not Afraid", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Seduction", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "No Love", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Space Bound", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Cinderella Man", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "25 To Life", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "So Bad", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Almost Famous", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Love the Way You Lie", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "You're Never Over", R.drawable.recovery));
        songs.add(new Song("Eminem", "Recovery", "Untitled", R.drawable.recovery));
        songs.add(new Song("Rihanna", "Loud", "S&M", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "What's My Name?", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "Cheers", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "Fading", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "Only Girl", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "California King Bed", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "Man Down", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "Raining Men", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "Complicated", R.drawable.loud));
        songs.add(new Song("Rihanna", "Loud", "Skin", R.drawable.loud));

        SongAdapter saSongs = new SongAdapter(this, songs);

        ListView lvSongs = findViewById(R.id.list);

        lvSongs.setAdapter(saSongs);
    }
}
