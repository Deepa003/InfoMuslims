package com.infomuslims;

/**
 * Created by renu on 17/08/17.
 */
public class DailyDuaSubListModel {

    private String title_urdu, title_hindi, title_english;

    public DailyDuaSubListModel() {
    }

    public DailyDuaSubListModel(String title_urdu, String title_hindi, String title_english) {
        this.title_urdu = title_urdu;
        this.title_hindi = title_hindi;
        this.title_english = title_english;
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

    public String getTitle_english() {
        return title_english;
    }

    public void setTitle_english(String title_english) {
        this.title_english = title_english;
    }
}
