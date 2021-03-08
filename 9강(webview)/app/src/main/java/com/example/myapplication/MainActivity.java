package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private String url = "https://github.com/22sonamu/startjava";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.WebView);
        webView.getSettings().setJavaScriptEnabled(true); //자바스크립트를 허용
        webView.loadUrl(url); //특정 주소를 틀어라
        webView.setWebChromeClient(new WebChromeClient()); //크롬으로
        webView.setWebViewClient(new WebViewClientClass());

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) { //안드로이드의 키를 눌렀을때 동작
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){ //뒤로가기 누르고, 뒤로 갈 수 있을 때
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url); //현재 페이지의 url을 읽어오는 메서드
            return true;
        }
    }
}