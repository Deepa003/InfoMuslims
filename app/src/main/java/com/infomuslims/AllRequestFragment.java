package com.infomuslims;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;


/**
 * Created by renu on 15/08/17.
 */
public class AllRequestFragment extends Fragment {

    TextView tv_name,tv_summary;
    View view;
    private SimpleCursorAdapter dataAdapter;

    DatabaseHelper myDB;
    ArrayList<PrayerRequestModel> userList;
    ListView listView;
    PrayerRequestModel user;
    PrayeerRequestAdapater adapter;
    public AllRequestFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.all_request_fragment, container, false);

        listView = (ListView) view.findViewById(R.id.list_all_dua);

        tv_summary=(TextView)view.findViewById(R.id.tv_summary);
        tv_name=(TextView)view.findViewById(R.id.tv_name);

        myDB = new DatabaseHelper(getActivity());

        userList = new ArrayList<>();
        Cursor data = myDB.getListContents();
        int numRows = data.getCount();
        if(numRows == 0){
            Toast.makeText(getActivity(), "The Database is empty  :(.", Toast.LENGTH_LONG).show();
        }else{
            int i=0;
            while(data.moveToNext()){
                user = new PrayerRequestModel(data.getString(1),data.getString(2));
                userList.add(i,user);
                System.out.println(data.getString(1)+" "+data.getString(2));
                System.out.println(userList.get(i).getName());
                i++;
            }
            adapter =  new PrayeerRequestAdapater(getActivity(),R.layout.all_dua_list, userList);
            listView.setAdapter(adapter);
        }

        return view;
    }


}