package com.example.vmcdirectory.Units.north;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import com.example.vmcdirectory.R;
import com.example.vmcdirectory.RecyclerViewAdapter;


public class siu extends AppCompatActivity {

    private static final String TAG = "siu";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siu);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://imgur.com/4pEkSEa");
        mNames.add("Secretary  7-xxxx");

        mImageUrls.add("https://imgur.com/iTsuU00");
        mNames.add("Charge Nurse  7-xxxx");

        mImageUrls.add("https://imgur.com/b15JZpK");
        mNames.add("Fax  7-xxxx");

        mImageUrls.add("https://imgur.com/EC11qsG");
        mNames.add("Case Manager  7-xxxx/7-xxxx");

        mImageUrls.add("https://imgur.com/6d7EACh");
        mNames.add("Pharmacist  7-xxxx");

        mImageUrls.add("https://imgur.com/qAZFowg");
        mNames.add("Nutritionist  7-xxxx/pager.xxxx");

        mImageUrls.add("https://imgur.com/3YXkzcW");
        mNames.add("RN Pods  7-xxxx");

        mImageUrls.add("https://imgur.com/FJmhod0");
        mNames.add("Nurse Manager  7-xxxx");

        mImageUrls.add("https://imgur.com/wSjUM6h");
        mNames.add("NP/PA/Resident Rooms  7-xxxx");

        mImageUrls.add("https://imgur.com/c7J9oq0");
        mNames.add("PT/OT office  7-xxxx");

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
