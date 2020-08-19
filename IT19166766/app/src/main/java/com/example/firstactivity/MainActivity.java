package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView text;
    String myExtra = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        text = findViewById(R.id.button);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context  = getApplicationContext();
                CharSequence message = "Sending message";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("MAIN EXTRA",myExtra);
                startActivity(intent);
            }
        });


    }
}