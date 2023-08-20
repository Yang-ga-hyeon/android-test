package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapp.ui.login.MyLogin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()

    }
    fun settingButton() {
        val buttonLogin = findViewById<Button>(R.id.btngoLogin)
        buttonLogin.setOnClickListener {
            val intentLogin = Intent(this, MyLogin::class.java)
            startActivity(intentLogin)
        }
    }
}