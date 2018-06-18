package com.infomuslims;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by renu on 15/08/17.
 */
public class PrayerRequestFragment extends Fragment {

    View view;
    EditText et_name, et_summary;
    Button btn_submmit;
    TextView tv_submit_response;
    DatabaseHelper myDB;

    public PrayerRequestFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.prayer_request_fragment, container, false);

        myDB=new DatabaseHelper(getActivity());

        et_name = (EditText) view.findViewById(R.id.et_name);
        et_summary = (EditText) view.findViewById(R.id.et_summary);
        tv_submit_response = (TextView) view.findViewById(R.id.tv_submit_response);


        btn_submmit = (Button) view.findViewById(R.id.btn_submmit);
        btn_submmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 String fName = et_name.getText().toString();
                 String lName = et_summary.getText().toString();

                if(fName.length() != 0 && lName.length() != 0 )
                {
                    AddData(fName, lName);
                    et_name.setText("");
                    et_summary.setText("");
                    
                     }
                else
                {
                    Toast.makeText(getActivity(),"You must put something in the text field!",Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;

    }

    public void AddData(String firstName,String lastName ){
        boolean insertData = myDB.addData(firstName,lastName);

        if(insertData==true)
        {
            tv_submit_response.setVisibility(View.VISIBLE);

        }
        else
        {
            Toast.makeText(getActivity(),"Something went wrong :(.",Toast.LENGTH_LONG).show();
        }
    }
}