package com.example.hello.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btneq,btncl;
    TextView tvnum,tvre;
    private final char ADD='+';
    private final char MUL='*';
    private final char SUB='-';
    private final char DIV='/';
    private  Double val1=Double.NaN;
    private double val2;
    private char AC;
    private final char EQU=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'9');
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'8');
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'7');
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'6');
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'5');
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'4');
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'3');
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'2');
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'1');
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnum.setText(tvnum.getText().toString()+'0');
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                AC=ADD;
                tvre.setText(String.valueOf(val1)+ '+');
                tvnum.setText(null);

            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                AC=MUL;
                tvre.setText(String.valueOf(val1)+ '*');
                tvnum.setText(null);

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                AC=DIV;
                tvre.setText(String.valueOf(val1)+ '/');
                tvnum.setText(null);

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                AC=SUB;
                tvre.setText(String.valueOf(val1)+ '-');
                tvnum.setText(null);

            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                AC=EQU;
                tvre.setText(String.valueOf(val1));
                tvnum.setText(null);

            }
        });
        btncl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvnum.getText().length()>0)
                {
                    CharSequence name= tvnum.getText().toString();
                    tvnum.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    tvnum.setText(null);
                    tvre.setText(null);
                }

            }
        });


    }
    private void setup()
    {
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btncl=(Button)findViewById(R.id.button10);
        btn0=(Button)findViewById(R.id.button11);
        btndiv=(Button)findViewById(R.id.button13);
        btnmul=(Button)findViewById(R.id.button14);
        btnadd=(Button)findViewById(R.id.button15);
        btnsub=(Button)findViewById(R.id.button16);
        btneq=(Button)findViewById(R.id.button12);
        tvnum=(TextView)findViewById(R.id.textView);
        tvre=(TextView)findViewById(R.id.textView2);
    }
    private  void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(tvnum.getText().toString());

            switch (AC)
            {
                case '+':
                    val1=val1+val2;
                    break;
                case '*':
                    val1=val1*val2;
                    break;
                case '-':
                    val1=val1-val2;
                    break;
                case '/':
                    val1=val1/val2;
                    break;
                case EQU:
                    break;
            }
        }
        else
        {
            val1=Double.parseDouble(tvnum.getText().toString());
        }

    }
}
