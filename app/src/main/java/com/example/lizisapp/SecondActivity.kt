package com.example.lizisapp
import com.example.lizisapp.R



import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val clickButton = findViewById<Button>(R.id.clickButton)


        val email = intent.getStringExtra("EMAIL")
        welcomeTextView.text = "Welcome back\n$email"


        numberTextView.text = counter.toString()


        clickButton.setOnClickListener {
            counter--
            numberTextView.text = counter.toString()
        }
    }
}
