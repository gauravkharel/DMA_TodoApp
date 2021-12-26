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

public class RegisterActivity extends AppCompatActivity {
    Button register;

    EditText name, password, email, passwordagain;
    String userName, passwordfirst, passsecond, emails;
    TextView login;
    private UserDAO userDao;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register);

        name = findViewById(R.id.et_name);
        password = findViewById(R.id.et_password);
        passwordagain =findViewById(R.id.et_repassword);
        email = findViewById(R.id.et_email);
        login= findViewById(R.id.swipeLeft);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
        register = findViewById(R.id.btn_register);



        userDao = Room.databaseBuilder(RegisterActivity.this, UserDataBase.class, "mi-database.db").allowMainThreadQueries()
                .build().getUserDAO();

        register .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = name.getText().toString();
                passwordfirst = password.getText().toString();
                passsecond = passwordagain.getText().toString();
                emails = email.getText().toString();
                if (passwordfirst.equals(passsecond)) {
                    User user = new User(userName, passwordfirst, emails);
                    userDao.insert(user);

                    Intent moveToLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(moveToLogin);
                    finish();

                } else {
                    Toast.makeText(RegisterActivity.this, "Password is not matching", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
