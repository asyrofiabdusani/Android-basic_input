package com.example.asyrofiabdusani.basicinput;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    private TextView uname;
    private TextView pass;
    private Button exitBt;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        getValue();

        uname = findViewById(R.id.nama);
        pass = findViewById(R.id.pwd);
        exitBt = findViewById(R.id.exit);

        uname.setText(username);
        pass.setText(password);
        exitBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitListener();
            }
        });
    }

    private void getValue(){
        Intent getIn = getIntent();
        username = getIn.getStringExtra("username");
        password = getIn.getStringExtra("password");
    }

    private void exitListener(){
        ActivityCompat.finishAffinity(this);
        finish();

    }
}
