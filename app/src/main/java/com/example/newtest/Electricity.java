package com.example.newtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;




public class Electricity extends AppCompatActivity {
    EditText name,phno,address,complaints;
    Button post;
    DatabaseReference rootRef,demoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        name = (EditText) findViewById(R.id.name);
        phno = (EditText) findViewById(R.id.phno);
        address = (EditText) findViewById(R.id.address);
        complaints = (EditText) findViewById(R.id.complaint1);

        post = (Button) findViewById(R.id.post);
        //database reference pointing to root of database
        rootRef = FirebaseDatabase.getInstance().getReference();
        demoRef = rootRef.child("details");

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = name.getText().toString();
                String b = phno.getText().toString();
                String c = address.getText().toString();
                String d = complaints.getText().toString();

//push creates a unique id in database
                   demoRef.push().setValue(a);
                demoRef.push().setValue(b);
                demoRef.push().setValue(c);
                demoRef.push().setValue(d);
            }
        });




    }
}
