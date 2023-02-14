package com.example.ex3_7

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //XML
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.mainPageButtonValidate)
        button.setOnClickListener { mainPagePopUpSubmit() }

        //JAVA Ex3

        /*val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val ll1 = LinearLayout(this)

        val textViewLastName = TextView(this)
        textViewLastName.setText(R.string.main_page_last_name)
        ll1.addView(textViewLastName)

        val editTextLastName = EditText(this)
        editTextLastName.hint = "Simula"
        ll1.addView(editTextLastName)

        layout.addView(ll1)

        val ll2 = LinearLayout(this)

        val textViewFirstName = TextView(this)
        textViewFirstName.setText(R.string.main_page_first_name)
        ll2.addView(textViewFirstName)

        val editTextFirstName = EditText(this)
        editTextFirstName.hint = "Tom"
        ll2.addView(editTextFirstName)

        layout.addView(ll2)

        val ll3 = LinearLayout(this)

        val textViewBirthday = TextView(this)
        textViewBirthday.setText(R.string.main_page_birthday)
        ll3.addView(textViewBirthday)

        val editTextBirthday = EditText(this)
        editTextBirthday.setHint(R.string.main_page_birthday_hint)
        ll3.addView(editTextBirthday)

        layout.addView(ll3)

        val ll4 = LinearLayout(this)

        val textViewJob= TextView(this)
        textViewJob.setText(R.string.main_page_job)
        ll4.addView(textViewJob)

        val editTextJob = EditText(this)
        editTextJob.setHint(R.string.main_page_job_hint)
        ll4.addView(editTextJob)

        layout.addView(ll4)

        val ll5 = LinearLayout(this)

        val textViewPhone = TextView(this)
        textViewPhone.setText(R.string.main_page_phone)
        ll5.addView(textViewPhone)

        val editTextPhone = EditText(this)
        editTextPhone.hint = "XX XX XX XX XX"
        ll5.addView(editTextPhone)

        layout.addView(ll5)

        val ll6 = LinearLayout(this)
        ll6.gravity = Gravity.CENTER

        val buttonValidate = Button(this)
        buttonValidate.setText(R.string.main_page_submit_button)
        ll6.addView(buttonValidate)

        layout.addView(ll6)

        setContentView(layout)*/
    }

    fun mainPagePopUpSubmit() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Confirmation")
        builder.setMessage("Would you like to confirm ?")

        builder.setPositiveButton("Yes") { _, _ ->
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("nom", findViewById<EditText>(R.id.mainPageEditTextLastName).text.toString())
            intent.putExtra("prenom", findViewById<EditText>(R.id.mainPageEditTextFirstName).text.toString())
            intent.putExtra("naissance", findViewById<EditText>(R.id.mainPageEditTextAge).text.toString())
            intent.putExtra("travail", findViewById<EditText>(R.id.mainPageEditTextSkillField).text.toString())
            intent.putExtra("telephone", findViewById<EditText>(R.id.mainPageEditTextPhone).text.toString())
            startActivity(intent)
        }

        builder.setNegativeButton("No") { _, _ ->
            Toast.makeText(applicationContext,
                "No", Toast.LENGTH_SHORT).show()
        }

        /*builder.setNeutralButton("Color") { _, _ ->
            Toast.makeText(applicationContext,
                "Maybe", Toast.LENGTH_SHORT).show()
        }*/
        builder.show()

    }

}