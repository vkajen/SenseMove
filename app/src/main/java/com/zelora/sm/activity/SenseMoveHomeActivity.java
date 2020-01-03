package com.zelora.sm.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.zelora.sm.R;
import com.zelora.sm.about.AboutActivity;
import com.zelora.sm.bluetooth.BluetoothActivity;

public class SenseMoveHomeActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sense_move_home);
        button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opeUserProfileActivity();
            }
        });
        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });
        button = (Button) findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbluetooth();
            }
        });
    }
    public void opeUserProfileActivity() {
        Intent intent = new Intent(SenseMoveHomeActivity.this, UserProfileActivity.class);
        startActivity(intent);
    }
    public void openAbout() {
        Intent intent = new Intent(SenseMoveHomeActivity.this, AboutActivity.class);
        startActivity(intent);
    }
    public void openbluetooth() {
        Intent intent = new Intent(SenseMoveHomeActivity.this, BluetoothActivity.class);
        startActivity(intent);
    }
}
