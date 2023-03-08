package com.example.pr3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
public class FirstFragment extends Fragment {

    private TextView textView;
    private ImageButton button1;
    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        textView = view.findViewById(R.id.textView13);
        button1 = view.findViewById(R.id.imageButton7);
        mainActivity = (MainActivity) getActivity();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.openSecondFragment(textView.getText().toString());
            }
        });
        return view;
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