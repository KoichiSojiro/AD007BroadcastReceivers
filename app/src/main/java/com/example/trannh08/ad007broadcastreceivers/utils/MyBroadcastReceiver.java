package com.example.trannh08.ad007broadcastreceivers.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by trannh08 on 8/26/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent detected", Toast.LENGTH_LONG).show();
    }
}
