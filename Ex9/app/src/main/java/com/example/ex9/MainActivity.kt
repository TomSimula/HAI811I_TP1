package com.example.ex9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val date = findViewById<CalendarView>(R.id.calendarView)
        date.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val newIntent = Intent(this, DateCal::class.java)
            newIntent.putExtra("year", year.toString())
            newIntent.putExtra("month", month.toString())
            newIntent.putExtra("dayOfMonth", (dayOfMonth+1).toString())
            startActivity(newIntent)
        }
    }
}