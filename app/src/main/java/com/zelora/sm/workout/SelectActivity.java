package com.zelora.sm.workout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.zelora.sm.R;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectActivity extends AppCompatActivity {
private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        button = (Button) findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
         public void onClick(View v) {
             openWorkout();
           }
       });
    }
   public void openWorkout() {
       Intent intent = new Intent(SelectActivity.this, WorkoutActivity.class);
        startActivity(intent);
    }
}
