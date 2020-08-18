package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sum = findViewById(R.id.sum);
    }

    public void openSecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",num1.getText().toString());
        intent.putExtra("n2",num2.getText().toString());

        //creating layout inflater instance
        LayoutInflater l1 = getLayoutInflater();

        //getting view object as defined in the customtoast.xml file
        View layout = l1.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));

        //creating the toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);

        //setting the view of custom toast layout
        toast.show();

        startActivity(intent);
    }
}