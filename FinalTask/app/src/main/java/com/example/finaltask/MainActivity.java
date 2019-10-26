package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar() != null)
            getSupportActionBar().hide();
    }

    public void btn_Click(View v){
        Toast.makeText(this,"Hello World",Toast.LENGTH_LONG).show();
    }
    public void nextClick(View v){
        Intent intent = new Intent(this,PhotoActivity.class);
        startActivity(intent);
    }
}
