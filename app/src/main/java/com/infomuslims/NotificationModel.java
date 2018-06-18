package com.infomuslims;

/**
 * Created by renu on 26/08/17.
 */
public class NotificationModel {
    private String title;
    private String message;
    private String date_time;
    private String openActivity;



    public NotificationModel(String title, String message,   String date_time, String openActivity) {
        this.title = title;
        this.message = message;
        this.date_time = date_time;
        this.openActivity=openActivity;

    }
    public String getOpenActivity() {
        return openActivity;
    }

    public void setOpenActivity(String openActivity) {
        this.openActivity = openActivity;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

