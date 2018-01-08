package com.example.hp.website;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView= (WebView)findViewById(R.id.myWebView);
        WebSettings Set = myWebView.getSettings();
        Set.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.javatpoint.com");//Add Your Website URL here.....
        myWebView.setWebViewClient(new WebViewClient());
        Set.setBuiltInZoomControls(true);



    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack())
        {
            myWebView.goBack();
        }
        else

        super.onBackPressed();
    }

}
