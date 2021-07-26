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

public class health extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health);
        ImageButton mg = (ImageButton) findViewById(R.id.mg);
        ImageButton netmeds = (ImageButton) findViewById(R.id.netmeds);
        ImageButton pharmeasy = (ImageButton) findViewById(R.id.pharmeasy);
        ImageButton practo = (ImageButton) findViewById(R.id.practo);
        ImageButton medlife = (ImageButton) findViewById(R.id.medlife);
        ImageButton medplus = (ImageButton) findViewById(R.id.medplus);
        ImageButton hk = (ImageButton) findViewById(R.id.hk);



        mg.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.1mg.com");
            }
        });

        netmeds.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://m.netmeds.com");
            }
        });



        medlife.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.medlife.com");
            }
        });


        medplus.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.medplusindia.com");
            }
        });


        hk.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.hkmedical.com");
            }
        });


        pharmeasy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://pharmeasy.in");
            }
        });


        practo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.practo.com");
            }
        });






//        in.amazon.mShop.android.shopping

// Set a click listener on that View
    }
}
