package com.example.joonas.remotebatterymonitor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val label1 = findViewById(R.id.firstLabel) as TextView
        label1.text = "Sup world!"
    }

}
