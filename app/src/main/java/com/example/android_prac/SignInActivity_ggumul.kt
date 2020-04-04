package com.example.android_prac

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signin_ggumul.*

class SignInActivity_ggumul : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_ggumul)

        btn_signin_finish.setOnClickListener {
            val intent_recommand = Intent(this, RecommandActivity::class.java)
            startActivity(intent_recommand)
        }
    }
}