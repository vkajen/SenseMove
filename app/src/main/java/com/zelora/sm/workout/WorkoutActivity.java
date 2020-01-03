package com.zelora.sm.workout;

import androidx.appcompat.app.AppCompatActivity;
import com.zelora.sm.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGuideAcitvity();
            }
        });
    }
    public void openGuideAcitvity() {
        Intent intent = new Intent(WorkoutActivity.this, GuideActivity.class);
        startActivity(intent);
    }
}
