package com.example.myresultviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Gpa extends AppCompatActivity {
    Spinner g1,g2,g3,g4,g5,g6,g7;
    ArrayAdapter<CharSequence> adapter;
    Button bt;
    TextView gpa;
    EditText c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        bt=findViewById(R.id.bt);
        gpa=findViewById(R.id.gpa);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);

        g1=(Spinner) findViewById(R.id.g1);
        adapter = ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g1.setAdapter(adapter);

        g2=(Spinner) findViewById(R.id.g2);
        adapter = ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g2.setAdapter(adapter);

        g3=(Spinner) findViewById(R.id.g3);
        adapter = ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g3.setAdapter(adapter);

        g4=(Spinner) findViewById(R.id.g4);
        adapter = ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g4.setAdapter(adapter);

        g5=(Spinner) findViewById(R.id.g5);
        adapter = ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g5.setAdapter(adapter);

        g6=(Spinner) findViewById(R.id.g6);
        adapter = ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g6.setAdapter(adapter);

        g7=(Spinner) findViewById(R.id.g7);
        adapter = ArrayAdapter.createFromResource(this,R.array.grades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g7.setAdapter(adapter);

        final String[] a = new String[1];
        final String[] b = new String[1];
        final String[] c = new String[1];
        final String[] d = new String[1];
        final String[] e = new String[1];
        final String[] f = new String[1];
        final String[] g = new String[1];



        g1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                a[0] =adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        g2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                b[0] =adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        g3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                c[0] =adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        g4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                d[0] =adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        g5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                e[0] =adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        g6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                f[0] =adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

        g7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                g[0] =adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

//        HashMap<String,Integer> map=new HashMap<String,Integer>();
//        map.put("S",10);
//        map.put("A",9);
//        map.put("B",8);
//        map.put("C",7);
//        map.put("D",6);
//        map.put("E",5);
//        map.put("F",0);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1,n2,s=0;
                Spinner[] grad = {g1, g2, g3, g4, g5, g6, g7};
                EditText[] credText = {c1,c2,c3,c4,c5,c6,c7};
                String [] gr={a[0],b[0],c[0],d[0],e[0],f[0],g[0]};
                //float [] val={}
                float mul=0,res=0;
                int temp,temp1;

                HashMap<String,Integer> map=new HashMap<String,Integer>();
                map.put("S",10);
                map.put("A",9);
                map.put("B",8);
                map.put("C",7);
                map.put("D",6);
                map.put("E",5);
                map.put("F",0);


                for(int i=0;i<7;i++){
                    String cred=credText[i].getText().toString();
                    if(!cred.isEmpty()){
                        s=s + Integer.parseInt(cred);
                        for(Map.Entry m : map.entrySet()){
                            if(gr[i].equals(m.getKey())){
                                temp=Integer.parseInt(cred);
                                temp1= (int) m.getValue();
                                mul=mul+ (temp * temp1);
                            }

                        }
                    }
                }
                res=mul/s;





//                n1=Float.parseFloat(String.valueOf(c1.getText()));
//                n2=Float.parseFloat(String.valueOf(c2.getText()));
//                s=n1+n2;
//                if(a[0] =="S"){
//                    n1=n1*10;
//                }
//                else if(a[0]=="A"){
//                    n1=n1*9;
//                }
//                else if(a[0]=="B"){
//                    n1=n1*8;
//                }
//                else if(a[0]=="C"){
//                    n1=n1*7;
//                }
//                else if(a[0]=="D"){
//                    n1=n1*6;
//                }
//                else if(a[0]=="E"){
//                    n1=n1*5;
//                }
//                else if(a[0]=="F"){
//                    n1=n1*0;
//                }
//
//                if(b[0] =="S"){
//                    n2=n2*10;
//                }
//                else if(b[0]=="A"){
//                    n2=n2*9;
//                }
//                else if(b[0]=="B"){
//                    n2=n2*8;
//                }
//                else if(b[0]=="C"){
//                    n2=n2*7;
//                }
//                else if(b[0]=="D"){
//                    n2=n2*6;
//                }
//                else if(b[0]=="E"){
//                    n2=n2*5;
//                }
//                else if(b[0]=="F"){
//                    n2=n2*0;
//                }

//                Toast.makeText(getBaseContext(),"h"  + a[0]+"SELECTED",Toast.LENGTH_LONG).show();
//                //Toast.makeText(getApplicationContext(), n1 + "", Toast.LENGTH_SHORT).show();
//               Toast.makeText(Gpa.this, s + "", Toast.LENGTH_SHORT).show();
//                Toast.makeText(Gpa.this, (a[0].equals("A")) + "", Toast.LENGTH_SHORT).show();
////                Float gp;
////                gp=(n1+n2)/s;
                gpa.setText("GPA = " + String.valueOf(res));

            }
        });
    }
}