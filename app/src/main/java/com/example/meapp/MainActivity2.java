package com.example.meapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

 public class MainActivity2 extends AppCompatActivity {
     TextView MEN;
     TextView WOMEN;
     TextView KIDS;


     @Override

     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         EdgeToEdge.enable(this);
         setContentView(R.layout.activity_2);

         MEN = findViewById(R.id.textView2);
         MEN.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent iNext;
                 iNext  =( new Intent(MainActivity2.this, Main3Activity.class));
                 startActivity(iNext);

             }
         });

         WOMEN= findViewById(R.id.textView3);
         WOMEN.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent  iNext = new Intent(MainActivity2.this, MainActivity4.class);
                 startActivity(iNext);
             }
         });

         KIDS = findViewById(R.id.textView4);
         KIDS.setOnClickListener(new View.OnClickListener(){
                 @Override
                 public void onClick(View v) {
                     Intent iNext;
                     iNext = (new Intent(MainActivity2.this, MainActivity5.class));
                     startActivity(iNext);
         }
     });
 }
 }














