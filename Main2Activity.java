package com.drkanwardeepd.ansh0.drkanwardeep;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity  {

    Button tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16;
    Boolean b1=false,b2=false,b3=false,b4=false,b5=false;
    Boolean b6=false,b7=false,b8=false,b9=false,b10=false,b11=false,b12=false,b13=false,b14=false,b15=false,b16=false;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1= findViewById(R.id.tv1);
        tv2= findViewById(R.id.tv2);
        tv3= findViewById(R.id.tv3);
        tv4= findViewById(R.id.tv4);
        tv5= findViewById(R.id.tv5);
        tv6= findViewById(R.id.tv6);
        tv7= findViewById(R.id.tv7);
        tv8= findViewById(R.id.tv8);
        tv9= findViewById(R.id.tv9);
        tv10= findViewById(R.id.tv10);
        tv11= findViewById(R.id.tv11);
        tv12= findViewById(R.id.tv12);
        tv13= findViewById(R.id.tv13);
        tv14= findViewById(R.id.tv14);
        tv15= findViewById(R.id.tv15);
        tv16= findViewById(R.id.tv16);


        t2=findViewById(R.id.t2);
        t2.setBackgroundColor(Color.RED);







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






        tv1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(!b1){
        String temp= "9:00AM";
        Intent i= new Intent(Main2Activity.this,Main4Activity.class);
        i.putExtra("time",temp);
        startActivity(i);}
        else{
            Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();}
    }
});
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b2) {
                    String temp = "9:15AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                }
                else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b3){
                String temp= "9:30AM";
                Intent i= new Intent(Main2Activity.this,Main4Activity.class);
                i.putExtra("time",temp);
                startActivity(i);
            } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b4) {
                    String temp = "9:45AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b5) {
                    String temp = "10:00AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b6) {
                    String temp = "10:15AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b7) {
                    String temp = "10:30AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b8) {
                    String temp = "10:45AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b9) {
                    String temp = "11:00AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b10) {
                    String temp = "11:15AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b11) {
                    String temp = "11:30AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b12) {
                    String temp = "11:45AM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b13) {
                    String temp = "12:00PM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b14) {
                    String temp = "12:15PM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b15) {
                    String temp = "12:30PM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b16) {
                    String temp = "12:45PM";
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    i.putExtra("time", temp);
                    startActivity(i);
                } else{
                    Toast.makeText(Main2Activity.this, "This Time Slot is taken", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }

    void checkIf(String t)
    {


        if(t.equals("9:00AM"))
        {
            tv1.setBackgroundColor(Color.RED);
            b1=true;
        }
        if(t.equals("9:15AM"))
        {
            tv2.setBackgroundColor(Color.RED);
            b2= true;
        }
        if(t.equals("9:30AM"))
        {b3= true;
            tv3.setBackgroundColor(Color.RED);
        }
        if(t.equals("9:45AM"))
        {b4=true;
            tv4.setBackgroundColor(Color.RED);
        }
        if(t.equals("10:00AM"))
        {b5=true;
            tv5.setBackgroundColor(Color.RED);
        }
        if(t.equals("10:15AM"))
        {b6=true;
            tv6.setBackgroundColor(Color.RED);
        }
        if(t.equals("10:30AM"))
        {b7=true;
            tv7.setBackgroundColor(Color.RED);
        }
        if(t.equals("10:45AM"))
        {b8=true;
            tv8.setBackgroundColor(Color.RED);
        }
        if(t.equals("11:00AM"))
        {b9=true;
            tv9.setBackgroundColor(Color.RED);
        }
        if(t.equals("11:15AM"))
        {b10=true;
            tv10.setBackgroundColor(Color.RED);
        }
        if(t.equals("11:30AM"))
        {b11=true;
            tv11.setBackgroundColor(Color.RED);
        }
        if(t.equals("11:45AM"))
        {b12=true;
            tv12.setBackgroundColor(Color.RED);
        }
        if(t.equals("12:00PM"))
        {b13=true;
            tv13.setBackgroundColor(Color.RED);
        }
        if(t.equals("12:15PM"))
        {b14=true;
            tv14.setBackgroundColor(Color.RED);
        }
        if(t.equals("12:30PM"))
        {b15=true;
            tv15.setBackgroundColor(Color.RED);
        }
        if(t.equals("12:45PM"))
        {b16=true;
            tv16.setBackgroundColor(Color.RED);
        }

    }


}
