package com.hly.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * ~~~~~~文件描述:静态注册~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/27~~~~~~
 * ~~~~~~更改时间:2018/8/27~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class BootCompleteReceiver extends BroadcastReceiver {
    public BootCompleteReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, intent.getStringExtra("info"), Toast.LENGTH_SHORT).show();
//        ConnectivityManager connectionManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo = connectionManager.getActiveNetworkInfo();
//        if (networkInfo != null && networkInfo.isAvailable()) {
//            Toast.makeText(context, "网络正常使用", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(context, "网络不可用", Toast.LENGTH_SHORT).show();
//                    }
//
    }
}
