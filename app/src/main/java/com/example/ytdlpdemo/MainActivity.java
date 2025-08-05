package com.example.ytdlpdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }

        Python py = Python.getInstance();
        String ytdlpVersion = py.getModule("main").callAttr("get_ytdlp_version").toString();

        TextView tvVersion = findViewById(R.id.tvVersion);
        tvVersion.setText("yt-dlp version: " + ytdlpVersion);
    }
}