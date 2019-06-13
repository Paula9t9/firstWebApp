package com.fedyr.code401.firstWebApp;

public class Album {

    private String title;
    private String artist;
    private int songCount;
    private long length;
    private String imageUrl;



    public Album(String title, String artist, int songCount, long length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

}
