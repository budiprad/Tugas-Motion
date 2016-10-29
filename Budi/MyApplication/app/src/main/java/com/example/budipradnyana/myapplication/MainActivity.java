package com.example.budipradnyana.myapplication;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toAct2, toast1, snackbar1;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toAct2 = (Button) findViewById(R.id.toAct2);
        toast1 = (Button) findViewById(R.id.toast1);
        snackbar1 = (Button) findViewById(R.id.snackbar1);
        rl = (RelativeLayout)findViewById(R.id.activity_main);

        toAct2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent to2 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(to2);
            }
        });

        toast1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Still in Act 1", Toast.LENGTH_LONG).show();
            }
        });

        snackbar1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(rl, "This is Snackbar Act1", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });
    }


}
