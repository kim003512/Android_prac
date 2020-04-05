package com.example.android_prac

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signin_ggumul.*

class SignInActivity_ggumul : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_ggumul)

        var name = edt_signin_name.text.toString()
        var id = edt_signin_id.text.toString()
        var pw = edt_signin_pw.text.toString()
        var birth = edt_signin_birth.text.toString()

        btn_signin_finish.setOnClickListener {
            if(name.isEmpty() || id.isEmpty() || pw.isEmpty() || birth.isEmpty()){
                Toast.makeText(this, "빈칸을 입력하세요!", Toast.LENGTH_SHORT).show()
            }
            val intent_recommand = Intent(this, RecommandActivity::class.java)
            startActivity(intent_recommand)
        }
    }
}