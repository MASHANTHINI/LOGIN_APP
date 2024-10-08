package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username =(TextView) findViewById(R.id.username);
        TextView password=(TextView) findViewById(R.id.pass);

       MaterialButton loginbtn=(MaterialButton) findViewById(R.id.loginbtn);
       loginbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                   Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_LONG).show();

               } else
                   Toast.makeText(MainActivity.this, "LOGIN UNSUCCESSFULL", Toast.LENGTH_LONG).show();
           }
       });

    }

}