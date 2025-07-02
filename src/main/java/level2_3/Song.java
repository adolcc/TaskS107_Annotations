package level2_3;

import annotations.JsonSerializable;

@JsonSerializable(directory = "music_library/")

public class Song {
    private String title;
    private String artist;
    private double durationSeconds;


    public Song() {

    }

    public Song(String title, String artist, double durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getArtist() {
        return artist;

    }

    public void setArtist(String artist) {

        this.artist = artist;
    }

    public double getDurationSeconds() {

        return durationSeconds;
    }

    public void setDurationSeconds(double durationSeconds) {

        this.durationSeconds = durationSeconds;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", durationSeconds=" + durationSeconds +
                '}';
    }
}