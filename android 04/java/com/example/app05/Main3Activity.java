package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText edtURL;
    Button btnGO, btnBack;
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edtURL = findViewById(R.id.edtUrl);
        btnGO = findViewById(R.id.btnGo);
        btnBack = findViewById(R.id.btnBack);
        webView1 = findViewById(R.id.webView1);

        webView1.setWebViewClient(new MyWebViewClient());
        WebSettings webSettings = webView1.getSettings();
        webSettings.setBuiltInZoomControls(true);

        btnGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"이동 버튼을 눌렀음" + edtURL.getText().toString(), Toast.LENGTH_SHORT).show();
                webView1.loadUrl(edtURL.getText().toString());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"이전 버튼을 눌렀음", + Toast.LENGTH_SHORT).show();
                webView1.goBack();
            }
        });
    }

    public class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
}


}