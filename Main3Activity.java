package com.drkanwardeepd.ansh0.drkanwardeep;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
Button morning,evening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ConstraintLayout view1= findViewById(R.id.view1);
        view1.setBackgroundColor(Color.parseColor("#FFDE03"));
        morning= findViewById(R.id.morning);
        evening= findViewById(R.id.eveningit );
        morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        evening.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i= new Intent(Main3Activity.this,Main6Activity.class);
        startActivity(i);
    }
});
    }
}
