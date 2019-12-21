package com.example.newtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Water extends AppCompatActivity {
    EditText watername, phnowater, addresswater, complaintwater;
    Button postwater;
    DatabaseReference rootRef2,demoRef2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        watername = (EditText) findViewById(R.id.watername);
        phnowater = (EditText) findViewById(R.id.phnowater);
        addresswater = (EditText) findViewById(R.id.addresswater);
        complaintwater = (EditText) findViewById(R.id.complaintwater);

        postwater = (Button) findViewById(R.id.postwater);
        //database reference pointing to root of database
        rootRef2 = FirebaseDatabase.getInstance().getReference();
        demoRef2 = rootRef2.child("water details");
        postwater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = watername.getText().toString();
                String phno1 = phnowater.getText().toString();
                String address1 = addresswater.getText().toString();
                String complaint1 = complaintwater.getText().toString();

//push creates a unique id in database
                demoRef2.push().setValue(name1);
                demoRef2.push().setValue(phno1);
                demoRef2.push().setValue(address1);
                demoRef2.push().setValue(complaint1);
            }
        });




    }
}


