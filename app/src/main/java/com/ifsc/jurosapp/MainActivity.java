package com.ifsc.jurosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edValorEmprestimo, edTaxaJuros, edPeriodo;
    TextView tvJuros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edValorEmprestimo = findViewById(R.id.edValorEmprestimo);
        edTaxaJuros = findViewById(R.id.edTaxaJuros);
        edPeriodo = findViewById(R.id.edPeriodo);

        tvJuros = findViewById(R.id.tvJuros);
    }

    public void calculaJuros(View v) {
        Double valor = Double.parseDouble(edValorEmprestimo.getText().toString());
        Double taxa = Double.parseDouble(edTaxaJuros.getText().toString());
        Double periodo = Double.parseDouble(edPeriodo.getText().toString());

        Double juros = valor * (taxa/100) * periodo;

        tvJuros.setText(String.format("%.2f", juros));
    }
}