package com.example.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // creating objects for buttons and viewing area
    Button button_0, button_1,  button_2, button_3, button_4, button_5, button_6, button_7,
            button_8, button_9, button_Add, button_Sub, button_Mul,
            button_Div, button_calc, button_dec, button_clear;

    EditText editText_window;

    // values to be operated
    float Value_1, Value_2;


    // known operations
    boolean mAddition, mSubtraction, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_0 = (Button) findViewById(R.id.btn_0);
    }
}
