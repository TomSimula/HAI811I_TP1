package com.example.ex9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DateCal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_cal)
        findViewById<TextView>(R.id.dateTextView).text =
            intent.getStringExtra("dayOfMonth") + "/" +
                    intent.getStringExtra("month") + "/" +
                    intent.getStringExtra("year")
    }
}