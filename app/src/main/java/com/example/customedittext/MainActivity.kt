package com.example.customedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<CustomEditText>(R.id.etName)
        val etName2 = findViewById<CustomEditText>(R.id.etName2)
        val etName3 = findViewById<CustomEditText>(R.id.etName3)
        etName.setEditTextBackgroundColor(ContextCompat.getColor(this, R.color.color_one))
        etName.setCornerRadius(20f)
        etName.setHintTextColor(ContextCompat.getColor(this,R.color.black))
        etName.setTextColor(ContextCompat.getColor(this,R.color.white))

        etName2.setEditTextBackgroundColor(ContextCompat.getColor(this, R.color.color_two))
        etName2.setCornerRadius(20f)
        etName2.setHintTextColor(ContextCompat.getColor(this,R.color.black))
        etName2.setTextColor(ContextCompat.getColor(this,R.color.white))

        etName3.setEditTextBackgroundColor(ContextCompat.getColor(this, R.color.color_three))
        etName3.setCornerRadius(20f)
        etName3.setHintTextColor(ContextCompat.getColor(this,R.color.black))
        etName3.setTextColor(ContextCompat.getColor(this,R.color.white))


    }
}