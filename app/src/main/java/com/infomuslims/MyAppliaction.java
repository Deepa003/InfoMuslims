package com.infomuslims;

import android.app.Application;
import android.content.Context;

import com.onesignal.OneSignal;

/**
 * Created by renu on 25/08/17.
 */
public class MyAppliaction extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        //MyNotificationOpenedHandler : This will be called when a notification is tapped on.
        //MyNotificationReceivedHandler : This will be called when a notification is received while your app is running.
        OneSignal.startInit(this)
                .setNotificationOpenedHandler(new MyNotificationOpenedHandler(context))
                .setNotificationReceivedHandler( new MyNotificationReceivedHandler() )
                .init();
    }
}
