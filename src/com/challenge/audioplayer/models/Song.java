package com.challenge.audioplayer.models;

public class Song extends Audio {

    public Song(String title, int totalLikes, int totalPlay, int calification) {
        super(title, totalLikes, totalPlay, calification);
        //TODO Auto-generated constructor stub
    }

    String artist;
    String album;
    String genre;

    // metods

    @Override
    public int getCalification() {
        if (getTotalLikes() > 5000) {
            return 8;
        }else{
            return 4;
        }
    }

    // getters
    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    // setters
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
