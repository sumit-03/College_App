package com.example.quantum.college_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class e_summit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_summit);

    }

    @Override
    protected void onStart() {
        super.onStart();
        startActivity(new Intent(e_summit.this,MainActivity.class));
    }
}
