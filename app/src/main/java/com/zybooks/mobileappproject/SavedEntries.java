package com.zybooks.mobileappproject;



import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class SavedEntries extends Fragment implements View.OnClickListener {


    MyApplication myApplication = this.getApplication();


    List<Entries> entriesList;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public SavedEntries() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //entriesList = myApplication.getEntriesList();

        /**entriesList = myApplication.getEntriesList();

        recyclerView = recyclerView.findViewById(R.id.lv_entryList);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new RecycleViewAdapter(entriesList, (Context) getActivity());
        recyclerView.setAdapter(mAdapter);
         **/

        return inflater.inflate(R.layout.fragment_saved_entries, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /**entriesList = myApplication.getEntriesList();

         recyclerView = recyclerView.findViewById(R.id.lv_entryList);
         recyclerView.setHasFixedSize(true);

         layoutManager = new LinearLayoutManager(getActivity());
         recyclerView.setLayoutManager(layoutManager);

         mAdapter = new RecycleViewAdapter(entriesList, (Context) getActivity());
         recyclerView.setAdapter(mAdapter);
         **/
    }

    public MyApplication getApplication() {
        MyApplication application = new MyApplication();
        return application;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.navigation_saved_entries:
                //Control the button
                break;
        }
    }
}

