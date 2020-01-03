package com.zelora.sm.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zelora.sm.R;

public class SenseMoveFitContinueActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sense_move_fit_continue);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSenseMovehomeActivity();
            }
        });


    }
    public void openSenseMovehomeActivity() {
        Intent intent = new Intent(SenseMoveFitContinueActivity.this, SenseMoveHomeActivity.class);
        startActivity(intent);
    }
}
