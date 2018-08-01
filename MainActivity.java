package com.drkanwardeepd.ansh0.drkanwardeep;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button buttonTake;

    Button cancelit,buttona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date datea= new Date();
        int sundaycheck= datea.getDay();
        if(sundaycheck == 0)
        {

            Intent intentSunday= new Intent(MainActivity.this,Main10Activity.class);
            startActivity(intentSunday);

        }else {


            FirebaseDatabase.getInstance().getReference().child("Dates").addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                    String str = dataSnapshot.getValue(String.class);
                    Date date1 = new Date();
                    String t = String.valueOf(date1.getDate());
                    if (!t.equals(str)) {
                        FirebaseDatabase.getInstance().getReference().child("Appointments").removeValue();
                        FirebaseDatabase.getInstance().getReference().child("Canceled").removeValue();
                        FirebaseDatabase.getInstance().getReference().child("Times").removeValue();
                        FirebaseDatabase.getInstance().getReference().child("Dates").removeValue();
                        FirebaseDatabase.getInstance().getReference().child("Dates").push().setValue(t);
                    }
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


            buttonTake = findViewById(R.id.buttonTake);
            cancelit = findViewById(R.id.cancelit);

            buttona = findViewById(R.id.buttona);
            buttonTake.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(intent);

                }
            });
            cancelit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, Main7Activity.class);
                    startActivity(i);
                }
            });

            buttona.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, Main8Activity.class);
                    startActivity(i);
                }
            });


        }

    }
}
