package com.example.newu.quizbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    private Intent i;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t1=(TextView)findViewById(R.id.part1);
        i=getIntent();
        int f = i.getIntExtra("Score",4);
        t1.setText("Score is :  " +f );
    }
}
