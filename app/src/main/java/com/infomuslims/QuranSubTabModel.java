package com.infomuslims;

/**
 * Created by renu on 16/08/17.
 */
public class QuranSubTabModel {

    private String title_urdu, title_hindi;

    public QuranSubTabModel() {
    }

    public QuranSubTabModel(String title_urdu, String title_hindi) {
        this.title_urdu = title_urdu;
        this.title_hindi = title_hindi;

    }

    public String getTitle_urdu() {
        return title_urdu;
    }

    public void setTitle_urdu(String title_urdu) {
        this.title_urdu = title_urdu;
    }

    public String getTitle_hindi() {
        return title_hindi;
    }

    public void setTitle_hindi(String title_hindi) {
        this.title_hindi = title_hindi;
    }
}
