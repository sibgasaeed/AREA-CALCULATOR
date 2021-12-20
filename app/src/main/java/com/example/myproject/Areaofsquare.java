package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;


public class Areaofsquare extends AppCompatActivity {
    EditText mEditSide;
    TextView mTextResult;
    Button mButtonCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaofsquare);
        mEditSide=(EditText) findViewById(R.id.side);
        mTextResult=(TextView) findViewById(R.id.result) ;
        mButtonCount=(Button) findViewById(R.id.calculate);

        mButtonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                calculates();
            }
        });
    }
    public void calculates()
    {
        Double value1= Double.parseDouble(mEditSide.getText().toString());
        Double calculateValue = value1*value1;
        mTextResult.setText(calculateValue.toString());

    }
}