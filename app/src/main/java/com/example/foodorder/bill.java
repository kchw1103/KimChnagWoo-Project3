package com.example.foodorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bill extends AppCompatActivity {

    int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            price = extras.getInt("PICD");
        }
                TextView result = (TextView) findViewById(R.id.result);
        result.setText("" + price + "$");
    }
}
