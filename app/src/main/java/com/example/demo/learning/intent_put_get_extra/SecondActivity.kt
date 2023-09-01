package com.example.demo.learning.intent_put_get_extra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var tvReceivedMessage: TextView
    private lateinit var tvReceivedpass : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvReceivedMessage = findViewById(R.id.tvReceiveMessage)
        tvReceivedpass = findViewById(R.id.tvReceivepass)
        val intent = intent
        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val mesage = intent.getStringExtra("EXTRA_PASSWORD")
        tvReceivedMessage.text = message
        tvReceivedpass.text = mesage
    }
}