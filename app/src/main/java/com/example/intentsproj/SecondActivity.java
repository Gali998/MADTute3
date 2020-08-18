package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    String no1,no2;
    int n1,n2;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sum = findViewById(R.id.sum);

        Intent intent = getIntent();

        no1 = intent.getStringExtra("n1");
        no2 = intent.getStringExtra("n2");

        num1.setText(no1);
        num2.setText(no2);

        n1 = Integer.parseInt(no1);
        n2 = Integer.parseInt(no2);
    }

    public void add(View view){
        sum.setText(no1+" + "+no2+"  = "+ (n1+n2));
    }

    public void substraction(View view){
        sum.setText(no1+ " - "+no2+ " = " +(n1-n2));
    }

    public void multiplication(View view){
        sum.setText(no1+" x "+no2+ " = " +(n1*n2));
    }

    public void divition(View view){
        sum.setText(no1+" / "+no2+" = "+(n1/n2));
    }

}