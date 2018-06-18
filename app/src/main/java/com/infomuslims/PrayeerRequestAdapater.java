package com.infomuslims;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

/**
 * Created by renu on 19/08/17.
 */
public class PrayeerRequestAdapater extends ArrayAdapter<PrayerRequestModel> {

    private LayoutInflater mInflater;
    private ArrayList<PrayerRequestModel> users;
    private int mViewResourceId;

    public PrayeerRequestAdapater(Context context, int textViewResourceId, ArrayList<PrayerRequestModel> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        PrayerRequestModel user = users.get(position);

        if (user != null) {
            TextView firstName = (TextView) convertView.findViewById(R.id.tv_name);
            TextView lastName = (TextView) convertView.findViewById(R.id.tv_summary);
            if (firstName != null) {
                firstName.setText(user.getName());
            }
            if (lastName != null) {
                lastName.setText((user.getSummary()));
            }

        }

        return convertView;
    }
}
