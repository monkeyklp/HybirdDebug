package com.example.pc.hybirddebug;

import android.support.v7.app.AlertDialog;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by 柚柚的PC on 2016/5/29.
 */
public class CustomWebClient extends WebChromeClient {

    @Override
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        new AlertDialog.Builder(view.getContext())
                .setTitle("捕获JS的Alert函数")
                .setMessage(message)
                .setPositiveButton(R.string.ok, null)
                .create()
                .show();
        return true;
    }
}
