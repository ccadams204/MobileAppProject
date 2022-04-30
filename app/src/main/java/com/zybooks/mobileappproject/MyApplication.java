package com.zybooks.mobileappproject;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {

    private static List<Entries> entriesList = new ArrayList<Entries>();
    private static int nextId= 1;


    public MyApplication() {
        fillEntryList();

    }

    public void fillEntryList() {
        Entries p0 = new Entries(0, "McDonald's", "Nuggets",5);

        entriesList.addAll(Arrays.asList(new Entries[]{p0}));

    }

    public static List<Entries> getEntriesList() {
        return entriesList;
    }

    public static void setEntriesList(List<Entries> entriesList) {
        MyApplication.entriesList = entriesList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
}
