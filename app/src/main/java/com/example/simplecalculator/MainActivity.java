package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }
    public void add(View v) { double a = Double.parseDouble(num1.getText().toString()); double b = Double.parseDouble(num2.getText().toString()); result.setText(String.valueOf(a + b)); }
    public void subtract(View v) { double a = Double.parseDouble(num1.getText().toString()); double b = Double.parseDouble(num2.getText().toString()); result.setText(String.valueOf(a - b)); }
    public void multiply(View v) { double a = Double.parseDouble(num1.getText().toString()); double b = Double.parseDouble(num2.getText().toString()); result.setText(String.valueOf(a * b)); }
    public void divide(View v) { double a = Double.parseDouble(num1.getText().toString()); double b = Double.parseDouble(num2.getText().toString()); if (b != 0) result.setText(String.valueOf(a / b)); else result.setText("Error"); }
}
