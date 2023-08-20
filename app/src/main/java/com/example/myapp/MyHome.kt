package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapp.ui.login.MyLogin

class MyHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_home)
        settingBtn1()
        settingBtn2()
    }
    fun settingBtn1() {
        val buttonFindFriends = findViewById<Button>(R.id.btnFindFriends)
        buttonFindFriends.setOnClickListener {
            val intentFindFriends = Intent(this, MyFindFriends::class.java)
            startActivity(intentFindFriends)
        }
    }
    fun settingBtn2() {
        val btnGuide = findViewById<Button>(R.id.btnGuide)
        btnGuide.setOnClickListener {
            val intentinform = Intent(this, MyInformation::class.java)
            startActivity(intentinform)
        }
    }
}