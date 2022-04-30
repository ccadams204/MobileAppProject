package com.zybooks.mobileappproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddEntryFragment extends Fragment implements View.OnClickListener {

    List<Entries> entriesList;
    EditText name, mealName, rating;




    MyApplication myApplication =  this.getApplication();

    private MyApplication getApplication() {
        return myApplication;
    }


    public static final String ARG_SAVE_ID = "save_id";

    private String Save_ID = "Save_0";
    private SharedPreferences save_pref;

    public AddEntryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vv = inflater.inflate(R.layout.fragment_add_entry, container, false);

        Button submitButton = vv.findViewById(R.id.new_entry_button);

        submitButton.setOnClickListener(this);


        // Inflate the layout for this fragment
        return vv;

    }

    @Override
    public void onClick(View view) {
           switch (view.getId()){
        case R.id.new_entry_button:
            entriesList = myApplication.getEntriesList();
            name = name.findViewById(R.id.name);
            mealName = mealName.findViewById(R.id.mealName);
            rating = rating.findViewById(R.id.visitedDate);
            //rating here

            int nextId = myApplication.getNextId();
            Entries newEntry = new Entries(nextId, name.getText().toString(),mealName.getText().toString(), 0);

            entriesList.add(newEntry);
            myApplication.setNextId(nextId++);
            myApplication.fillEntryList();

            break;
        }
    }
}
