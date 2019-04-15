package com.example.vmcdirectory.Clinics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.vmcdirectory.R;
import com.example.vmcdirectory.RecyclerViewAdapter;

import java.util.ArrayList;

public class ecu extends AppCompatActivity {

    private static final String TAG = "ecu";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecu);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://imgur.com/4pEkSEa");
        mNames.add("ECU IM 744-3229");

        mImageUrls.add("https://imgur.com/iTsuU00");
        mNames.add("ECU IM Backdoor scheduler 744-3260");

        mImageUrls.add("https://imgur.com/b15JZpK");
        mNames.add("ECU FM  744-4611");

        mImageUrls.add("https://imgur.com/EC11qsG");
        mNames.add("ECU IM-PEDS  4-0750");

        mImageUrls.add("https://imgur.com/6d7EACh");
        mNames.add("ECU Cards  4-4400");

        mImageUrls.add("https://imgur.com/qAZFowg");
        mNames.add("ECU Infectious Disease  4-4500");

        mImageUrls.add("https://imgur.com/3YXkzcW");
        mNames.add("ECU Nephrology  4-2545");

        mImageUrls.add("https://imgur.com/FJmhod0");
        mNames.add("ECU Pulmonary  744-4653");

        mImageUrls.add("https://imgur.com/wSjUM6h");
        mNames.add("ECU Neurology  744-9400");

        initRecyclerView();

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}


