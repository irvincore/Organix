package com.example.adolfo.organix_kotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class calendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Calendario");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
