package com.example.android_prac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        initialUI()
    }

    private fun initialUI(){
        //https://reqres.in/ 서버 연결
    }
}