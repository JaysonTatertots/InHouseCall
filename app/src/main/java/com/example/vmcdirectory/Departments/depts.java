package com.example.vmcdirectory.Departments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vmcdirectory.R;
import com.example.vmcdirectory.Units.EastSouth;
import com.example.vmcdirectory.Units.North;
import com.example.vmcdirectory.Units.West;

public class depts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts);

        Button deptsbtn = (Button)findViewById(R.id.radsbtn);
        deptsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), rads.class);

                startActivity(startIntent);

            }});

    }
}
