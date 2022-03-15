package com.example.myweek5taskekene

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.example.myweek5taskekene.profile.ProfilePageActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnToProfilePage = findViewById<Button>(R.id.reg_button_to_profile_page)//attaching variable to button id
//        var nameInput = findViewById<EditText>(R.id.reg_form_user_name)//attaching variable to input name id


        var genderInput = findViewById<Spinner>(R.id.spinner_reg_form)//attaching variable to input gender id

        btnToProfilePage.setOnClickListener {

            nameValidation()
            phoneNumbervalidation()
            emailValidation()
//            intentFunction()

        }

    }

    //function for name validation
    private fun nameValidation(){
        var nameInput = findViewById<EditText>(R.id.reg_form_user_name)//attaching variable to input name id
        var userName = nameInput.text.toString()
        var intent = Intent(this, ProfilePageActivity::class.java)

        if(userName.length > 2){
            intent.apply {
                putExtra("name", userName)
            }
            startActivity(intent)//starts intent
            Toast.makeText(applicationContext, "Username is Correct", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(applicationContext, "Username is Incorrect", Toast.LENGTH_SHORT).show()
        }
    }

    //function for phone number validation
    private fun phoneNumbervalidation(){
        var phoneNumberInput = findViewById<EditText>(R.id.reg_form_user_phone_number)//attaching variable to input phone number id
        var phonNum = phoneNumberInput.text.toString()
        var intent = Intent(this, ProfilePageActivity::class.java)

        if (phonNum.contains("0") || phonNum.contains("234")){
            intent.apply {
                putExtra("myphone", phonNum)
            }
            startActivity(intent)//starts intent
            Toast.makeText(applicationContext, "Phone Number is Correct", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(applicationContext, "Phone Number is Incorrect", Toast.LENGTH_SHORT).show()
        }
    }

    //function for email validation
    private fun emailValidation(){
        var emailInput = findViewById<EditText>(R.id.reg_form_user_email)//attaching variable to input email id
        var email = emailInput.text.toString()
        var intent = Intent(this, ProfilePageActivity::class.java)

        if(email.contains("@") && email.contains(".com")){
            intent.apply {
                putExtra("myemail", email)
            }
            startActivity(intent)//starts intent
            Toast.makeText(applicationContext, "Email is Correct", Toast.LENGTH_SHORT).show()
        }

    }

    // Intent function call
    private fun intentFunction(){
        var intent = Intent(this, ProfilePageActivity::class.java)

        startActivity(intent)//starts intent
    }
}