package com.example.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class appetizer extends AppCompatActivity {

    int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer);


        Button next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox chickenBox = (CheckBox) findViewById(R.id.chickenBox);
                if (chickenBox.isChecked()) {
                    price = price + 100;
                }

                CheckBox greenBox = (CheckBox) findViewById(R.id.greenBox);
                if (greenBox.isChecked()) {
                    price = price + 85;
                }

                CheckBox ceasarBox = (CheckBox) findViewById(R.id.ceasarBox);
                if (ceasarBox.isChecked()) {
                    price = price + 95;
                }

                CheckBox pastaBox = (CheckBox) findViewById(R.id.pastaBox);
                if (pastaBox.isChecked()) {
                    price = price + 100;
                }

                Intent intent = new Intent(appetizer.this, maindish.class);
                intent.putExtra("PICA", price);
                startActivity(intent);
                finish();
            }
        });
    }
}
