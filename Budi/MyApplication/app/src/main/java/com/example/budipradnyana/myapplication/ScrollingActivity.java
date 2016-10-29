package com.example.budipradnyana.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.budipradnyana.myapplication.Adapter.MyAdapter;
import com.example.budipradnyana.myapplication.Model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }



        });

        List<Mahasiswa> mhslist = new ArrayList<>();
        String url = getIntent().getStringExtra("url");  //buat ngambil data yang di terusin dari intent

        for(int i=0; i<20; i++){
            mhslist.add(new Mahasiswa("BUDI-"+i,"123-"+i,url));
        }

        MyAdapter myAdapter = new MyAdapter(mhslist, ScrollingActivity.this);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager((ScrollingActivity.this)));
        recyclerView.setAdapter(myAdapter);
    }
}
