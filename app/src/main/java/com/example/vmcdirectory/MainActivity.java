package com.example.vmcdirectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vmcdirectory.Clinics.clinics;
import com.example.vmcdirectory.Departments.depts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MainActivitybtn = (Button)findViewById(R.id.unitsbtn);
        MainActivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), units.class);

                startActivity(startIntent);

            }
        });

        MainActivitybtn = (Button)findViewById(R.id.searchbtn);
        MainActivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Search.class);

                startActivity(startIntent);

            }
        });

        MainActivitybtn = (Button)findViewById(R.id.deptsbtn);
        MainActivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),depts.class);

                startActivity(startIntent);

            }
        });

        MainActivitybtn = (Button)findViewById(R.id.clinicsbtn);
        MainActivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), clinics.class);

                startActivity(startIntent);

            }
        });
    }
}
