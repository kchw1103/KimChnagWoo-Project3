package com.example.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class drink extends AppCompatActivity {

    int lastprice = 0;
    int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            lastprice = extras.getInt("PICB");
        }

        Button next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CheckBox beefsteakBox = (CheckBox) findViewById(R.id.chickenBox);
                if (beefsteakBox.isChecked()) {
                    price = price + 12;
                }

                CheckBox greenBox = (CheckBox) findViewById(R.id.greenBox);
                if (greenBox.isChecked()) {
                    price = price + 28;
                }

                CheckBox ceasarBox = (CheckBox) findViewById(R.id.ceasarBox);
                if (ceasarBox.isChecked()) {
                    price = price + 75;
                }

                CheckBox pastaBox = (CheckBox) findViewById(R.id.pastaBox);
                if (pastaBox.isChecked()) {
                    price = price + 100;
                }

                price = price + lastprice;

                Intent intent = new Intent(drink.this, dessert.class);
                intent.putExtra("PICC", price);
                startActivity(intent);
                finish();
            }
        });
    }
}
