package com.example.quickcustomtoastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Event to display colored toast
    public void displayColoredToast(View view){
        LayoutInflater inflater = getLayoutInflater();
        View custom_layout = inflater.inflate(R.layout.custom_toast_color, (ViewGroup) findViewById(R.id.custom_toast_color));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(custom_layout);
        toast.show();
    }

    // Event to display an image of toast
    public void displayImageToast(View view){
        LayoutInflater inflater = getLayoutInflater();
        View custom_layout = inflater.inflate(R.layout.custom_toast_image, (ViewGroup) findViewById(R.id.custom_toast_image));

        Toast toast = new Toast(getApplicationContext());
        // Set Gravity allows you to position your toast
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(custom_layout);
        toast.show();
    }

    // Event to display a fancy toast
    public void displayFancyToast(View view){
//        LayoutInflater inflater = getLayoutInflater();
//        View custom_layout = inflater.inflate(R.layout.custom_toast_image, (ViewGroup) findViewById(R.id.custom_toast_image));
//
//        Toast toast = new Toast(getApplicationContext());
//        // Set Gravity allows you to position your toast
//        toast.setGravity(Gravity.CENTER, 0, 0);
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setView(custom_layout);
//        toast.show();
    }



}