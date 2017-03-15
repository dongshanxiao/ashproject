package com.ash.ashfirst;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by liuwei on 17-3-14.
 */
public class Analysis extends Fragment {

    private WebView mWebView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.analysis_fragment, container, false);
        return view;
    }

    @Override
    public void onResume() {
        /*mWebView = (WebView)getView().findViewById(R.id.webs);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://sina.cn/?wm=4007");
        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });*/
        super.onResume();
    }

}
