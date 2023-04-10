package com.example.shoppinglist;
import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GroceryviewHolder extends RecyclerView.ViewHolder {

        TextView rvitem, rvreminder;
        ImageView editimg, deleteimg;
        EditText editname;

        public GroceryviewHolder(@NonNull View itemView) {
            super(itemView);
            rvitem = itemView.findViewById(R.id.rvitem);
            rvreminder = itemView.findViewById(R.id.rvreminder);
            editimg = itemView.findViewById(R.id.imgedit);
            deleteimg = itemView.findViewById(R.id.imgdelete);
            editname = itemView.findViewById(R.id.editName);
        }

    }

