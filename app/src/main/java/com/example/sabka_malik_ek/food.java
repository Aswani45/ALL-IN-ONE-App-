package com.example.sabka_malik_ek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class food extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        ImageButton big_basket = (ImageButton) findViewById(R.id.big_basket);
        ImageButton zomato = (ImageButton) findViewById(R.id.zomato);
        ImageButton swiggy = (ImageButton) findViewById(R.id.swiggy);
        ImageButton pizza_hut = (ImageButton) findViewById(R.id.pizza_hut);
        ImageButton kfc = (ImageButton) findViewById(R.id.kfc);
        ImageButton groffers = (ImageButton) findViewById(R.id.groffers);
        ImageButton fassos = (ImageButton) findViewById(R.id.fassos);
        ImageButton dunzo = (ImageButton) findViewById(R.id.dunzo);
        ImageButton dominoz = (ImageButton) findViewById(R.id.donioz);
        ImageButton dmart = (ImageButton) findViewById(R.id.dmart);
        ImageButton uber = (ImageButton) findViewById(R.id.uber);
        ImageButton subway = (ImageButton) findViewById(R.id.subway);


        dominoz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.dominos.com");
            }
        });

        pizza_hut.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.pizzahut.com");
            }
        });



        zomato.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.zomato.com");
            }
        });


        swiggy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.swiggy.com");
            }
        });
        uber.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.ubereats.com");
            }
        });
        subway.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.subway.com");
            }
        });


        kfc.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.kfc.com");
            }
        });


        fassos.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.faasos.com");
            }
        });


        dunzo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.dunzo.com");
            }
        });


        groffers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.grofers.com");
            }
        });

        big_basket.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.bigbasket.com");
            }
        });

        dmart.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
//
                WebView browser = (WebView) findViewById(R.id.web);
                browser.loadUrl("http://www.dmart.com");
            }
        });




//        in.amazon.mShop.android.shopping

// Set a click listener on that View
    }
}
