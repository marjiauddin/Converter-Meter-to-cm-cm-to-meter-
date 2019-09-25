package com.example.converterapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText numberET;
private RadioButton metertocmRB,cmtometerRB;
private Button convertBtn;
private TextView resultTV;
private String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numberET=findViewById(R.id.numberET);
        metertocmRB=findViewById(R.id.metertocmRB);
        cmtometerRB=findViewById(R.id.cmtometerRB);
        convertBtn=findViewById(R.id.convertBtn);
        resultTV=findViewById(R.id.resultTV);



        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = numberET.getText().toString();
                if (number.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter number", Toast.LENGTH_LONG).show();
                } else {


                    if (metertocmRB.isChecked()) {
                        double totalNumber = Double.valueOf(number);
                        double result = totalNumber * 100;
                        resultTV.setText(String.valueOf(result));

                    } else {
                        double totalNumber = Double.valueOf(number);
                        double result = totalNumber / 100;
                        resultTV.setText(String.valueOf(result));

                    }
                }
            }
        });


    }
}
