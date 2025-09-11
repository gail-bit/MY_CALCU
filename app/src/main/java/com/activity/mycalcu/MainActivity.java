package com.activity.mycalcu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }
    public void plus(View view) {
        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        TextView textView = findViewById(R.id.textView2);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        textView.setText(String.valueOf(num1 + num2));
    }

    public void minus(View view) {
        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        TextView textView = findViewById(R.id.textView2);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        textView.setText(String.valueOf(num1 - num2));
    }

    public void times(View view) {
        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        TextView textView = findViewById(R.id.textView2);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        textView.setText(String.valueOf(num1 * num2));
    }

    public void divide(View view) {
        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        TextView textView = findViewById(R.id.textView2);

        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());

        if (num2 == 0) {
            textView.setText("Error");
        } else {
            textView.setText(String.format("%.2f", num1 / num2));
        }
    }


    public void power(View view) {
        EditText editText1 = findViewById(R.id.editTextNumber);
        TextView textView = findViewById(R.id.textView2);

        int num1 = Integer.parseInt(editText1.getText().toString());
        textView.setText(String.valueOf(num1 * num1));
    }

    public void cube(View view) {
        EditText editText1 = findViewById(R.id.editTextNumber);
        TextView textView = findViewById(R.id.textView2);

        int num1 = Integer.parseInt(editText1.getText().toString());
        textView.setText(String.valueOf(num1 * num1 * num1));
    }
}