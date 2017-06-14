package com.example.joonas.remotebatterymonitor

import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    val ifilter: IntentFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
    //val batteryStatus = registerReceiver(null, ifilter)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val label1 = findViewById(R.id.firstLabel) as TextView
        label1.text = getBatteryData()
    }

    fun getBatteryData() : String{
        val stringForLabel: String = "Sup world again!"
        return stringForLabel
    }

    /*fun determineChargingType () {
        //Check if charged or not
        val status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
        val isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                         status == BatteryManager.BATTERY_STATUS_FULL


        //Check in what way phone is being charged
        val chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1)
        val usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB
        val acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC
    }*/
}
