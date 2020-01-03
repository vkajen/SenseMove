package com.zelora.sm.workout;

import androidx.appcompat.app.AppCompatActivity;
import com.zelora.sm.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuideActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStartActivity();
            }
        });
    }
    public void openStartActivity() {
        Intent intent = new Intent(GuideActivity.this, StartActivity.class);
        startActivity(intent);
    }
}
