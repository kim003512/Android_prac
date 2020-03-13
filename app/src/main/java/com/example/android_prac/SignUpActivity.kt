package com.example.android_prac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.activity_signin.et_id
import kotlinx.android.synthetic.main.activity_signin.et_pw
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //유효성 검사
        //val edit_email =
        var edt_id = et_id.text
        var edt_pw = et_pw.text
        var edt_name = et_name.text
        var edt_phone = et_phone.text

        //아이디, 비밀번호, 이름, 번호

        //비밀번호

        //이름

        //ㅂ먼호
    }

}