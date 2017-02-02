package com.example.rajan55224.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;



public class SynthesizerActivity extends AppCompatActivity implements View.OnClickListener{


    private static final String TAG = SynthesizerActivity.class.getSimpleName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private TextView text;
    private TextView counter;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private int x;
    private int y;
    private int z;
    private int a;
    private int b;
    private int c;
    private int d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        text = (TextView) findViewById(R.id.text);
        counter = (TextView) findViewById(R.id.counter);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(SynthesizerActivity.this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(SynthesizerActivity.this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(SynthesizerActivity.this);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(SynthesizerActivity.this);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(SynthesizerActivity.this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(SynthesizerActivity.this);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(SynthesizerActivity.this);

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(SynthesizerActivity.this);

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(SynthesizerActivity.this);

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(SynthesizerActivity.this);

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(SynthesizerActivity.this);

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(SynthesizerActivity.this);

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(SynthesizerActivity.this);

        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(SynthesizerActivity.this);

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(SynthesizerActivity.this);


        x = 1;
        y = 0;
        z = 0;

        a = 1;
        b = 1;
        c = 1;
        d = 1;


    }




    public void toAdd(String s) {


        if (x == 0) {
            counter.setText(" ");
            x = 1;
            counter.append(s);}

        else {
            counter.append(s);}
    }



    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button1) {
            toAdd("1");
        }

        else if (v.getId() == R.id.button2) {
            toAdd("2");
        }

        else if (v.getId() == R.id.button3) {
            toAdd("3");
        }

        else if (v.getId() == R.id.button4) {    //addition
            y = Integer.parseInt((counter.getText().toString()).substring(1));
            counter.setText("_");
            x = 0;
            d = 0;
        }

        else if (v.getId() == R.id.button13) {    //subtract
            y = Integer.parseInt((counter.getText().toString()).substring(1));
            counter.setText("_");
            x = 0;
            a = 0;
        }

        else if (v.getId() == R.id.button14) {    //multiply
            y = Integer.parseInt((counter.getText().toString()).substring(1));
            counter.setText("_");
            x = 0;
            b = 0;
        }

        else if (v.getId() == R.id.button15) {    //division
            y = Integer.parseInt((counter.getText().toString()).substring(1));
            counter.setText("_");
            x = 0;
            c = 0;
        }

        else if (v.getId() == R.id.button5) {      //equals
            z = Integer.parseInt((counter.getText().toString()).substring(1));
            if (a == 0) {
                counter.setText(String.valueOf(y - z));
            }
            else if (b == 0) {
                counter.setText(String.valueOf(y * z));
            }
            else if (c == 0) {
                counter.setText(String.valueOf(y / z));
            }
            else if (d == 0){
                counter.setText(String.valueOf(y + z));

            }
            x = 0;

        }

        else if (v.getId() == R.id.button6) {    //clear
            counter.setText(" ");
            x = 1;
            y = 0;
            z = 0;
            a = 1;
            b = 1;
            c = 1;
        }

        else if (v.getId() == R.id.button7) {
            toAdd("4");
        }

        else if (v.getId() == R.id.button8) {
            toAdd("5");
        }

        else if (v.getId() == R.id.button9) {
            toAdd("6");
        }

        else if (v.getId() == R.id.button10) {
            toAdd("7");
        }

        else if (v.getId() == R.id.button11) {
            toAdd("8");
        }

        else if (v.getId() == R.id.button12) {
            toAdd("9");
        }
    }





}
