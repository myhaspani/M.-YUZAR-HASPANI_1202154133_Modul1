package com.example.haspani.myuzarhaspani_1202154133_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Deklarasi variabel;

        Button abnormal, eatbus;
        EditText makanan, porsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get by ID
                abnormal = (Button)findViewById(R.id.abnormal);
                eatbus = (Button)findViewById(R.id.eatbus);
                makanan = (EditText) findViewById(R.id.Makanan1);
                porsi = (EditText)findViewById(R.id.Porsi1);

        //Abnormal Button
                abnormal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent move = new Intent(MainActivity.this,Main2Activity.class);
                        String tempat = abnormal.getText().toString();
                        move.putExtra("makanan", makanan.getText().toString());
                        move.putExtra("tempat", tempat);
                        move.putExtra("porsi", porsi.getText().toString());
                        startActivity(move);
                    }
                });
        // Eatbus Button
        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this,Main2Activity.class);
                String tempat = eatbus.getText().toString();
                move.putExtra("makanan", makanan.getText().toString());
                move.putExtra("tempat", tempat);
                move.putExtra("porsi", porsi.getText().toString());
                startActivity(move);
            }
        });
    }
}
