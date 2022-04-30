package com.zybooks.mobileappproject;


public class Entries {
    int date;
    int id;
    String resName;
    String meal;
    int rating;



    public Entries(int id, String resName, String meal, int rating) {
        this.id = id;
        this.resName = resName;
        this.meal = meal;
        this.rating = rating;
    }

    public int getId() { return id;}

    public String getResName() {
        return resName;
    }

    public String getMeal() { return meal; }

    public int getDate() {
        return date;
    }

    public int getRating() {
        return rating;
    }

}
