package com.example.a10120222latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class verify : AppCompatActivity() {

    private lateinit var txtverify: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        txtverify = findViewById(R.id.txt_verify)
        txtverify.setOnClickListener {
            val intent = Intent(this, send::class.java)
            startActivity(intent)
        }
    }
}