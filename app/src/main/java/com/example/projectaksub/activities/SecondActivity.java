package com.example.projectaksub.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectaksub.R;
import com.example.projectaksub.adapters.FoodAdapter;
import com.example.projectaksub.models.Food;

import java.util.ArrayList;
import java.util.Vector;

public class SecondActivity extends AppCompatActivity {

    ArrayList<Food> foodArrayList = new ArrayList<>();
    RecyclerView rvFoods;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String output = getIntent().getStringExtra("name");
        TextView tvOutput = findViewById(R.id.tv_output);
        tvOutput.setText(output);

        //bikin array
        Food cat1 = new Food("cat1", R.drawable.cat1);
        Food cat2 = new Food("cat2", R.drawable.cat2);
        Food cat3 = new Food("cat3", R.drawable.cat3);
        Food cat4 = new Food("cat4", R.drawable.cat4);
        Food cat5 = new Food("cat5", R.drawable.cat5);
        foodArrayList.add(cat1);
        foodArrayList.add(cat2);
        foodArrayList.add(cat3);
        foodArrayList.add(cat4);
        foodArrayList.add(cat5);

        foodAdapter = new FoodAdapter(this, foodArrayList);


        rvFoods = findViewById(R.id.rv_foods);
//        GridLayoutManager;
//        LinearLayoutManager
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this);
        rvFoods.setLayoutManager(linearLayoutManager);
        rvFoods.setAdapter(foodAdapter);
    }
}