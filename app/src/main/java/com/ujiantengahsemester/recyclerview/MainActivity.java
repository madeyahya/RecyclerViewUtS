package com.ujiantengahsemester.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHewan;
    private ArrayList<hewan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHewan = findViewById(R.id.rv_hewan);
        rvHewan.setHasFixedSize(true);

        list.addAll(hewanData.getlistData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvHewan.setLayoutManager(new LinearLayoutManager( this));
        listHewanAdapter listHewanAdapter = new listHewanAdapter(list);
        rvHewan.setAdapter(listHewanAdapter);
    }
}