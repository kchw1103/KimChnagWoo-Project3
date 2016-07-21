package com.example.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class appetizer extends AppCompatActivity {

    int first = 0;
    int second = 0;
    int third = 0;
    int fourth = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer);


        Button next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox chickenBox = (CheckBox) findViewById(R.id.chickenBox);
                if (chickenBox.isChecked()) {
                    first = 1;
                }

                CheckBox greenBox = (CheckBox) findViewById(R.id.greenBox);
                if (greenBox.isChecked()) {
                    second = 1;
                }

                CheckBox ceasarBox = (CheckBox) findViewById(R.id.ceasarBox);
                if (ceasarBox.isChecked()) {
                    third = 1;
                }

                CheckBox pastaBox = (CheckBox) findViewById(R.id.pastaBox);
                if (pastaBox.isChecked()) {
                    fourth = 1;
                }

                Intent intent = new Intent(appetizer.this, maindish.class);
                intent.putExtra("CCB", first);
                intent.putExtra("CGB", second);
                intent.putExtra("CCSB", third);
                intent.putExtra("CPB", fourth);
                startActivity(intent);
                finish();
            }
        });
    }
}
