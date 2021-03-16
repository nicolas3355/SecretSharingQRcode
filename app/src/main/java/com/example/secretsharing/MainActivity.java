package com.example.secretsharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClickListeners();
    }

    private void setClickListeners(){
        Button split_button = this.findViewById(R.id.split);
        Button combine_button = this.findViewById(R.id.combine);

        split_button.setOnClickListener(v -> {
            Log.i(TAG, "clicked split");
            Intent intent = new Intent(MainActivity.this, ScanQrCode.class);
            startActivity(intent);
        });

        combine_button.setOnClickListener(v -> Log.i(TAG, "combine clicked"));
    }

}