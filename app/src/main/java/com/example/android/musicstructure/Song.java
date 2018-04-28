package com.example.android.musicstructure;

public class Song {

    private String artistName;
    private String albumName;
    private String songName;
    private int albumPic;

    public Song(String mArtistName, String mAlbumName, String mSongName, int mAlbumPic) {
        this.artistName = mArtistName;
        this.albumName = mAlbumName;
        this.songName = mSongName;
        this.albumPic = mAlbumPic;
    }

    public String getmArtistName() {
        return artistName;
    }

    public String getmAlbumName() {
        return albumName;
    }

    public String getmSongName() {
        return songName;
    }

    public int getmAlbumPic() {
        return albumPic;
    }
}

