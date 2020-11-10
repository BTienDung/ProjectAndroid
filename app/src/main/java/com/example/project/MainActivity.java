package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnsubmit;
    private Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password  = findViewById(R.id.password);
        btnsubmit = findViewById(R.id.button);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            private Context context;

            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("dung") && password.getText().toString().equals("123456")){
                    openResultActivity();
                }else {
                    Toast.makeText(this.context, "Please enter your name", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void showDialog() {
        dialog = new Dialog(MainActivity.this);
        dialog.setTitle("Thangcode.com");
        dialog.setContentView(R.layout.dialog);
        dialog.show();
    }
    public void openResultActivity(){
        Intent intent = new Intent(this, Result.class);
        startActivity(intent);
    }
}