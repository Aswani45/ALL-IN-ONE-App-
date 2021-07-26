package com.example.sabka_malik_ek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class booking extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);
        ImageButton yatra = (ImageButton) findViewById(R.id.yatra);
        ImageButton ixigo = (ImageButton) findViewById(R.id.ixigo);
        ImageButton ola = (ImageButton) findViewById(R.id.ola);
        ImageButton uber2 = (ImageButton) findViewById(R.id.uber2);
        ImageButton oyo = (ImageButton) findViewById(R.id.oyo);
        ImageButton make_my_trip = (ImageButton) findViewById(R.id.make_my_trip);
        ImageButton airbnb = (ImageButton) findViewById(R.id.airbnb);
        ImageButton ease_my_trip = (ImageButton) findViewById(R.id.ease_my_trip);
        ImageButton goibibo = (ImageButton) findViewById(R.id.goibibo);
        ImageButton book_my_show = (ImageButton) findViewById(R.id.book_my_show);
        ImageButton redbus = (ImageButton) findViewById(R.id.red_bus);
        ImageButton trivago = (ImageButton) findViewById(R.id.trivago);


        yatra.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.yatra.com");
            }
        });

        ixigo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.ixigo.com");
            }
        });



        ola.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.olacabs.com");
            }
        });


        uber2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.uber.com");
            }
        });
        oyo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.oyorooms.com");
            }
        });
        make_my_trip.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.makemytrip.com");
            }
        });


        book_my_show.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://in.bookmyshow.com");
            }
        });


        airbnb.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.airbnb.co.in");
            }
        });


        ease_my_trip.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.easemytrip.com");
            }
        });


        goibibo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.goibibo.com");
            }
        });

        redbus.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.redbus.com");
            }
        });

        trivago.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.trivago.com");
            }
        });




//        in.amazon.mShop.android.shopping

// Set a click listener on that View
    }
}
