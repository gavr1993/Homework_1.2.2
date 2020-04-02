package com.example.homework_122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button forwardBtn;
    private Button backBtn;
    private TextView linkTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        double random = Math.random()*100;
        int rnd = (int) Math.round(random);
        String page = getString(R.string.link)+String.valueOf(rnd);
        linkTxt.setText(page);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        forwardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void init()  {
        ImageView photoImg = findViewById(R.id.photoImg);
        forwardBtn = findViewById(R. id. forwardBtn);
        backBtn = findViewById(R. id. backBtn);
        linkTxt = findViewById(R. id. linkTxt);
    }
}
