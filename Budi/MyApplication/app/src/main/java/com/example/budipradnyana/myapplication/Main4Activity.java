package com.example.budipradnyana.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main4Activity extends AppCompatActivity {

    ImageView imgView;
    Button btnDownload,btnMove;
    String imgURL ="https://cdn1.pcadvisor.co.uk/cmsdata/features/3613985/android_800_thumb800.jpg";
    String gifURL = "http://3.bp.blogspot.com/-eKytHWQMw0o/UkdX5PuTrRI/AAAAAAAAGNs/38nqnskcjIs/s400/3dmotionpicture2.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imgView = (ImageView) findViewById(R.id.imageview);
        btnDownload = (Button) findViewById(R.id.btnDownload);
        btnMove = (Button) findViewById(R.id.move);

        btnDownload.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Glide.with(Main4Activity.this).load(imgURL).into(imgView);
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent toScrolling = new Intent(Main4Activity.this, ScrollingActivity.class);
                toScrolling.putExtra("url",imgURL);
                startActivity(toScrolling);
            }
        });
    }
}
