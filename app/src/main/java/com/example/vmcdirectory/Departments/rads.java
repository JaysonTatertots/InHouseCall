package com.example.vmcdirectory.Departments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import com.example.vmcdirectory.R;
import com.example.vmcdirectory.RecyclerViewAdapter;


public class rads extends AppCompatActivity {

    private static final String TAG = "rads";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rads);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://imgur.com/4pEkSEa");
        mNames.add("Main 7-4485");

        mImageUrls.add("https://imgur.com/iTsuU00");
        mNames.add("MRI  7-3067");

        mImageUrls.add("https://imgur.com/b15JZpK");
        mNames.add("Ultrasound  7-7081");

        mImageUrls.add("https://imgur.com/EC11qsG");
        mNames.add("ECHO/TEE  7-7385");

        mImageUrls.add("https://imgur.com/6d7EACh");
        mNames.add("Interventional Radiology  7-4644");

        mImageUrls.add("https://imgur.com/qAZFowg");
        mNames.add("X-Ray/File Room  7-6770");

        mImageUrls.add("https://imgur.com/3YXkzcW");
        mNames.add("Nuclear  7-4770");

        mImageUrls.add("https://imgur.com/FJmhod0");
        mNames.add("Ultrasound  7-4549");

        mImageUrls.add("https://imgur.com/wSjUM6h");
        mNames.add("Bronch lab  7-4536");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}