package com.zybooks.mobileappproject;

import android.graphics.Bitmap;

public class Entries {
    int date;
    int id;
    String resName;
    String meal;
    int rating;
    String image;



    public Entries(int id, String resName, String meal, int date, int rating, String image) {
        this.id = id;
        this.resName = resName;
        this.meal = meal;
        this.date = date;
        this.rating = rating;
        this.image = image;
    }

    public int getId() { return id;}

    public String getResName() {
        return resName;
    }

    public String getMeal() { return meal; }

    public int getRating() {
        return rating;
    }

    public String getImageURL() { return image; }
}
