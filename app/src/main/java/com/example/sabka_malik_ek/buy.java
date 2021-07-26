package com.example.sabka_malik_ek;

import android.app.ActionBar;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.Toast;

public class buy extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy);

        ImageButton olx = (ImageButton) findViewById(R.id.olx);
        ImageButton quikr = (ImageButton) findViewById(R.id.quikr);
        ImageButton droom = (ImageButton) findViewById(R.id.droom);
        ImageButton cardekho = (ImageButton) findViewById(R.id.cardekho);
        ImageButton carwale = (ImageButton) findViewById(R.id.carwale);
        ImageButton bikedekho = (ImageButton) findViewById(R.id.bikedekho);
        ImageButton bikewale = (ImageButton) findViewById(R.id.bikewale);



        olx.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.olx.com");
            }
        });

        quikr.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.quikr.com");
            }
        });



        droom.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.droom.com");
            }
        });


        cardekho.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.cardekho.com");
            }
        });


        carwale.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.carwale.com");
            }
        });


        bikedekho.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.bikedekho.com");
            }
        });


        bikewale.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.bikewale.com");
            }
        });






//        in.amazon.mShop.android.shopping

// Set a click listener on that View
    }
}
