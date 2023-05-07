package com.sailab.mathlab

import android.annotation.SuppressLint
import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import com.sailab.mathlab.core.service.NotificationService

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
    }

    @SuppressLint("ObsoleteSdkInt")
    private fun createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                NotificationService.ALERT_CHANNEL_ID,
                "Welcome",
                NotificationManager.IMPORTANCE_HIGH
            )

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}