package com.infomuslims;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {

    private NotificationAdapter mAdapter;
    private View view;
    private boolean add = false;
    private Paint p = new Paint();
    DatabaseHelper myDB;
Context context;
    TextView no_notifications;
    private List<NotificationModel> notificationModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    ImageView img_notify_back, img_del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
context=NotificationActivity.this;
        initViews();
        myDB = new DatabaseHelper(this);

        img_notify_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotificationActivity.this, HomeScreen.class);
                startActivity(intent);
            }
        });


        // setting adapter
        mAdapter = new NotificationAdapter(notificationModelList,context);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // notification listing
        prepareNotificationData();

        img_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* */
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.delete_dialog);

                Button btn_ok = (Button) dialog.findViewById(R.id.btn_ok);
                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public void onClick(View view) {
                        myDB.delete();
                        dialog.dismiss();
                        no_notifications.setVisibility(View.VISIBLE);
                        recyclerView.setVisibility(View.GONE);
                    }
                });

                Button btn_cancel = (Button) dialog.findViewById(R.id.btn_cancel);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        //initDialog();
    }

    private void initViews() {

        // back button
            img_notify_back=(ImageView)findViewById(R.id.img_notify_back);
            img_del=(ImageView)findViewById(R.id.img_del);
            no_notifications= (TextView) findViewById(R.id.no_notifications);
            recyclerView = (RecyclerView)findViewById(R.id.rv_notification);
            recyclerView.setHasFixedSize(true);


    }


    private void prepareNotificationData() {

        Cursor data = myDB.getNotifyContents();
        int numRows = data.getCount();
        if(numRows == 0){
            no_notifications.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
            Toast.makeText(NotificationActivity.this, "No Notifications Found  :(.", Toast.LENGTH_LONG).show();
        }else{
            int i=0;
            while(data.moveToNext()){
                NotificationModel  notificationModel = new NotificationModel(data.getString(1),data.getString(2),data.getString(3),data.getString(4));
                notificationModelList.add(i,notificationModel);
                System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3)+" "+data.getString(4));
                System.out.println(notificationModelList.get(i).getTitle());
                i++;
            }
            recyclerView.setVisibility(View.VISIBLE);
            no_notifications.setVisibility(View.GONE);
            recyclerView.setAdapter(mAdapter);

        }

        mAdapter.notifyDataSetChanged();
    }
}





