package com.example.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class maindish extends AppCompatActivity {

    int first = 0;
    int second = 0;
    int third = 0;
    int fourth = 0;

    int fifth = 0;
    int sizth = 0;
    int seventh = 0;
    int eighth = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindish);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            first = extras.getInt("CCB");
            second = extras.getInt("CGB");
            third = extras.getInt("CCSB");
            fourth = extras.getInt("CPB");
        }

        Button next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox beefsteakBox = (CheckBox) findViewById(R.id.chickenBox);
                if (beefsteakBox.isChecked()) {
                    fifth = 1;
                }

                CheckBox greenBox = (CheckBox) findViewById(R.id.greenBox);
                if (greenBox.isChecked()) {
                    sizth = 1;
                }

                CheckBox ceasarBox = (CheckBox) findViewById(R.id.ceasarBox);
                if (ceasarBox.isChecked()) {
                    seventh = 1;
                }

                CheckBox pastaBox = (CheckBox) findViewById(R.id.pastaBox);
                if (pastaBox.isChecked()) {
                    eighth = 1;
                }

                Intent intent = new Intent(maindish.this, drink.class);
                intent.putExtra("CCB", first);
                intent.putExtra("CGB", second);
                intent.putExtra("CCSB", third);
                intent.putExtra("CPB", fourth);

                intent.putExtra("CBB", fifth);
                intent.putExtra("CLB", sizth);
                intent.putExtra("CIB", seventh);
                intent.putExtra("CPPB", eighth);
                startActivity(intent);
                finish();
            }
        });
    }
}
