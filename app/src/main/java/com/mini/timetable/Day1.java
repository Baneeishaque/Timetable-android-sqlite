package com.mini.timetable;


import java.util.Vector;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

@SuppressLint("ShowToast")
public class Day1 extends Activity {

    DBController controller = new DBController(this);
    EditText t1, t2, t3, t4, t5, t6, t7;

    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
        t1 = (EditText) findViewById(R.id.editText1);
        t2 = (EditText) findViewById(R.id.editText2);
        t3 = (EditText) findViewById(R.id.editText3);
        t4 = (EditText) findViewById(R.id.editText4);
        t5 = (EditText) findViewById(R.id.editText5);
        t6 = (EditText) findViewById(R.id.editText6);
        t7 = (EditText) findViewById(R.id.editText7);

        try {

            Vector v = new Vector();
            v = controller.gettime("1");
            t1.setText(v.elementAt(0).toString());
            t2.setText(v.elementAt(1).toString());
            t3.setText(v.elementAt(2).toString());
            t4.setText(v.elementAt(3).toString());
            t5.setText(v.elementAt(4).toString());
            t6.setText(v.elementAt(5).toString());
            t7.setText(v.elementAt(6).toString());


            Toast.makeText(this, "Alldone!", 1).show();
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), 1).show();
        }


    }


    public void update(View v) {
        Vector e = new Vector();
        e.add("1");
        e.add(t1.getEditableText());
        e.add(t2.getEditableText());
        e.add(t3.getEditableText());
        e.add(t4.getEditableText());
        e.add(t5.getEditableText());
        e.add(t6.getEditableText());
        e.add(t7.getEditableText());
        controller.updatetime(e);
        Toast.makeText(this, "ok", 1).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.day1, menu);
        return true;
    }

}

