package com.example.newtest;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    Button road100;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding electricity button
        button= (Button)findViewById(R.id.electricity);
        //capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent1 = new Intent(MainActivity.this,
                        Electricity.class);
                startActivity(myIntent1);


            }
        });

        button2= (Button)findViewById(R.id.water);
        //capture button clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent2 = new Intent(MainActivity.this,
                        Water.class);
                startActivity(myIntent2);
            }
        });
        button3= (Button)findViewById(R.id.wasteb);
        //capture button clicks
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent3 = new Intent(MainActivity.this,
                        Waste.class);
                startActivity(myIntent3);
            }
        });
        road100= (Button)findViewById(R.id.roadb);
        //capture button clicks
        road100.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntenttt4 = new Intent(MainActivity.this,
                        Roadmanagement.class);
                startActivity(myIntenttt4);
            }
        });







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}





