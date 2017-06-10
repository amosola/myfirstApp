package com.example.amos.cookbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class details extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        web = (WebView)findViewById(R.id.details);

        int pos = getIntent().getIntExtra("pos",1);
        web.loadUrl("file:///android_asset/item_"+pos+".html");
    }
}
