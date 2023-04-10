package com.example.shoppinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shoppinglist{

    private ArrayList<Grocery> groceries = new ArrayList<>();
    private static Shoppinglist singleton = null;

    private Shoppinglist(){
    }
    public static Shoppinglist getInstance(){
        if(singleton == null){
            singleton = new Shoppinglist();
        }
        return singleton;
    }

    public void sortByAlphabet(){
        Collections.sort(groceries, (t1, t2) -> t1.getItem().compareTo(t2.getItem()));
    }
    public void sortByTime(){
        Collections.sort(groceries, Comparator.comparingInt(Grocery::getTime));
    }
    public void AddGrocery(Grocery grocery){groceries.add(grocery);}

    public void removeGrocery(int position){
        groceries.remove(position);
    }

    public ArrayList<Grocery> getGroceries() {
        return groceries;
    }
    public void setGroceries(ArrayList<Grocery> groceries) {
        this.groceries = groceries;
    }

}



