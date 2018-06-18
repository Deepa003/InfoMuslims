package com.infomuslims;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by renu on 17/08/17.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "users.db";
    public static final String TABLE_NAME = "users_data";
    public static final String TABLE_NAME_NOTIFICATION = "users_message";
    public static final String COL1 = "ID";
    public static final String COL2 = "FIRSTNAME";
    public static final String COL3 = "LASTNAME";
    public static final String COL4 = "TITLE";
    public static final String COL5 = "MESSAGE";
    public static final String COL6 = "TIME";
    public static final String COL7 = "ACTIVITY";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " FIRSTNAME TEXT, LASTNAME TEXT)";

        String notificationTable = "CREATE TABLE " + TABLE_NAME_NOTIFICATION + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " TITLE TEXT , MESSAGE TEXT , TIME TEXT , ACTIVITY TEXT)";

        db.execSQL(createTable);
        db.execSQL(notificationTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        db.execSQL("DROP IF TABLE EXISTS \" + TABLE_NAME_NOTIFICATION");
        onCreate(db);
    }

    public boolean addData(String fName, String lName) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, fName);
        contentValues.put(COL3, lName);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }


    // insert notification
    public boolean notifyData(String title, String message,  String date_time, String activity_opened) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(COL4, title);
        contentValues1.put(COL5, message);
        contentValues1.put(COL6, date_time);
        contentValues1.put(COL7, activity_opened);

        long result = db.insert(TABLE_NAME_NOTIFICATION, null, contentValues1);

        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            Log.e("RESULT",">>>"+result);
            return true;
        }
    }

    //query for 1 week repeats
    public Cursor getListContents() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }


    // list items to view notifications
    public Cursor getNotifyContents() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME_NOTIFICATION, null);
        return data;
    }


    public void delete(){

        SQLiteDatabase db = this.getWritableDatabase();
       // String delete = "DELETE FROM "+TABLE_NAME_NOTIFICATION;
        db.delete(TABLE_NAME_NOTIFICATION, null, null);
    }
}
