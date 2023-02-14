package com.example.ex3_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        findViewById<TextView>(R.id.confirmationPageTextVerif).text =
            intent.getStringExtra("nom") + "\n" +
                    intent.getStringExtra("prenom") + "\n" +
                    intent.getStringExtra("naissance") + "\n" +
                    intent.getStringExtra("travail") + "\n" +
                    intent.getStringExtra("telephone")

        val buttonOk = findViewById<Button>(R.id.confirmationPagebuttonOk)
        val buttonRetour = findViewById<Button>(R.id.confirmationPagebuttonRetour)

        buttonOk.setOnClickListener {
            val newIntent = Intent(this, CallActivity::class.java)
            newIntent.putExtra("telephone", intent.getStringExtra("telephone"))
            startActivity(newIntent)
        }
        buttonRetour.setOnClickListener {
            val newIntent = Intent(this, MainActivity::class.java)
            startActivity(newIntent)
        }
    }
}