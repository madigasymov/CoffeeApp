package com.example.coffeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLgn.setOnClickListener {
            val intent = Intent(this, OrderPage::class.java)
            intent.putExtra("str1", etLgn.text.toString())
            startActivity(intent)
        }
    }
}
