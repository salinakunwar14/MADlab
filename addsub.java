package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private static final android.R.attr R = ;
EditText etNumber1, etNumber2;
Button btnAdd, btnSubtract;
TextView tvResult;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    etNumber1 = findViewById(R.id.etNumber1);
    etNumber2 = findViewById(R.id.etNumber2);
    btnAdd = findViewById(R.id.btnAdd);
    btnSubtract = findViewById(R.id.btnSubtract);
    tvResult = findViewById(R.id.tvResult);

    btnAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calculateResult(true);
        }
    });

    btnSubtract.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            calculateResult(false);
        }
    });
}

private void calculateResult(boolean isAddition) {
    String num1 = etNumber1.getText().toString();
    String num2 = etNumber2.getText().toString();

    if (!num1.isEmpty() && !num2.isEmpty()) {
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        double result = isAddition ? number1 + number2 : number1 - number2;

        tvResult.setText("Result: " + result);
    } else {
        tvResult.setText("Please enter both numbers.");
    }
}
} OR
private void calculateResult(boolean isAddition) {
String num1 = etNumber1.getText().toString().trim();
String num2 = etNumber2.getText().toString().trim();

// Check if inputs are empty
if (num1.isEmpty() || num2.isEmpty()) {
    tvResult.setText("Please enter both numbers.");
    return;
}

// Convert to double before performing operations
double number1 = Double.parseDouble(num1);
double number2 = Double.parseDouble(num2);

double result = isAddition ? (number1 + number2) : (number1 - number2);

tvResult.setText("Result: " + result);
}

