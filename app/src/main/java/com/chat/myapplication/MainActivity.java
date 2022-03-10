package com.chat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button rv;
    RecyclerView recylerView;
    FoodAdapter foodAdapter;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.Recv);
        recylerView.setLayoutManager(new LinearLayoutManager(context));

        ArrayList<Food> foodArrayList = new ArrayList<>();
        foodAdapter = new FoodAdapter(context, foodArrayList);
        foodArrayList.add(new Food("Biryani", R.drawable.biryani));
        foodArrayList.add(new Food("Broast", R.drawable.broast));
        foodArrayList.add(new Food("Chicken Pulao", R.drawable.biryani));
        foodArrayList.add(new Food("Chinese Rice", R.drawable.chinese));
        foodArrayList.add(new Food("Finger Fish", R.drawable.fingerfish));
        foodArrayList.add(new Food("Finger Fish", R.drawable.fingerfish));
        foodArrayList.add(new Food("Finger Fish", R.drawable.fingerfish));
        foodArrayList.add(new Food("Finger Fish", R.drawable.fingerfish));
        foodArrayList.add(new Food("Beef Burger", R.drawable.biryani));
        foodArrayList.add(new Food("Fried Fish", R.drawable.fish));
        foodAdapter = new FoodAdapter(context, foodArrayList);
        recylerView.setAdapter(foodAdapter);

    }}
