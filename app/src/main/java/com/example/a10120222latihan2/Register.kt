package com.example.a10120222latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Register : AppCompatActivity() {

    private lateinit var txtsend: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        txtsend = findViewById(R.id.txt_send)
        txtsend.setOnClickListener{
            val intent = Intent(this, verify::class.java)
            startActivity(intent)
    }
}

}
