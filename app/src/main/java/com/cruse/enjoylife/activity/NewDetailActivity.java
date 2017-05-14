package com.cruse.enjoylife.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.cruse.enjoylife.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by lulanqin on 2017/5/13.
 */
public class NewDetailActivity extends Activity {

    @InjectView(R.id.wv_news_detail)
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_news_detail);
        ButterKnife.inject(this);

        String url = getIntent().getStringExtra("url");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setBlockNetworkImage(false);
        wv.loadUrl(url);

    }
}
