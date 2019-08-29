package com.example.mykalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnClear, btnTambah, btnKali, btnBagi, btnDouble, btnJumlah,btnKurang;
    Button btnAngka1, btnAngka2, btnAngka3, btnAngka4, btnAngka5, btnAngka6, btnAngka7, btnAngka8, btnAngka9, btnAngka0;
    EditText outputHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analisasi();



    }



    private void analisasi() {

        outputHasil = (EditText) findViewById(R.id.outputHasil);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnDouble = (Button) findViewById(R.id.btnDouble);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnJumlah = (Button) findViewById(R.id.btnJumlah);


        btnAngka0 = (Button) findViewById(R.id.angka0);
        btnAngka1 = (Button) findViewById(R.id.angka1);
        btnAngka2 = (Button) findViewById(R.id.angka2);
        btnAngka3 = (Button) findViewById(R.id.angka3);
        btnAngka4 = (Button) findViewById(R.id.angka4);
        btnAngka5 = (Button) findViewById(R.id.angka5);
        btnAngka6 = (Button) findViewById(R.id.angka6);
        btnAngka7 = (Button) findViewById(R.id.angka7);
        btnAngka8 = (Button) findViewById(R.id.angka8);
        btnAngka9 = (Button) findViewById(R.id.angka9);

        btnClear.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnDouble.setOnClickListener(this);
        btnJumlah.setOnClickListener(this);

        btnAngka0.setOnClickListener(this);
        btnAngka1.setOnClickListener(this);
        btnAngka2.setOnClickListener(this);
        btnAngka3.setOnClickListener(this);
        btnAngka4.setOnClickListener(this);
        btnAngka5.setOnClickListener(this);
        btnAngka6.setOnClickListener(this);
        btnAngka7.setOnClickListener(this);
        btnAngka8.setOnClickListener(this);
        btnAngka9.setOnClickListener(this);



    }

    float nilai1,nilai2;
    boolean tambah,kurang,kali,bagi;

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.angka0:
                outputHasil.setText(outputHasil.getText().toString().trim()+"0");
                break;
            case R.id.angka1:
                outputHasil.setText(outputHasil.getText().toString().trim()+"1");
                break;
            case R.id.angka2:
                outputHasil.setText(outputHasil.getText().toString().trim()+"2");
                break;
            case R.id.angka3:
                outputHasil.setText(outputHasil.getText().toString().trim()+"3");
                break;
            case R.id.angka4:
                outputHasil.setText(outputHasil.getText().toString().trim()+"4");
                break;
            case R.id.angka5:
                outputHasil.setText(outputHasil.getText().toString().trim()+"5");
                break;
            case R.id.angka6:
                outputHasil.setText(outputHasil.getText().toString().trim()+"6");
                break;
            case R.id.angka7:
                outputHasil.setText(outputHasil.getText().toString().trim()+"7");
                break;
            case R.id.angka8:
                outputHasil.setText(outputHasil.getText().toString().trim()+"8");
                break;
            case R.id.angka9:
                outputHasil.setText(outputHasil.getText().toString().trim()+"9");
                break;
            case R.id.btnDouble:
                outputHasil.setText(outputHasil.getText().toString().trim()+".");
                break;
            case R.id.btnTambah:
                nilai1 = Float.parseFloat(outputHasil.getText().toString());
                tambah = true;
                outputHasil.setText(null);
                break;
            case R.id.btnKurang:
                nilai1 = Float.parseFloat(outputHasil.getText().toString());
                kurang = true;
                outputHasil.setText(null);
                break;
            case R.id.btnBagi:
                nilai1 = Float.parseFloat(outputHasil.getText().toString());
                bagi = true;
                outputHasil.setText(null);
                break;
            case R.id.btnKali:
                nilai1 = Float.parseFloat(outputHasil.getText().toString());
                kali = true;
                outputHasil.setText(null);
                break;
            case R.id.btnClear:
                outputHasil.setText(null);
                break;
            case R.id.btnJumlah:

                nilai2 = Float.parseFloat(outputHasil.getText().toString().trim());

                if (tambah == true){
                    outputHasil.setText(nilai1 + nilai2 + "");
                    tambah = false;
                }if (kurang == true){
                    outputHasil.setText(nilai1 - nilai2 + "");
                    kurang = false;
                }if (bagi == true){
                    outputHasil.setText(nilai1 / nilai2 + "");
                    bagi = false;
            }if (kali == true){
                    outputHasil.setText(nilai1 * nilai2 + "");
                    kali = false;
            }
                break;


        }

    }
}




