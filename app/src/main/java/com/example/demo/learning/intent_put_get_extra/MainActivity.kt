package com.example.demo.learning.intent_put_get_extra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnNavigate: Button
    private lateinit var etMessage: EditText
    private lateinit var etpassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNavigate = findViewById(R.id.btnNavigate)
        etMessage = findViewById(R.id.etMessage)
        etpassword = findViewById(R.id.etpassword)

        btnNavigate.setOnClickListener{
            val message = etMessage.text.toString()
            val mesage = etpassword.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", message)
            intent.putExtra("EXTRA_PASSWORD", mesage)
            startActivity(intent)
        }
    }
}