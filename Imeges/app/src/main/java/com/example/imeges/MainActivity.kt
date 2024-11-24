package com.example.imeges

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var button: Button
    lateinit var editTextEmailAddress: EditText
    lateinit var editTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initViewCompat()
        initView()

        button.setOnClickListener {

            val intent = Intent(this, UsersActivity::class.java)
            startActivity(intent)
//            val email = editTextEmailAddress.text.toString()
//            val password = editTextPassword.text.toString()
//
//            if (email.isNotEmpty() && password.isNotEmpty()) {
//                val intent = Intent(this, UsersActivity::class.java)
////                println("Email: $email")
////                println("Password: $password")
//            }
        }

        button.text = "Увійти"

        Glide.with(this).load("https://definicion.de/wp-content/uploads/2015/10/android.png").into(imageView)

    }

    private fun initView() {
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress)
        editTextPassword = findViewById(R.id.editTextPassword)
    }

    private fun initViewCompat() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}