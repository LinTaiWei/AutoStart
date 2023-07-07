package com.autostart.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent


class BroadcastBootCompleted : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val targetIntent = Intent(context, MainActivity::class.java)
        targetIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context?.startActivity(targetIntent)
    }
}