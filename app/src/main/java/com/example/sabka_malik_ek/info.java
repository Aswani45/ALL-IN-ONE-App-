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

public class info extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        ImageButton toi = (ImageButton) findViewById(R.id.toi);
        ImageButton indiatoday = (ImageButton) findViewById(R.id.indiatoday);
        ImageButton gadgets360 = (ImageButton) findViewById(R.id.gadgets360);
        ImageButton cricbuzz = (ImageButton) findViewById(R.id.cricbuzz);
        ImageButton espn = (ImageButton) findViewById(R.id.espn);
        ImageButton goodreads = (ImageButton) findViewById(R.id.goodreads);
        ImageButton quara = (ImageButton) findViewById(R.id.quara);
        ImageButton imdb = (ImageButton) findViewById(R.id.imdb);
        ImageButton justdial = (ImageButton) findViewById(R.id.justdial);


        toi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.timesofindia.com");
            }
        });

        indiatoday.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.indiatoday.com");
            }
        });



        gadgets360.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://.gadgets.ndtv.com");
            }
        });


        cricbuzz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://m.cricbuzz.com");
            }
        });


        espn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.espncricinfo.com");
            }
        });


        goodreads.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.goodreads.com");
            }
        });


        quara.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.quara.com");
            }
        });


        imdb.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://m.imdb.com");
            }
        });


        justdial.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.justdial.com");
            }
        });





//        in.amazon.mShop.android.shopping

// Set a click listener on that View
    }
}
