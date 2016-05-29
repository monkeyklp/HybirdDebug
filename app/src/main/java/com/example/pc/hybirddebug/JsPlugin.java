package com.example.pc.hybirddebug;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.webkit.JavascriptInterface;

/**
 * Created by 柚柚的PC on 2016/5/29.
 */
public class JsPlugin {
    private Context mContext;

    public JsPlugin(Context mContext) {
        this.mContext = mContext;
    }

    @JavascriptInterface
    public void test(String message){
        new AlertDialog.Builder(mContext)
                .setTitle("捕获JS调用java的函数")
                .setMessage(message)
                .setPositiveButton(R.string.ok, null)
                .create()
                .show();
    }
}
