package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapp.ui.login.MyLogin

class MyLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        settingButton()
    }

    fun settingButton() {
        val buttonGoTrip = findViewById<Button>(R.id.btnGoTrip)
        buttonGoTrip.setOnClickListener {
            val intentGoTrip = Intent(this, MyHome::class.java)
            startActivity(intentGoTrip)
        }
    }
}