package com.example.projectaksub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btn_next);
        EditText etName = findViewById(R.id.et_name);

        btnNext.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", etName.getText().toString());
            startActivity(intent);
        });



    }
}