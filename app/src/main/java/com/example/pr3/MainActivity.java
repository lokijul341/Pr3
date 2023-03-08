package com.example.pr3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.pr3.FirstFragment;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.pr3.FirstFragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView = findViewById(R.id.textView13);


        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view_tag, new FirstFragment())
                    .commit();
        }
    }
    public void openSecondFragment(String text) {
        SecondFragment secondFragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString("text", text);
        secondFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view_tag, secondFragment)
                .addToBackStack(null).commit();
    }

    public void setText(String text) {
        textView.setText(text);
        getSupportFragmentManager().popBackStack();
    }
}






