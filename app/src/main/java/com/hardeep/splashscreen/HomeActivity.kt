package com.hardeep.splashscreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    var email: EditText?=null
    var number: EditText ?= null
    var textView: TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        email = findViewById(R.id.email)
        number = findViewById(R.id.number)
        textView = findViewById(R.id.result)

    }

    fun data(v: View)
    {
        Toast.makeText(this,email!!.text.toString(),Toast.LENGTH_LONG).show()
        textView!!.setText(email!!.text.toString())
    }
}
