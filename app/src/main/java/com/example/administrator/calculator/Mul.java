package com.example.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mul extends AppCompatActivity {
    EditText n1,n2;
    Button b1,b2;
    String s1,s2,s3;
    int num1,num2,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);
        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        b1=(Button)findViewById(R.id.mul);
        b2=(Button)findViewById(R.id.back);
      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              s1=n1.getText().toString();
              s2=n2.getText().toString();
              num1=Integer.parseInt(s1);
              num2=Integer.parseInt(s2);
              num3=num1*num2;
              s3=String.valueOf(num3);
              Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
          }
      });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent (getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
