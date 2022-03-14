package com.example.myweek5taskekene.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.myweek5taskekene.R

class ProfilePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        //Assigning full name value to profile text view
        var fullName = intent.getStringExtra("name")
        fullName?.let {
            findViewById<TextView>(R.id.profile_page_name).text = it
        }

        fullName.let {

        }

        //Assigning phone number value to phone number text view
        var fullNumber = intent.getStringExtra("myphone")
        fullNumber?.let {
            findViewById<TextView>(R.id.profile_page_phone_number).text = it
        }

        //Assigning phone number value to phone number text view
        var myEmail = intent.getStringExtra("myemail")
        myEmail?.let {
            findViewById<TextView>(R.id.profile_page_email).text = it
        }

    }


}