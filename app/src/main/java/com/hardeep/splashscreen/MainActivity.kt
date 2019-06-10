package com.hardeep.splashscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    var handler: Handler ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = Handler()
        handler!!.postDelayed(Runnable {
            val intent = Intent(this,NavigationActivity::class.java)
            startActivity(intent)
        },3000)
    }
}
