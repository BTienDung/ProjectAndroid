package com.example.project;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class CustomToast extends Toast {
    public static final int SUCCESS = 1000;
    public static final int LONG = 7000;

    public CustomToast(Context context) {
        super(context);
    }
    public static Toast makeText(Context context, String message, int duration, int type, boolean androidicon) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.custometoast_layout, null, false);
        toast.setView(layout);
        return toast;
    }}
