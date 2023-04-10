package com.example.shoppinglist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class ShoppingAdapter extends RecyclerView.Adapter<GroceryviewHolder>  {
        private Context context;
        private ArrayList<Grocery> groceries;

        public ShoppingAdapter(@NonNull Context context, @NonNull ArrayList<Grocery> groceries) {
            this.context = context;
            this.groceries = groceries;
        }

        @NonNull
        @Override
        public GroceryviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new GroceryviewHolder(LayoutInflater.from(context).inflate(R.layout.groceries_view, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull GroceryviewHolder holder, int position) {
            System.out.println(groceries.get(position).getItem());
            holder.rvitem.setText(groceries.get(position).getItem());
            holder.rvreminder.setText(groceries.get(position).getReminder());
            holder.deleteimg.setOnClickListener(view -> {
                int pos = holder.getAdapterPosition();
            Shoppinglist.getInstance().removeGrocery(pos);
            notifyItemRemoved(pos);
            });
            holder.editimg.setOnClickListener(view -> {
                int pos = holder.getAdapterPosition();
                if(holder.editname.getVisibility() == View.VISIBLE){
                    Grocery grocery = Shoppinglist.getInstance().getGroceries().get(pos);
                    grocery.setItem(holder.editname.getText().toString());
                    holder.editname.setVisibility(View.GONE);
                    notifyDataSetChanged();
                }else{
                    holder.editname.setVisibility(View.VISIBLE);
                }
            });
        }

        @Override
        public int getItemCount() {return groceries.size();}
    }
