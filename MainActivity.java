package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View v)
    {
        EditText et1=(EditText)findViewById(R.id.editTextNumber);
        EditText et2=(EditText)findViewById(R.id.editTextNumber2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int result=num1+num2;
        et3.setText("Total Value is "+result);
    }
    public void Subtract(View v)
    {
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int result=num1-num2;
        et3.setText("Subtracted Value is "+result);

    }
    public void Multiply(View v)
    {
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int result=num1*num2;
        et3.setText("Multiplied Value is "+result);
    }
    public void Divide(View v)
    {
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());
        int result=num1/num2;
        et3.setText("Divided Value is "+result);

    }

}