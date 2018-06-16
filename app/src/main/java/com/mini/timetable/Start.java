package com.mini.timetable;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button b1 = (Button) findViewById(R.id.button1);
        Button b4 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Start.this, Timetable.class));

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Start.this, Menu.class));

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

}
