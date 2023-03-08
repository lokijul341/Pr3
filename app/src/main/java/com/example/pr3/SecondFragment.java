package com.example.pr3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.pr3.FirstFragment;


public class SecondFragment extends Fragment {

    private EditText editText;
    private Button button2;
    private MainActivity mainActivity;
    //public SecondFragment() {
    //}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        editText = view.findViewById(R.id.editTextNumber);
        button2 = view.findViewById(R.id.button2);
        mainActivity = (MainActivity) getActivity();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                mainActivity.setText(text);
            }
        });
        Bundle args = getArguments();
        if (args != null) {
            String text = args.getString("text");
            editText.setText(text);
        }
        return view;
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