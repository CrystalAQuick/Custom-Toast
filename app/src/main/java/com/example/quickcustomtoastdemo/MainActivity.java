package com.example.quickcustomtoastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    // Event to display a fancy toast. This contains both an image and colored background
    // See the layoutfile custom_fancy_toast for a look inside.
    public void displayFancyToast(View view){
        // LayoutInflater is used to create a new layout from an xml file
        LayoutInflater inflater = getLayoutInflater();

        // Defines the layout, takes in an xml object and builds a view. Refers an existing view
        View custom_layout = inflater.inflate(R.layout.custom_fancy_toast, (ViewGroup) findViewById(R.id.custom_fancy_toast));

        // Creating a new toast object
        Toast toast = new Toast(getApplicationContext());

        // Setting the length to display the toast
        toast.setDuration(Toast.LENGTH_LONG);

        // Specifying the view to show
        toast.setView(custom_layout);
        toast.show();
    }
}