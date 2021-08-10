package com.example.project1a_aldyardiansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText TextNama;
    TextView Hasil;
    Button btnTampilkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama = (EditText) findViewById(R.id.et_inputnama);
        Hasil = (TextView) findViewById(R.id.tv_tampilnama);
        btnTampilkan = (findViewById(R.id.btn_tampil));
        btnTampilkan.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View view) {
        Hasil.setText("Nama Anda: " + TextNama.getText());
    }
}