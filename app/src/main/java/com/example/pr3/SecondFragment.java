package com.example.pr3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SecondFragment extends Fragment {

    public SecondFragment() {
        super(R.layout.fragment_second);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToastShow("OnCreate");

    }
    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ToastShow("FragTwo onCreateView");
        Log.i("FragTwo", "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        ToastShow("FragTwo onViewCreated");
        Log.i("FragTwo", "onViewCreated");

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState){
        super.onViewStateRestored(savedInstanceState);
        ToastShow("FragTwo onViewStateRestored");
        Log.i("FragTwo", "onViewStateRestored");
    }
    @Override
    public void onStart(){
        super.onStart();
        ToastShow("FragTwo onStart");
        Log.i("FragTwo", "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        ToastShow("FragTwo onResume");
        Log.i("FragTwo", "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        ToastShow("FragTwo onPause");
        Log.i("FragTwo", "onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        ToastShow("FragTwo onStop");
        Log.i("FragTwo", "onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        ToastShow("FragTwo onSaveInstanceState");
        Log.i("FragTwo", "onSaveInstanceState");
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        ToastShow("FragTwo onDestroyView");
        Log.i("FragTwo", "onDestroyView");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        ToastShow("FragTwo onDestroy");
        Log.i("FragTwo", "onDestroy");
    }

    private void ToastShow(String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }
}