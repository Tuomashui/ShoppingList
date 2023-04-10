package com.example.shoppinglist;

public class Grocery {
    protected String item;
    protected String reminder;
    protected int time;

    Grocery(String item, String reminder, int time) {
        this.item = item;
        this.reminder = reminder;
        this.time = time;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public String getItem() {
        return item;
    }

    public String getReminder() {
        return reminder;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}