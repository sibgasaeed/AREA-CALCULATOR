package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Areaofrectangle extends AppCompatActivity {

    EditText mEditWidth;
    EditText mEditHeight;
    TextView mTextResult;
    Button mButtonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaofrectangle);
        mEditWidth=(EditText) findViewById(R.id.editwidth);
        mEditHeight=(EditText) findViewById(R.id.editheight);
        mTextResult=(TextView) findViewById(R.id.result) ;
        mButtonCalculate=(Button) findViewById(R.id.calculate);

        mButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                calculates();
            }
        });
    }
    public void calculates(){
        Double value1= Double.parseDouble(mEditWidth.getText().toString());
        Double value2= Double.parseDouble(mEditHeight.getText().toString());
        Double calculateValue = value1*value2;
        mTextResult.setText(calculateValue.toString());

    }
}