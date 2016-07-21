package com.example.foodorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bill extends AppCompatActivity {

    int first = 0;
    int second = 0;
    int third = 0;
    int fourth = 0;

    int fifth = 0;
    int sizth = 0;
    int seventh = 0;
    int eighth = 0;

    int nineth = 0;
    int tenth = 0;
    int eleventh = 0;
    int twelveth = 0;

    int thriteenth = 0;
    int forteenth = 0;
    int tifteenth = 0;
    int sizteenth = 0;

    int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Bundle extras = getIntent().getExtras();
            first = extras.getInt("CCB");
            second = extras.getInt("CGB");
            third = extras.getInt("CCSB");
            fourth = extras.getInt("CPB");

            fifth = extras.getInt("CBB");
            sizth = extras.getInt("CLB");
            seventh = extras.getInt("CIB");
            eighth = extras.getInt("CPPB");

            nineth = extras.getInt("CSB");
            tenth = extras.getInt("CBEB");
            eleventh = extras.getInt("CCOB");
            twelveth = extras.getInt("CWB");

            thriteenth = extras.getInt("CCKB");
            forteenth = extras.getInt("CSkB");
            tifteenth = extras.getInt("CCCB");
            sizteenth = extras.getInt("CCFB");

        price = (first * 100) + (second * 85) + (third * 95) + (fourth * 100) + (fifth * 250) +
                (sizth * 230) + (seventh * 220) + (eighth * 180) + (nineth * 12) + (tenth * 28) +
                (eleventh * 75) + (twelveth * 100) + (thriteenth * 30) + (forteenth * 30) + (tifteenth * 25) +
                (sizteenth * 20);

                TextView result = (TextView) findViewById(R.id.result);
        result.setText(""+price);
    }
}
