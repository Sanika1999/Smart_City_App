package com.example.newtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Waste extends AppCompatActivity {
    EditText wastename,wastephno,wasteaddress,wastecomplaints;
    Button postwaste;
    DatabaseReference rootRef3,demoRef3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waste);
        wastename = (EditText) findViewById(R.id.namewaste);
        wastephno = (EditText) findViewById(R.id.phnowaste);
        wasteaddress= (EditText) findViewById(R.id.addresswaste);
        wastecomplaints = (EditText) findViewById(R.id.complaintswaste);

        postwaste = (Button) findViewById(R.id.postwaste);
        //database reference pointing to root of database
        rootRef3 = FirebaseDatabase.getInstance().getReference();
        demoRef3 = rootRef3.child("details");

       postwaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a2 = wastename.getText().toString();
                String b2 = wastephno.getText().toString();
                String c2 = wasteaddress.getText().toString();
                String d2 = wastecomplaints.getText().toString();

//push creates a unique id in database
                demoRef3.push().setValue(a2);
                demoRef3.push().setValue(b2);
                demoRef3.push().setValue(c2);
                demoRef3.push().setValue(d2);
            }
        });
    }
}
