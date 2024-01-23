package com.example.palindromeckecker;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText num;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num=findViewById(R.id.no);
        check=findViewById(R.id.check);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());
                int n = a;
                int rev=0;
                while (a > 0) {
                    int rem = a % 10;
                    rev = rev * 10 + rem;
                    a = a / 10;
                }
                if (n == rev) {
                    Toast.makeText(MainActivity.this, "PALINDROME NUMBER ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "NOT A PALINDROME", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}