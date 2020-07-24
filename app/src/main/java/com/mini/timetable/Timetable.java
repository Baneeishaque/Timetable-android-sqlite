package com.mini.timetable;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Timetable extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                startActivity(new Intent(Timetable.this, Day1.class));

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                startActivity(new Intent(Timetable.this, Day2.class));

            }

        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                startActivity(new Intent(Timetable.this, Day3.class));

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                startActivity(new Intent(Timetable.this, Day4.class));

            }

        });
        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                startActivity(new Intent(Timetable.this, Day5.class));

            }

        });
        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                startActivity(new Intent(Timetable.this, Start.class));

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.timetable, menu);
        return true;
    }

}
