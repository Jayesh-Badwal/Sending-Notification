package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;

public class NotificationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
    }
}