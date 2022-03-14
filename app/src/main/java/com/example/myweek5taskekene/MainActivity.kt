package com.example.myweek5taskekene

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.example.myweek5taskekene.profile.ProfilePageActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnToProfilePage = findViewById<Button>(R.id.reg_button_to_profile_page)//attaching variable to button id
        var nameInput = findViewById<EditText>(R.id.reg_form_user_name)//attaching variable to input name id
        var phoneNumberInput = findViewById<EditText>(R.id.reg_form_user_phone_number)//attaching variable to input phone number id
        var emailInput = findViewById<EditText>(R.id.reg_form_user_email)//attaching variable to input email id
        var genderInput = findViewById<Spinner>(R.id.spinner_reg_form)//attaching variable to input gender id

        btnToProfilePage.setOnClickListener {

            //attaching the variables outside to the variables inside the button onclick listener
            var userName = nameInput.text.toString()
            var phonNum = phoneNumberInput.text.toString()
            var email = emailInput.text.toString()

            //---------------------------


            var intent = Intent(this, ProfilePageActivity::class.java)//Initializing intent action to the profile page

            //applying Intent
            intent.apply {
                putExtra("name", userName)
                putExtra("myphone", phonNum)
                putExtra("myemail", email)
            }

            startActivity(intent)//starts intent
        }
    }
}