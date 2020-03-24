package com.example.android_prac

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_framelayout.*

class FrameActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_framelayout)

        var imageIndex = 0

        btn_frame_chage.setOnClickListener {
            if(imageIndex == 0){
                img_frame_first.visibility = View.VISIBLE
                img_frame_second.visibility = View.INVISIBLE

                imageIndex = 1
            }
            else if(imageIndex == 1){
                img_frame_first.visibility = View.INVISIBLE
                img_frame_second.visibility = View.VISIBLE

                imageIndex = 0
            }
        }
    }
}