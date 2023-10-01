package com.example.myresultviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Attendance extends AppCompatActivity {
EditText total,attend,nattend;
Button bt;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        total=findViewById(R.id.tot);
        nattend=findViewById(R.id.nattend);
        bt=findViewById(R.id.bt);
        tv=findViewById(R.id.textView2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a,b,c;
                a=Float.parseFloat(String.valueOf(total.getText()));
                // b=Integer.parseInt(String.valueOf(attend));
                c=Float.parseFloat(String.valueOf(nattend.getText()));
                float p;
                p=(a-c)/a;
                p=p*100;
                tv.setText("Attendance % =" + p);
            }
        });
    }
}