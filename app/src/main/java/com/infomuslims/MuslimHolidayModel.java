package com.infomuslims;

/**
 * Created by renu on 13/08/17.
 */
public class MuslimHolidayModel {

    private String title_holiday, date_holiday;

    public MuslimHolidayModel() {
    }

    public MuslimHolidayModel(String title_holiday, String date_holiday) {
        this.title_holiday = title_holiday;
        this.date_holiday = date_holiday;
    }

    public String getTitle_holiday() {
        return title_holiday;
    }

    public void setTitle_holiday(String title_holiday) {
        this.title_holiday = title_holiday;
    }

    public String getDate_holiday() {
        return date_holiday;
    }

    public void setDate_holiday(String date_holiday) {
        this.date_holiday = date_holiday;
    }
}
