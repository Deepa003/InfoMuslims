package com.infomuslims;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.gcm.GcmListenerService;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by renu on 25/08/17.
 */
public class MyNotificationOpenedHandler extends GcmListenerService implements OneSignal.NotificationOpenedHandler {
    // This fires when a notification is opened by tapping on it.

    DatabaseHelper myDB;
    Context context;
    MyNotificationOpenedHandler(Context context){
        this.context = context;

    }

    @Override
    public void onMessageReceived(String s, Bundle bundle) {
        super.onMessageReceived(s, bundle);

    }

    @Override
    public void notificationOpened(OSNotificationOpenResult result) {
        OSNotificationAction.ActionType actionType = result.action.type;
        JSONObject data = result.notification.payload.additionalData;

        myDB=new DatabaseHelper(context);

        Log.e("DATA",">>>>"+ data);
        String go;

        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

        Log.e("DATA",">>>>>"+result.notification.payload.body); // message
        Log.e("DATA",">>>>>"+result.notification.payload.title); //  title
        Log.e("TIME", ">>>>>" + currentDateTimeString);

        String title = result.notification.payload.title;
        String message = result.notification.payload.body;


        if (data != null)
        {
            go = data.optString("go", null);

            notify_Data(title,message,  currentDateTimeString, go);

            if (go != null && go.equals("1"))
            {
                Log.i("OneSignalExample", "customkey set with value: " + go);
                Intent intent = new Intent(context, QuranActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }

            else if (go != null && go.equals("2")) {
                Log.i("OneSignalExample", "customkey set with value: " + go);
                Intent intent = new Intent(context, NamesActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
            }

            else if (go != null && go.equals("3")){
                Intent intent = new Intent(context, MuslimHolidayActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
            }

            else if (go != null && go.equals("4")){
                Intent intent = new Intent(context, DailyDuaActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
            }

            else if (go != null && go.equals("5")){
                Intent intent = new Intent(context, TasbihActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
            }

            else if (go != null && go.equals("6")){
                Intent intent = new Intent(context, PrayerRequestActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
            }



        }

        //If we send notification with action buttons we need to specidy the button id's and retrieve it to
        //do the necessary operation.
        if (actionType == OSNotificationAction.ActionType.ActionTaken) {
            Log.i("OneSignalExample", "Button pressed with id: " + result.action.actionID);
            if (result.action.actionID.equals("ActionOne")) {
                Toast.makeText(context, "ActionOne Button was pressed", Toast.LENGTH_LONG).show();
            } else if (result.action.actionID.equals("ActionTwo")) {
                Toast.makeText(context, "ActionTwo Button was pressed", Toast.LENGTH_LONG).show();
            }
        }
    }


    // insert data in database
    public void notify_Data(String title,String message,String currentDateTimeString, String go ){

        boolean insertData = myDB.notifyData(title, message,currentDateTimeString, go);
        System.out.print("VALUE++++"+insertData);

        if(insertData==true)
        {
            //Toast.makeText(context,"Something went right :(.",Toast.LENGTH_LONG).show();

        }
        else
        {
            //Toast.makeText(context,"Something went wrong :(.",Toast.LENGTH_LONG).show();
        }
    }


}
