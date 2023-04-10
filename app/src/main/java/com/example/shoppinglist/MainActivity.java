package com.example.shoppinglist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    Grocery grcry = new Grocery(null, null,0);


    private TextView item;
    private TextView reminder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item = findViewById(R.id.itemMain);
        reminder = findViewById(R.id.reminderMain);
        context = MainActivity.this;
    }


    public void showgroceries(@NonNull View view){
        Intent intent = new Intent(this, listGroceriesActivity.class);
        startActivity(intent);
    }

    public void addgrocery(@NonNull View view){
        System.out.println(item.getText().toString());
        grcry.item = item.getText().toString();
        grcry.reminder = reminder.getText().toString();
        grcry.time = Shoppinglist.getInstance().getGroceries().size();
        Shoppinglist.getInstance().AddGrocery(new Grocery(grcry.item,grcry.reminder, grcry.time));
    }

    public void toAlphabet(View view){
        Shoppinglist.getInstance().sortByAlphabet();
    }
    public void toTime(View view){
        Shoppinglist.getInstance().sortByTime();
    }


}