package com.zelora.sm.workout;

import androidx.appcompat.app.AppCompatActivity;
import com.zelora.sm.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class SummaryActivity extends AppCompatActivity {
    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        button = (ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityReset();
            }
        });
    }
    public void activityReset() {
        Intent intent = new Intent(SummaryActivity.this, SelectActivity.class);
        startActivity(intent);
    }
}
