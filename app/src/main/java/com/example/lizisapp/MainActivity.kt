package com.example.lizisapp

import com.example.lizisapp.R


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val okButton = findViewById<Button>(R.id.okButton)
        val nextButton = findViewById<Button>(R.id.nextButton)


        okButton.setOnClickListener {
            val email = emailEditText.text.toString()
            if (email.isNotEmpty()) {
                Toast.makeText(this, "Email saved: $email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter an email", Toast.LENGTH_SHORT).show()
            }
        }


        nextButton.setOnClickListener {
            val email = emailEditText.text.toString()
            if (email.isNotEmpty()) {

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("EMAIL", email)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter an email", Toast.LENGTH_SHORT).show()
            }
        }
    }
}




