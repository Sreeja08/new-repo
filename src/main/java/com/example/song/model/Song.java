// Write your code here
package com.example.song.model;

public class Song {
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int id, String name, String lyr, String singer, String md) {
        this.songId = id;
        this.lyricist = lyr;
        this.singer = singer;
        this.musicDirector = md;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int id) {
        this.songId = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String name) {
        this.songName = name;
    }

    public String getLyricist() {
        return lyricist;
    }

    public void setLyricist(String lyr) {
        this.lyricist = lyr;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String md) {
        this.musicDirector = md;
    }
}