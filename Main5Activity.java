package com.drkanwardeepd.ansh0.drkanwardeep;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

import java.util.Date;

public class Main5Activity extends AppCompatActivity {
TextView named,nod,timed,dateset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        String name,no,time;
        name= getIntent().getStringExtra("name");
        no= getIntent().getStringExtra("no");
        time= getIntent().getStringExtra("time");

        timed= findViewById(R.id.timed);

        named=findViewById(R.id.named);
        nod= findViewById(R.id.nod);
        named.setText("Name-"+name);
        timed.setText("Time-"+time);
        nod.setText("PH. NO.-"+no);
        dateset= findViewById(R.id.dateset);
        Date d= new Date();
        String s= String.valueOf(d.getDate());
        s="Date-"+s+"/"+String.valueOf(d.getMonth()+1);
        dateset.setText(s);






    }
}
