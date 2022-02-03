package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //my buttons
    Button button, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, button11, button12, button13, button14, button15, button16,
            button17, button18, button19, button20, button21;

    //create a reference to a textView and a button
    private TextView showNumber;
    //private Button advanced;

    // get calculator class
    Calculator calc = new Calculator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference the textView ida transition button id
        showNumber = (TextView) findViewById(R.id.textView);
        //advanced = (Button) findViewById(R.id.button17);

        //buttons
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("1");
                showNumber.append("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("2");
                showNumber.append("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("3");
                showNumber.append("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("4");
                showNumber.append("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("5");
                showNumber.append("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("6");
                showNumber.append("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("7");
                showNumber.append("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("8");
                showNumber.append("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("9");
                showNumber.append("9");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("0");
                showNumber.append("0");
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("+");
                showNumber.append("+");
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("-");
                showNumber.append("-");
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("*");
                showNumber.append("*");
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("/");
                showNumber.append("/");
            }
        });
        //add logic
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber.append("=");
                /**
                 * call validate return
                 */
                calc.validate();
                String s = calc.getResult();
                if(s.equals("999")){
                    showNumber.append("Not An Operator");
                }
                else{
                    showNumber.append(s);
                }
            }
        });
        //add logic clear
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.purge();
                showNumber.setText(" ");
            }
        });
        //standard/ advance
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button18.getVisibility() == View.GONE){
                    button18.setVisibility(View.VISIBLE);
                    button19.setVisibility(View.VISIBLE);
                    button20.setVisibility(View.VISIBLE);
                    button21.setVisibility(View.VISIBLE);
                    button17.setText("STANDARD");
                }else{
                    button18.setVisibility(View.GONE);
                    button19.setVisibility(View.GONE);
                    button20.setVisibility(View.GONE);
                    button21.setVisibility(View.GONE);
                    button17.setText("ADVANCE - WITH HISTORY");
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("%");
                showNumber.append("%");
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("pow");
                showNumber.append("POW");
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("max");
                showNumber.append("MAX");
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.putStr("min");
                showNumber.append("MIN");
            }
        });
    }

}




/**
 * APP LOGIC
 * Imports a calculator class
 * Appends the key press into the calculator into an arrayList using onclick functions
 * onClick(button17) calls validate from the Calculate class and displays the value in the textView
 */