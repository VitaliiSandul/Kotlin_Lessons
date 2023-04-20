package com.sandul.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {

    companion object {
        const val NOTIFICATION_ID = 101
        const val CHANNEL_ID = "ChannelId"
        private var counter = 101
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createNotificationChannel()

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {

            val textView = findViewById<TextView>(R.id.textView)
            textView.text = "Nitification"

            val link = "http://developer.alexanderklimov.ru/android/"
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))

            val intent = Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)

            var builder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.cat_notif)
                .setContentTitle("Напоминание")
                .setContentText("Пора покормить кота")
//                .setContentText(link)
                .setColor(Color.GREEN)
                .setStyle(NotificationCompat.BigTextStyle()
                    .bigText("Much longer text that cannot fit one line..."))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setLargeIcon(
                    BitmapFactory.decodeResource(getResources(),
                    R.drawable.cat_notif))
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_SOUND)

            with(NotificationManagerCompat.from(this)) {
                // notificationId is a unique int for each notification that you must define
                notify(NOTIFICATION_ID, builder.build())
//                notify(counter++, builder.build())
            }


        }
    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}