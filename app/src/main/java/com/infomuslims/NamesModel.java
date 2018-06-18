package com.infomuslims;

/**
 * Created by renu on 15/08/17.
 */
public class NamesModel {

    private String title_names, genre_names, urdu_names, count;

    public NamesModel() {
    }

    public NamesModel(String title_names, String genre_names, String urdu_names, String count) {
        this.title_names = title_names;
        this.genre_names = genre_names;
        this.urdu_names = urdu_names;
        this.count = count;
    }

    public String getGenre_names() {
        return genre_names;
    }

    public void setGenre_names(String genre_names) {
        this.genre_names = genre_names;
    }

    public String getTitle_names() {
        return title_names;
    }

    public void setTitle_names(String title_names) {
        this.title_names = title_names;
    }

    public String getUrdu_names() {
        return urdu_names;
    }

    public void setUrdu_names(String urdu_names) {
        this.urdu_names = urdu_names;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
