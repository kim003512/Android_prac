package com.example

import android.annotation.SuppressLint
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.PendingIntent.getActivity
import android.content.Intent
import android.media.RingtoneManager
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import com.example.android_prac.MainActivity
import com.example.android_prac.R
import com.google.firebase.database.core.Context
//import com.google.firebase.messaging.FirebaseMessagingService
//import com.google.firebase.messaging.RemoteMessage

//class MyFirebaseMessagingService : FirebaseMessagingService(){
//    override fun onMessageReceived(remoteMessage: RemoteMessage?){
//        @SuppressLint("LongLogTAG")
//        if(remoteMessage?.notification != null){
//            sendNotification(remoteMessage.notification?.title, remoteMessage.notification!!.body!!)
//        }
//    }
//
//    private fun sendNotification(title: String?, body:String){
//        //어떤 모양으로 알림을 할지 설정한 다음 실제 폰 상단에 표시하도록 한다
//        // pendingIntent를 이용 알림을 클릭하면 열 앱의 액티비티를 설정해 준다
////        val intent = Intent(this, MainActivity::class.java)
////        var main_intent = Intent(this, MainActivity::class.java)
////
////        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
////        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
////        val defaultSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
////        val notificationBuilder = NotificationCompat.Builder(this)
////            .setSmallIcon(R.mipmap.ic_launcher)
////            .setContentTitle(title)
////            .setContentText(body)
////            .setSound(defaultSound)
////            .setContentIntent(pendingIntent)
////
////        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
////        notificationManager.notify(0, notificationBuilder.build())
//    }
//}