package com.example.newtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Roadmanagement extends AppCompatActivity {
    EditText nameroad100,phnoroad100,addressroad100,complaintsroad100;
    Button postroad100;
    DatabaseReference rootRefroad100,demoRefroad100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roadmanagement);
        nameroad100 = (EditText) findViewById(R.id.roadname100);
        phnoroad100 = (EditText) findViewById(R.id.phnoroad100);
        addressroad100 = (EditText) findViewById(R.id.addressroad100);

        postroad100 = (Button) findViewById(R.id.postroad100);
        //database reference pointing to root of database
        rootRefroad100 = FirebaseDatabase.getInstance().getReference();
        demoRefroad100 = rootRefroad100.child("details");
        postroad100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa = nameroad100.getText().toString();
                String bb = phnoroad100.getText().toString();
                String cc = addressroad100.getText().toString();
                String dd = complaintsroad100.getText().toString();

//push creates a unique id in database
                demoRefroad100.push().setValue(aa);
                demoRefroad100.push().setValue(bb);
                demoRefroad100.push().setValue(cc);
                demoRefroad100.push().setValue(dd);
            }
        });
    }
}
