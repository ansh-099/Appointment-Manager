package com.drkanwardeepd.ansh0.drkanwardeep;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Button buttond;
EditText etdno,etdname;
String s;
ArrayList<String> keys=new ArrayList<>();
Spinner spinner2;
ArrayList<String> keyst= new ArrayList<>();
    OneApp a= new OneApp();
ArrayList<OneApp> arrayList= new ArrayList<>();
Boolean b= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        buttond= findViewById(R.id.buttond);
        etdname= findViewById(R.id.etdname);
        etdno= findViewById(R.id.etdno);
        spinner2= findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(this,
                R.array.slots, android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(myAdapter);
     spinner2.setOnItemSelectedListener(Main7Activity.this);
     FirebaseDatabase.getInstance().getReference().child("Times").addChildEventListener(new ChildEventListener() {
         @Override
         public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
             String t=dataSnapshot.getKey();
             keyst.add(t);
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
        FirebaseDatabase.getInstance().getReference().child("Appointments").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                OneApp oneApp= dataSnapshot.getValue(OneApp.class);
               arrayList.add(oneApp);
              String t= dataSnapshot.getKey();
                keys.add(t);

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
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<arrayList.size();i++)
                {


                    if(arrayList.get(i).name.equals(etdname.getText().toString()))
                    {
                        if(arrayList.get(i).no.equals(etdno.getText().toString()))
                        {

                            if(arrayList.get(i).time.equals(s))
                            {  a.age=arrayList.get(i).age;
                                b=true;
                                a.time=s;
                                a.no=arrayList.get(i).no;
                                a.name=arrayList.get(i).name;
                                FirebaseDatabase.getInstance().getReference().child("Appointments").child(keys.get(i)).removeValue();
                                FirebaseDatabase.getInstance().getReference().child("Times").child(keyst.get(i)).removeValue();
                                Intent i1= new Intent(Main7Activity.this,Main9Activity.class);
                                startActivity(i1);
                            }
                        }
                    }
                }

                if(!b)
                {

                    Toast.makeText(Main7Activity.this, "No Appointment is booked with these details", Toast.LENGTH_SHORT).show();
                }
                if(b)
                {


                    FirebaseDatabase.getInstance().getReference().child("Canceled").push().setValue(a);
                }


            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        s = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
