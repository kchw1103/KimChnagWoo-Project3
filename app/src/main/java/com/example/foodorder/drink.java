package com.example.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class drink extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            first = extras.getInt("CCB");
            second = extras.getInt("CGB");
            third = extras.getInt("CCSB");
            fourth = extras.getInt("CPB");

            fifth = extras.getInt("CBB");
            sizth = extras.getInt("CLB");
            seventh = extras.getInt("CIB");
            eighth = extras.getInt("CPPB");
        }

        Button next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CheckBox beefsteakBox = (CheckBox) findViewById(R.id.chickenBox);
                if (beefsteakBox.isChecked()) {
                    nineth = 1;
                }

                CheckBox greenBox = (CheckBox) findViewById(R.id.greenBox);
                if (greenBox.isChecked()) {
                    tenth = 1;
                }

                CheckBox ceasarBox = (CheckBox) findViewById(R.id.ceasarBox);
                if (ceasarBox.isChecked()) {
                    eleventh = 1;
                }

                CheckBox pastaBox = (CheckBox) findViewById(R.id.pastaBox);
                if (pastaBox.isChecked()) {
                    twelveth = 1;
                }

                Intent intent = new Intent(drink.this, dessert.class);
                intent.putExtra("CCB", first);
                intent.putExtra("CGB", second);
                intent.putExtra("CCSB", third);
                intent.putExtra("CPB", fourth);

                intent.putExtra("CBB", fifth);
                intent.putExtra("CLB", sizth);
                intent.putExtra("CIB", seventh);
                intent.putExtra("CPPB", eighth);

                intent.putExtra("CSB", nineth);
                intent.putExtra("CBEB", tenth);
                intent.putExtra("CCOB", eleventh);
                intent.putExtra("CWB", twelveth);
                startActivity(intent);
                finish();
            }
        });
    }
}
