package com.example.android.musicstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView tvSong = listItemView.findViewById(R.id.tv_song_name);
        tvSong.setText(currentSong.getmSongName());

        TextView tvArtist = listItemView.findViewById(R.id.tv_artist_name);
        tvArtist.setText(currentSong.getmArtistName());

        ImageView ivAlbum = listItemView.findViewById(R.id.iv_album_pic);
        ivAlbum.setImageResource(currentSong.getmAlbumPic());

        return listItemView;
    }
}

