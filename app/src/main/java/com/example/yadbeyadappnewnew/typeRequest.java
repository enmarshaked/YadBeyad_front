package com.example.yadbeyadappnewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class typeRequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_request);

        Button finished = (Button) findViewById(R.id.finished);
        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText requestDescriptionEdit = (EditText) findViewById(R.id.requestDescription);
                String requestDescription = requestDescriptionEdit.getText().toString();

            }
        });
    }
}