package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText ToastEx;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastEx = findViewById(R.id.ToastEx);

        ToastEx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast toast = Toast.makeText(getApplicationContext(),ToastEx.getText(),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}

