package com.example.da3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editEmail: EditText
    lateinit var editName: EditText
    lateinit var editLastName: EditText
    lateinit var editAge: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button = findViewById(R.id.button)
        editEmail = findViewById(R.id.editEmail)
        editName = findViewById(R.id.editName)
        editLastName = findViewById(R.id.editLastName)
        editAge = findViewById(R.id.editAge)

        editAge.filters = arrayOf(DigitsInputFilter())

        button.setOnClickListener {
            if (editEmail.text.toString().isNotEmpty() && editName.text.toString().isNotEmpty() && editLastName.text.toString().isNotEmpty() && editAge.text.toString().isNotEmpty()) {
                val intent = Intent(this, DetailedActivity::class.java)
                intent.putExtra("email", editEmail.text.toString())
                intent.putExtra("name", editName.text.toString())
                intent.putExtra("lastName", editLastName.text.toString())
                intent.putExtra("age", editAge.text.toString())
                startActivity(intent)
            }

        }
    }
}