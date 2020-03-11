package com.example.android_prac

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signin.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        initialUI()
    }

    private fun initialUI(){
        var edt_id = et_id.text
        var edt_pw = et_pw.text

        var main_intent = Intent(this, MainActivity::class.java)
        //https://reqres.in/ 서버 연결
        btn_signup.setOnClickListener {
            var signup_intent = Intent(this, SignUpActivity::class.java)
            startActivity(signup_intent)

        }

        btn_signin.setOnClickListener {
            if(edt_id.isEmpty() && edt_pw.isEmpty())
                Toast.makeText(this, "빈칸을 모두 입력해주세요!", Toast.LENGTH_SHORT).show()
            else
                startActivity(main_intent)
        }
    }
}