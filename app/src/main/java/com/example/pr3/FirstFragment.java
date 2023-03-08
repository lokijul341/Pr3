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

public class FirstFragment extends Fragment {

    public FirstFragment() {
        super(R.layout.fragment_first);
    }

    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ToastShow("FragOne onCreateView");
        Log.i("FragOne", "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        ToastShow("FragOne onViewCreated");
        Log.i("FragOne", "onViewCreated");

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState){
        super.onViewStateRestored(savedInstanceState);
        ToastShow("FragOne onViewStateRestored");
        Log.i("FragOne", "onViewStateRestored");
    }
    @Override
    public void onStart(){
        super.onStart();
        ToastShow("FragOne onStart");
        Log.i("FragOne", "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        ToastShow("FragOne onResume");
        Log.i("FragOne", "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        ToastShow("FragOne onPause");
        Log.i("FragOne", "onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        ToastShow("FragOne onStop");
        Log.i("FragOne", "onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        ToastShow("FragOne onSaveInstanceState");
        Log.i("FragOne", "onSaveInstanceState");
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        ToastShow("FragOne onDestroyView");
        Log.i("FragOne", "onDestroyView");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        ToastShow("FragOne onDestroy");
        Log.i("FragOne", "onDestroy");
    }

    private void ToastShow(String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }


}