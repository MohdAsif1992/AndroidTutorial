package com.educavillage.androidtutorial.activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.educavillage.androidtutorial.R;
import com.educavillage.androidtutorial.fragment.JavaTabFragment;

/**
 * Created by faiz on 20-Feb-18.
 */
public class JavaAllTopicsActivity extends AppCompatActivity {
   private WebView mWebView;
   private String url;
   private Toolbar mToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_all_topics);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mToolbar.setTitle(getString(R.string.app_name));
        mToolbar.setNavigationIcon(R.mipmap.back_btn);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Intent intent = this.getIntent();

        if (intent != null) {
            Bundle data = getIntent().getExtras();

            if(data.containsKey("url1")) {
                url = data.getString("url1");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.clearCache(true);
            }
            if(data.containsKey("url2")) {
                url = data.getString("url2");
                mWebView= (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.clearCache(true);
            }
            if(data.containsKey("url3")) {
                url = data.getString("url3");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.clearCache(true);
            }
            if (data.containsKey("url4")){
                url=data.getString("url4");
                mWebView=(WebView)findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url5")){
                url=data.getString("url5");
                mWebView=(WebView)findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url6")) {
                url = data.getString("url6");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url7")) {
                url = data.getString("url7");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url8")) {
                url = data.getString("url8");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url9")) {
                url = data.getString("url9");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url10")) {
                url = data.getString("url10");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url11")) {
                url = data.getString("url11");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url12")) {
                url = data.getString("url12");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url13")) {
                url = data.getString("url13");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url14")) {
                url = data.getString("url14");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url15")) {
                url = data.getString("url15");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url16")) {
                url = data.getString("url16");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url17")) {
                url = data.getString("url17");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url18")) {
                url = data.getString("url18");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url19")) {
                url = data.getString("url19");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url20")) {
                url = data.getString("url20");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url21")) {
                url = data.getString("url21");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            } if (data.containsKey("url22")) {
                url = data.getString("url22");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url23")) {
                url = data.getString("url23");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url24")) {
                url = data.getString("url24");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url25")) {
                url = data.getString("url25");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url26")) {
                url = data.getString("url26");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url27")) {
                url = data.getString("url27");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            if (data.containsKey("url28")) {
                url = data.getString("url28");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url29")) {
                url = data.getString("url29");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url30")) {
                url = data.getString("url30");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url31")) {
                url = data.getString("url31");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url32")) {
                url = data.getString("url32");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url33")) {
                url = data.getString("url33");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url34")) {
                url = data.getString("url34");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url35")) {
                url = data.getString("url35");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url36")) {
                url = data.getString("url36");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url37")) {
                url = data.getString("url37");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url38")) {
                url = data.getString("url38");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url39")) {
                url = data.getString("url39");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }if (data.containsKey("url40")) {
                url = data.getString("url40");
                mWebView = (WebView) findViewById(R.id.webView_java);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.clearHistory();
                mWebView.setWebViewClient(new WebViewClient());
                mWebView.clearCache(true);
            }
            mWebView.loadUrl(url);
        }

    }
}
