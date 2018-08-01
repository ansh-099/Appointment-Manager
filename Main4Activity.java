package com.drkanwardeepd.ansh0.drkanwardeep;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
  Button button;
  EditText editNo;
  EditText editName;
  EditText age;
  TextView tvtime;
    ArrayList<String> arrayList= new ArrayList<>();
    Boolean bool;
    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editNo = findViewById(R.id.editNo);
        editName = findViewById(R.id.editName);
        button = findViewById(R.id.button);
        tvtime= findViewById(R.id.tvtime);
        age= findViewById(R.id.age);
//ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(Main4Activity.this,
//        R.layout.support_simple_spinner_dropdown_item,
//        getResources().getStringArray(R.array.slots));
     tvtime.setText(getIntent().getStringExtra("time"));
        s=getIntent().getStringExtra("time");
        FirebaseDatabase.getInstance().getReference().child("Times").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String t = dataSnapshot.getValue(String.class);
                arrayList.add(t);
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

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String number;
                    number = editNo.getText().toString();
                    String name1;
                    name1 = editName.getText().toString();
                    Boolean b;
                    b = ((s.equals("")) || (name1.equals("")) || (number.equals("")) || (s == null) || (name1 == null) || (number == null));

                    Log.d("hey", b.toString());
                    if (b) {
                        Toast.makeText(Main4Activity.this, "Fill The Requirements", Toast.LENGTH_SHORT).show();
                    } else {
                        bool = true;
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (arrayList.get(i).equals(s)) {
                                bool = false;
                                break;
                            }
                        }


                        if (bool) {
                            OneApp oneApp = new OneApp(s, name1, number,age.getText().toString());
                            FirebaseDatabase.getInstance().getReference().child("Appointments").push().setValue(oneApp);
                            FirebaseDatabase.getInstance().getReference().child("Times").push().setValue(oneApp.time);
                            Intent i = new Intent(Main4Activity.this, Main5Activity.class);
                            i.putExtra("name",oneApp.name);
                            i.putExtra("no",oneApp.no);
                            i.putExtra("time",oneApp.time);
                            startActivity(i);
                        } else {
                            Toast.makeText(Main4Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
            });
        }


}
