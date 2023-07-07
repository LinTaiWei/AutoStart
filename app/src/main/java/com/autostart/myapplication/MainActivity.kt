package com.autostart.myapplication

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "MainActivity已啟動", Toast.LENGTH_SHORT).show()
        val brodacastreceiver = BroadcastBootCompleted()
        val intentfilter = IntentFilter(Intent.ACTION_BOOT_COMPLETED)
        registerReceiver(brodacastreceiver ,intentfilter)
    }

}