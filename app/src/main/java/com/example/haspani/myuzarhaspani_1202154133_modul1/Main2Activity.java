package com.example.haspani.myuzarhaspani_1202154133_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;
;



public class Main2Activity extends AppCompatActivity {
    int uangSaku = 65000;
    int biaya, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView makanan2 = (TextView) findViewById(R.id.Makanan2);
        TextView porsi2 = (TextView) findViewById(R.id.Porsi2);
        TextView lokasi = (TextView) findViewById(R.id.lokasi);
        TextView harga = (TextView) findViewById(R.id.Harga1);
// receive
        Intent i = getIntent();


        String makanan = i.getStringExtra("makanan");
        String Lokasi = i.getStringExtra("tempat");
        String porsi = i.getStringExtra("porsi");

        makanan2.setText(makanan);
        porsi2.setText(porsi);
        lokasi.setText(Lokasi);

        switch (Lokasi) {
            case "EATBUS":
                biaya = 50000;
                break;
            case "ABNORMAL":
                biaya = 30000;
                break;
        }
        total = parseInt(porsi) * biaya;
        String hargaTotal = Integer.toString(total);
        if (uangSaku < total) {
            harga.setText(hargaTotal);
            Toast.makeText(this, "Jangan disini makan malam2nya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        } else {
            harga.setText(hargaTotal);
            Toast.makeText(this, "Disini Aja makan malamnya", Toast.LENGTH_SHORT).show();
        }
    }
}