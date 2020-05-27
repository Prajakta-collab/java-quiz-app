package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    String name;
    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvresult=findViewById(R.id.tvresult);
        Intent intent=getIntent();
        name=intent.getStringExtra("USER_NAME");
        Integer marks=intent.getIntExtra("USER_ID",0);

        tvresult.setText("Congratulations !    "+name+" you have got "+marks+" /10  marks !");


    }
}
