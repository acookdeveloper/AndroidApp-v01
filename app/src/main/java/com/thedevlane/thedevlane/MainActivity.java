package com.thedevlane.thedevlane;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText uName = findViewById(R.id.username);
        EditText pWord = findViewById(R.id.password);

        if (uName.getText().toString() != "@"){
            uName.setHint("Not a valid Email Address");
        }
        if ((uName.getText().toString() != "") & (pWord.getText().toString() != "")) {
            intent.putExtra(EXTRA_MESSAGE, "hello moto!");
            startActivity(intent);
        }

    }

}
