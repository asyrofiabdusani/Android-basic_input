package com.example.asyrofiabdusani.basicinput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText uname;
    private EditText pass;
    private Button loginBt;
    String user, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
        loginBt = (Button)findViewById(R.id.login);

        loginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginIntent();
            }
        });

    }

    private void loginIntent(){
        user = uname.getText().toString().trim();
        pwd = pass.getText().toString().trim();

        Intent loginIn = new Intent(this, NextActivity.class);
        loginIn.putExtra("username", user);
        loginIn.putExtra("password", pwd);

        startActivity(loginIn);
    }
}
