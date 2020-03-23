package com.example.android_prac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_url.setOnClickListener {
            //val urlIntent = Intent(this, Uri.parse("http://m.naver.com")::class.java)
            //startActivity(urlIntent)
            val url = "https://github.com/kim003512"
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(urlIntent)
        }

        btn_main_call.setOnClickListener {
            val call = "tel:010-6489-8832"
            val callIntent = Intent(Intent.ACTION_VIEW, Uri.parse(call))
            startActivity(callIntent)
        }
        

    }
}
