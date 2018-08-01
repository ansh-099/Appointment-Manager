package com.drkanwardeepd.ansh0.drkanwardeep;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

public class Main6Activity extends AppCompatActivity {
TextView tve1,tve2,tve3,tve4,tve5,tve6,tve7,tve8,tve9,tve10,tve11,tve12;
Boolean be1=false,be2=false,be3=false,be4=false,be5=false,be6=false,be7=false,be8=false;
        Boolean be9=false,be10=false,be11=false,be12=false;
   TextView te2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        te2= findViewById(R.id.te2);
        tve1= findViewById(R.id.tve1);
        tve2= findViewById(R.id.tve2);
        tve3= findViewById(R.id.tve3);
        tve4= findViewById(R.id.tve4);
        tve5= findViewById(R.id.tve5);
        tve6= findViewById(R.id.tve6);
        tve7= findViewById(R.id.tve7);
        tve8= findViewById(R.id.tve8);
        tve9= findViewById(R.id.tve9);
        tve10= findViewById(R.id.tve10);
        tve11= findViewById(R.id.tve11);
        tve12= findViewById(R.id.tve12);

        te2.setBackgroundColor(Color.RED);



      FirebaseDatabase.getInstance().getReference().child("Times").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String t= dataSnapshot.getValue(String.class);
                checkIf(t);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        tve1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be1){
                String temp= "6:00PM";
                Intent i= new Intent(Main6Activity.this,Main4Activity.class);
                i.putExtra("time",temp);
                startActivity(i);
            } else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!be2) {
                   String temp = "6:15PM";
                   Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                   i.putExtra("time", temp);
                   startActivity(i);
               }else{
                   Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
               }
            }
        });
        tve3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!be3) {
                    String temp = "6:30PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be4) {
                    String temp = "6:45PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be5) {
                    String temp = "7:00PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be6) {
                    String temp = "7:15PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be7) {
                    String temp = "7:30PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be8) {
                    String temp = "7:45PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be9) {
                    String temp = "8:00PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tve10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be10) {
                    String temp = "8:15PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be11) {
                    String temp = "8:30PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }else{
                    Toast.makeText(Main6Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tve12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!be12) {
                    String temp = "8:45PM";
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } }
        });



    }
    void checkIf(String t)
    {


        if(t.equals("6:00PM"))
        {be1=true;
            tve1.setBackgroundColor(Color.RED);
        }
        if(t.equals("6:15PM"))
        {
            be2=true;
            tve2.setBackgroundColor(Color.RED);
        }
        if(t.equals("6:30PM"))
        {be3=true;
            tve3.setBackgroundColor(Color.RED);
        }
        if(t.equals("6:45PM"))
        {be4=true;
            tve4.setBackgroundColor(Color.RED);
        }
        if(t.equals("7:00PM"))
        {be5=true;
            tve5.setBackgroundColor(Color.RED);
        }
        if(t.equals("7:15PM"))
        {be6=true;
            tve6.setBackgroundColor(Color.RED);
        }
        if(t.equals("7:30PM"))
        {be7=true;
            tve7.setBackgroundColor(Color.RED);
        }
        if(t.equals("7:45PM"))
        {
            be8=true;
            tve8.setBackgroundColor(Color.RED);
        }
        if(t.equals("8:00PM"))
        {
            be9=true;
            tve9.setBackgroundColor(Color.RED);
        }
        if(t.equals("8:15PM"))
        {
            be10=true;
            tve10.setBackgroundColor(Color.RED);
        }
        if(t.equals("8:30PM"))
        {
            be11=true;
            tve11.setBackgroundColor(Color.RED);
        }
        if(t.equals("8:45PM"))
        {
            be12=true;
            tve12.setBackgroundColor(Color.RED);
        }

    }
}
