package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    CheckBox chb1, chb2, chb3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chb1 = (CheckBox) findViewById(R.id.checkBox1);
        chb2 = (CheckBox) findViewById(R.id.checkBox2);
        chb3 = (CheckBox) findViewById(R.id.checkBox3);

        btn1 = (Button) findViewById(R.id.button1);

        chb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chb1.isChecked() == true) {
                    btn1.setEnabled(true);
                } else {
                    btn1.setEnabled(false);
                }
            }
        });

        chb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chb2.isChecked() == true) {
                    btn1.setClickable(true);
                } else {
                    btn1.setClickable(false);
                }
            }
        });

        chb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chb3.isChecked() == true) {
                    btn1.setRotation(45);
                } else {
                    btn1.setRotation(0);
                }
            }
        });
    }
}
