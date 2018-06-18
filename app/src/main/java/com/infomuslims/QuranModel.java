package com.infomuslims;

/**
 * Created by renu on 12/08/17.
 */
public class QuranModel {

    private String title, genre, urdu;

    public QuranModel() {
    }

    public QuranModel(String title, String genre, String urdu) {
        this.title = title;
        this.genre = genre;
        this.urdu = urdu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getUrdu() {
        return urdu;
    }

    public void setUrdu(String urdu) {
        this.urdu = urdu;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
