package com.zybooks.mobileappproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AddEntryFragment extends Fragment implements View.OnClickListener {

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vv = inflater.inflate(R.layout.fragment_add_entry, container, false);

        Button submitButton = vv.findViewById(R.id.new_entry_button);

        submitButton.setOnClickListener(this);

        // Inflate the layout for this fragment
        return vv;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.new_entry_button:
                //Control the button
                break;
        }
    }
}