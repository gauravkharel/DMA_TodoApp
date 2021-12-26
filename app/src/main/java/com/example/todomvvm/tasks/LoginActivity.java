package com.example.todomvvm.tasks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.todomvvm.R;
import com.example.todomvvm.database.User;
import com.example.todomvvm.database.UserDAO;
import com.example.todomvvm.database.UserDataBase;

public class LoginActivity   extends AppCompatActivity {
    UserDAO db;
    UserDataBase dataBase;
    Button login;
    TextView register;
    EditText etmail , epassword;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);
         etmail= (EditText) findViewById(R.id.et_email);
        epassword =(EditText) findViewById(R.id.et_password);
        login =findViewById(R.id.btn_login);
        register = findViewById(R.id.swipeRight);

        dataBase = Room.databaseBuilder(this, UserDataBase.class, "mi-database.db")
                .allowMainThreadQueries()
                .build();
        db = dataBase.getUserDAO();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etmail.getText().toString().trim();
                String password = epassword.getText().toString().trim();

                User user = db.getUser(email, password);
                if (user != null) {
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    i.putExtra("User", user);
                    startActivity(i);
                   finish();
                }else{
                    Toast.makeText(LoginActivity.this, "Unregistered user, or incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
