package com.mini.timetable;

import java.util.HashMap;
import java.util.Vector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBController extends SQLiteOpenHelper {

    public DBController(Context applicationcontext) {
        super(applicationcontext, "androidsqlite.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String query;
        query = "CREATE TABLE timetable ( day TEXT PRIMARY KEY, p1 TEXT, p2 TEXT, p3 TEXT, p4 TEXT, p5 TEXT, p6 TEXT, p7 TEXT)";
        database.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int version_old,
                          int current_version) {
        String query;
        query = "DROP TABLE IF EXISTS timetable";
        database.execSQL(query);
        onCreate(database);
    }

    public void insertdb(Vector queryValues) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("day", queryValues.elementAt(0).toString());
        values.put("p1", queryValues.elementAt(1).toString());
        values.put("p2", queryValues.elementAt(2).toString());
        values.put("p3", queryValues.elementAt(3).toString());
        values.put("p4", queryValues.elementAt(4).toString());
        values.put("p5", queryValues.elementAt(5).toString());
        values.put("p6", queryValues.elementAt(6).toString());
        values.put("p7", queryValues.elementAt(7).toString());
        database.insert("timetable", null, values);
        database.close();
    }


    public int updatetime(Vector queryValues) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("day", queryValues.elementAt(0).toString());
        values.put("p1", queryValues.elementAt(1).toString());
        values.put("p2", queryValues.elementAt(2).toString());
        values.put("p3", queryValues.elementAt(3).toString());
        values.put("p4", queryValues.elementAt(4).toString());
        values.put("p5", queryValues.elementAt(5).toString());
        values.put("p6", queryValues.elementAt(6).toString());
        values.put("p7", queryValues.elementAt(7).toString());
        return database.update("timetable", values, "day" + " = ?",
                new String[]{queryValues.elementAt(0).toString()});

    }

    public Vector gettime(String day) {
        Vector wordList = new Vector();
        SQLiteDatabase database = this.getReadableDatabase();
        String selectQuery = "SELECT p1,p2,p3,p4,p5,p6,p7 FROM timetable where day='"
                + day + "'";
        Cursor cursor = database.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {

                wordList.add(cursor.getString(0));
                wordList.add(cursor.getString(1));
                wordList.add(cursor.getString(2));
                wordList.add(cursor.getString(3));
                wordList.add(cursor.getString(4));
                wordList.add(cursor.getString(5));
                wordList.add(cursor.getString(6));

            } while (cursor.moveToNext());
        }
        return wordList;
    }
}
