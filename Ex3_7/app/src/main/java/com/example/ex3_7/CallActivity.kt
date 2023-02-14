package com.example.ex3_7

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        findViewById<TextView>(R.id.callPagePhoneNumber).text = intent.getStringExtra("telephone")

        val buttonCall = findViewById<Button>(R.id.callPageCallButton)
        buttonCall.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + intent.getStringExtra("telephone"))
            startActivity(dialIntent)
        }
    }
}