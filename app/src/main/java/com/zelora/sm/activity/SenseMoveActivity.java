package com.zelora.sm.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import com.zelora.sm.R;
public class SenseMoveActivity extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sense_move);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SenseMoveActivity.this, SenseMoveFitActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
