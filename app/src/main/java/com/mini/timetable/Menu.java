package com.mini.timetable;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends Activity {

    String FILENAME = "ini";
    int s;
    DBController controller = new DBController(this);

    FileOutputStream fos;

    int n = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                try {
                    FileInputStream fos = openFileInput(FILENAME);
                    try {
                        s = fos.read();
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                if (s != 1) {

                    Vector queryValues = new Vector();
                    queryValues.add("1");
                    queryValues.add("p1");
                    queryValues.add("p2");
                    queryValues.add("p3");
                    queryValues.add("p4");
                    queryValues.add("p5");
                    queryValues.add("p6");
                    queryValues.add("p7");
                    controller.insertdb(queryValues);

                    queryValues = new Vector();
                    queryValues.add("2");
                    queryValues.add("p1");
                    queryValues.add("p2");
                    queryValues.add("p3");
                    queryValues.add("p4");
                    queryValues.add("p5");
                    queryValues.add("p6");
                    queryValues.add("p7");
                    controller.insertdb(queryValues);

                    queryValues = new Vector();
                    queryValues.add("3");
                    queryValues.add("p1");
                    queryValues.add("p2");
                    queryValues.add("p3");
                    queryValues.add("p4");
                    queryValues.add("p5");
                    queryValues.add("p6");
                    queryValues.add("p7");
                    controller.insertdb(queryValues);

                    queryValues = new Vector();
                    queryValues.add("4");
                    queryValues.add("p1");
                    queryValues.add("p2");
                    queryValues.add("p3");
                    queryValues.add("p4");
                    queryValues.add("p5");
                    queryValues.add("p6");
                    queryValues.add("p7");
                    controller.insertdb(queryValues);

                    queryValues = new Vector();
                    queryValues.add("5");
                    queryValues.add("p1");
                    queryValues.add("p2");
                    queryValues.add("p3");
                    queryValues.add("p4");
                    queryValues.add("p5");
                    queryValues.add("p6");
                    queryValues.add("p7");
                    controller.insertdb(queryValues);


                    try {

                        fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
                        try {
                            fos.write(n);
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (FileNotFoundException e) {
                    }
                    Toast.makeText(getApplicationContext(), "db Created", Toast.LENGTH_LONG).show();


                }


                Intent i = new Intent(view.getContext(), Start.class);
                startActivityForResult(i, 0);

            }

        });

    }

}
