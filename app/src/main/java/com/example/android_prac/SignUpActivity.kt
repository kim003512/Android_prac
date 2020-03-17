package com.example.android_prac

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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

        val intent = Intent(this, SignInActivity::class.java)

        //아이디, 비밀번호, 이름, 번호
        btn_signup_signup.setOnClickListener{
            if(edt_id.isEmpty() || edt_pw.isEmpty() || edt_name.isEmpty() || edt_phone.isEmpty()){
                Toast.makeText(this, "빈칸을 모두 입력해주세요!", Toast.LENGTH_SHORT).show()
            }
            else{
                intent.putExtra("id", edt_id)
                intent.putExtra("pw", edt_pw)
                startActivity(intent)
            }
        }
    }

}