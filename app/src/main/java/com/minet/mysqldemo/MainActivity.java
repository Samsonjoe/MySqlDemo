package com.minet.mysqldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView editName,editPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.ededitName);
        editPassword = findViewById(R.id.ededitPassword);
        btnSignIn = findViewById(R.id.btnSignIn);


    }

    public void OnLogin(View view){
        String username = editName.getText().toString();
        String password = editPassword.getText().toString();
        String type = "login";

        BackGroundWorker backGroundWorker = new BackGroundWorker(this);
        backGroundWorker.execute(type,username,password);
    }
}
