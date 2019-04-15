package com.example.vmcdirectory.Clinics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vmcdirectory.Departments.rads;
import com.example.vmcdirectory.R;

public class clinics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics);


        Button deptsbtn = (Button)findViewById(R.id.ecubtn);
        deptsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ecu.class);

                startActivity(startIntent);

            }});

    }
}