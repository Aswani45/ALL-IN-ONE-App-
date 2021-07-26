package com.example.sabka_malik_ek;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.Toast;

public class shop extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        ImageButton amazon = (ImageButton) findViewById(R.id.aamazon);
        ImageButton flipcart = (ImageButton) findViewById(R.id.flipcart);
        ImageButton bewakoof = (ImageButton) findViewById(R.id.bewakoof);
        ImageButton myntra = (ImageButton) findViewById(R.id.myntra);
        ImageButton coolwinks = (ImageButton) findViewById(R.id.coolwinks);
        ImageButton lenskart = (ImageButton) findViewById(R.id.lenskart);
        ImageButton snapdeal = (ImageButton) findViewById(R.id.snapdeal);
        ImageButton ajio = (ImageButton) findViewById(R.id.ajio);


        amazon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.amazon.com");
            }
        });

        flipcart.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.flipcart.com");
            }
        });



        bewakoof.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.bewakoof.com");
            }
        });


        myntra.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.myntra.com");
            }
        });


        coolwinks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.coolwinks.com");
            }
        });

//        494237a2c760ecd814537c28ca139b52


        lenskart.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.lenskart.com");
            }
        });


        snapdeal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.snapdeal.com");
            }
        });


        ajio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.ajio.com");
            }
        });




//        in.amazon.mShop.android.shopping

// Set a click listener on that View
    }
}
