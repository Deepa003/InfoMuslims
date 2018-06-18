package com.infomuslims;

/**
 * Created by renu on 19/08/17.
 */
public class PrayerRequestModel {

        private String name;
        private String summary;

        public PrayerRequestModel(String name, String summary) {
           this.name = name;
            this.summary = summary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
