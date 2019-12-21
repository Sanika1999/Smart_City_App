package com.example.newtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Road extends AppCompatActivity {
    EditText roadname,roadphno,roadaddress,roadcomplaints;
    Button postroad;
    DatabaseReference rootRef5,demoRef5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road2);

            roadname = (EditText) findViewById(R.id.nameroad);
            roadphno = (EditText) findViewById(R.id.phnoroad);
            roadaddress= (EditText) findViewById(R.id.addressroad);
            roadcomplaints = (EditText) findViewById(R.id.complaintsroad);

            postroad = (Button) findViewById(R.id.postwaste);
            //database reference pointing to root of database
            rootRef5 = FirebaseDatabase.getInstance().getReference();
            demoRef5 = rootRef5.child("details");

            postroad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String a3 = roadname.getText().toString();
                    String b3 = roadphno.getText().toString();
                    String c3 = roadaddress.getText().toString();
                    String d3 = roadcomplaints.getText().toString();

//push creates a unique id in database
                    demoRef5.push().setValue(a3);
                    demoRef5.push().setValue(b3);
                    demoRef5.push().setValue(c3);
                    demoRef5.push().setValue(d3);
                }
            });
        }
    }

