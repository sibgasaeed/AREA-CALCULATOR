package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Areaofcricle extends AppCompatActivity {
    EditText mEditRadius;
    TextView mTextResult;
    Button mButtonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaofcricle);
        mEditRadius=(EditText) findViewById(R.id.radius);
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
    public void calculates()
    {
        Double value1= Double.parseDouble(mEditRadius.getText().toString());
        Double calculateValue =3.14*value1*value1;
        mTextResult.setText(calculateValue.toString());

    }
}