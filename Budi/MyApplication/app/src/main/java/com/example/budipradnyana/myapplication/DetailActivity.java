package com.example.budipradnyana.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    TextView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detail= (TextView) findViewById(R.id.detailtext);
        String name = getIntent().getStringExtra("name");
        detail.setText("HELLO"+name);

    }
}
