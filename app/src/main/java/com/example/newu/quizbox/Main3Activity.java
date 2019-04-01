package com.example.newu.quizbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView t1;
    private CheckBox c1,c2,c3,c4;
    private Switch s1,s2;
    private RadioGroup r1,r2;
    int j=0;
    private Button b,B1,B2,B3,B4,B5,B6;
    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t1=(TextView)findViewById(R.id.tt);
        c1=(CheckBox)findViewById(R.id.cb1);
        c2=(CheckBox)findViewById(R.id.cb2);
        c3=(CheckBox)findViewById(R.id.cb3);
        c4=(CheckBox)findViewById(R.id.cb4);
        r1=(RadioGroup)findViewById(R.id.rg1);
        r2=(RadioGroup)findViewById(R.id.rg2);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb4=(RadioButton)findViewById(R.id.rb4);
        rb5=(RadioButton)findViewById(R.id.rb5);
        rb6=(RadioButton)findViewById(R.id.rb6);
        rb7=(RadioButton)findViewById(R.id.rb7);
        rb8=(RadioButton)findViewById(R.id.rb8);
        s1=(Switch)findViewById(R.id.switch1);
        s2=(Switch)findViewById(R.id.switch2);
        b=(Button)findViewById(R.id.finishButton);
        B1=(Button)findViewById(R.id.bb1);
        B2=(Button)findViewById(R.id.bb2);
        B3=(Button)findViewById(R.id.bb3);
        B4=(Button)findViewById(R.id.bb4);
        B5=(Button)findViewById(R.id.bb5);
        B6=(Button)findViewById(R.id.bb6);

        // for question 1
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.isChecked()){
                    j=j+2;
                }
            }
        });


        // for question 2
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s2.isChecked()){
                    j=j+2;
                }
            }
        });


        //for question 3
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rbg1 = r1.getCheckedRadioButtonId();
                if(rbg1 == R.id.rb1){
                    j = j+2;
                }
            }
        });


        //for question 4
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rbg2 = r2.getCheckedRadioButtonId();
                if (rbg2 == R.id.rb5){
                    j+=2;
                }
            }
        });


        //for question 5
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()){
                    j+=2;
                }
            }
        });


        //for question 6
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c3.isChecked()){
                    j+=2;
                }
            }
        });



        i=getIntent();
        String s = i.getStringExtra("name");
        t1.setText("Name : "+s);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(Main3Activity.this,Main4Activity.class);
                b.putExtra("Score",j);
                startActivity(b);
                finish();
            }
        });

    }

}

