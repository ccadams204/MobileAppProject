package com.zybooks.mobileappproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View parentView = inflater.inflate(R.layout.fragment_home, container, false);

        Button newEntryButton = parentView.findViewById(R.id.new_entry_button);
        newEntryButton.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.navigation_add_entry);
        });

        Button savedEntriesButton = parentView.findViewById(R.id.saved_entries_button);
        savedEntriesButton.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.navigation_saved_entries);
        });

        return parentView;
    }
}