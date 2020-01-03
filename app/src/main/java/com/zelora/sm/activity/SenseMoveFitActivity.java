package com.zelora.sm.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import com.zelora.sm.R;
import java.util.Timer;
import java.util.TimerTask;

public class SenseMoveFitActivity extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sense_move_fit);
        VideoView videoView =(VideoView) findViewById(R.id.video_view);
        String videoPath ="android.resource://" + getPackageName() + "/" + R.raw.demo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SenseMoveFitActivity.this,SenseMoveFitContinueActivity.class);

                startActivity(intent);
                finish();
            }
        },10000);
    }
}
