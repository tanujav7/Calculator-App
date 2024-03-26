package com.example.calculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etVal1, etVal2;
    TextView tvRes;
    Button addBtn, subBtn, mulBtn, divBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Editview
        etVal1 = findViewById(R.id.etVal1);
        etVal2 = findViewById(R.id.etVal2);
        //Textview
        tvRes = findViewById(R.id.tvRes);
        //Buttons
        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal, secondVal, res;

                firstVal = Integer.parseInt(etVal1.getText().toString());
                secondVal = Integer.parseInt(etVal2.getText().toString());

                res = firstVal + secondVal;

                tvRes.setText("Answer is "+res);
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal, secondVal, res;

                firstVal = Integer.parseInt(etVal1.getText().toString());
                secondVal = Integer.parseInt(etVal2.getText().toString());

                res = firstVal - secondVal;

                tvRes.setText("Answer is "+res);
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal, secondVal, res;

                firstVal = Integer.parseInt(etVal1.getText().toString());
                secondVal = Integer.parseInt(etVal2.getText().toString());

                res = firstVal * secondVal;

                tvRes.setText("Answer is "+res);
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal, secondVal, res;

                firstVal = Integer.parseInt(etVal1.getText().toString());
                secondVal = Integer.parseInt(etVal2.getText().toString());

                res = firstVal / secondVal;

                tvRes.setText("Answer is "+res);
            }
        });
    }
}