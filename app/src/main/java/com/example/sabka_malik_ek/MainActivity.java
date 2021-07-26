package com.example.sabka_malik_ek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the numbers category
        ImageButton shop = (ImageButton) findViewById(R.id.shop);

// Set a click listener on that View
        shop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, shop.class);
                startActivity(numbersIntent);
            }
        });
        ImageButton food = (ImageButton) findViewById(R.id.food);

// Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent foodintent = new Intent(MainActivity.this, food.class);
                startActivity(foodintent);
            }
        });
        ImageButton buy = (ImageButton) findViewById(R.id.buy);

// Set a click listener on that View
        buy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(MainActivity.this, buy.class);
                startActivity(buyIntent);
            }
        });
        ImageButton info = (ImageButton) findViewById(R.id.info);

// Set a click listener on that View
        info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent infoIntent = new Intent(MainActivity.this, info.class);
                startActivity(infoIntent);
            }
        });
        ImageButton health = (ImageButton) findViewById(R.id.health);

// Set a click listener on that View
        health.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent healthIntent = new Intent(MainActivity.this, health.class);
                startActivity(healthIntent);
            }
        });
        ImageButton booking = (ImageButton) findViewById(R.id.booking);

// Set a click listener on that View
        booking.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent bookingIntent = new Intent(MainActivity.this, booking.class);
                startActivity(bookingIntent);
            }
        });
    }

//    public void number(View view)
//    {
//        Intent i = new Intent(this,shop.class);
//        startActivity(i);
//
//    }
//    public void family(View view)
//    {
//        Intent i = new Intent(this,food.class);
//        startActivity(i);
//
//    }
//    public void phrases(View view)
//    {
//        Intent i = new Intent(this,buy.class);
//        startActivity(i);
//
//    }
//    public void color(View view)
//    {
//        Intent i = new Intent(this,info.class);
//        startActivity(i);
//
//    }
//    public void health(View view)
//    {
//        Intent i = new Intent(this,health.class);
//        startActivity(i);
//
//    }
//    public void booking(View view)
//    {
//        Intent i = new Intent(this,booking.class);
//        startActivity(i);

//    }
}

