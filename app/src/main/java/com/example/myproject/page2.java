package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void button2Area_of_Circle(View view) {
        Intent intent = new Intent(this, Areaofcricle.class);
        startActivity(intent);
    }

    public void button3Area_of_Sqaure(View view) {
        Intent intent = new Intent(this,Areaofsquare.class);
        startActivity(intent);
    }
    public void button4Area_of_Triangle(View view) {
        Intent intent = new Intent(this, Areaoftriangle.class);
        startActivity(intent);
    }

    public void button5Area_of_Rectangle(View view) {
        Intent intent = new Intent(this, Areaofrectangle.class);
        startActivity(intent);
    }

}