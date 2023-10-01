package com.example.myresultviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button gpa,cgpa,att,acd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gpa=findViewById(R.id.gpa);
        cgpa=findViewById(R.id.cgpa);
        att=findViewById(R.id.att);
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),SecndActivity.class);
                startActivity(i);
            }
        });

        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Gpa.class);
                startActivity(i);
            }
        });


        att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Attendance.class);
                startActivity(i);
            }
        });
    }
}