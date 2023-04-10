package com.example.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class listGroceriesActivity extends AppCompatActivity {

    private Shoppinglist list;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_groceries2);
        list = Shoppinglist.getInstance();

        recyclerView = findViewById(R.id.rvGroceries);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShoppingAdapter(getApplicationContext(), list.getGroceries()));
    }
}