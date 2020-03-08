package com.example.android_prac

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signin.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        initialUI()
    }

    private fun initialUI(){
        //https://reqres.in/ 서버 연결
        btn_signup.setOnClickListener {
            var signup_intent = Intent(this, SignUpActivity::class.java)
            startActivity(signup_intent)

        }
    }
}