package com.example.daytowiti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button showMessage;
    EditText message,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage=findViewById(R.id.btn_show);
        message=findViewById(R.id.edt_message);

        showMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,message.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }


    public void onclickClose(View view) {
        finish();
    }

}