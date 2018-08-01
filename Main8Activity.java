package com.drkanwardeepd.ansh0.drkanwardeep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        TextView textViewt= findViewById(R.id.textViewt);
        TextView textViewc= findViewById(R.id.textViewc);
        textViewt.setText("Dr Kanwar Deep is Child Specialist doc" +
                "tor (Pediatrician) and Adolescent Physician .He is runn" +
                "ing a Children’s and Teenage Clinic in East Delh" +
                "i at 116 Hargobind Enclave Delhi 110092 (near" +
                " Karkardooma Metro Station)." );


        textViewc.setText("He is a p" +
                "ediatrics specialist running his Clinic for the last 33 years He has special interest in Childhood Nutrition,Growth of Children,Allergic problems in children and Teenage Medical issues. The mission of Children and Teenage Clinic is to provide Comprehensive and Complete Child care Services -for Newborns, Babies, Children, Teenag" +
                "ers and Adolescents.");
    }
}
