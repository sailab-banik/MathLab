package com.sailab.mathlab.core.service

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.sailab.mathlab.R

class NotificationService(
    private val context: Context
) {

    private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    fun showNotification() {
        val notification = NotificationCompat.Builder(context, ALERT_CHANNEL_ID)
            .setSmallIcon(R.drawable.mathlab_logo)
            .setContentTitle("Welcome")
            .setContentText("Solve math problems faster with our tools.")
            .build()

        notificationManager.notify(1, notification)
    }

    companion object {
        const val ALERT_CHANNEL_ID = "alert_channel"
    }
}