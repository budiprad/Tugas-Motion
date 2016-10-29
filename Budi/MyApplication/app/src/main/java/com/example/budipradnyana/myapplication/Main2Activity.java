package com.example.budipradnyana.myapplication;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    Button backAct1, toast2, snackbar2,toAct3;
    RelativeLayout rl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        backAct1 = (Button) findViewById(R.id.backAct1);
        toAct3 = (Button) findViewById(R.id.toAct3);
        toast2 = (Button) findViewById(R.id.toast2);
        snackbar2 = (Button) findViewById(R.id.snackbar2);
        rl2 = (RelativeLayout)findViewById(R.id.activity_main2);


        toAct3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent to3 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(to3);
            }
        });

        backAct1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent to1 = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(to1);
            }
        });

        toast2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Still in Act 2", Toast.LENGTH_LONG).show();
            }
        });

        snackbar2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(rl2, "This is Snackbar Act2", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });
    }
}
