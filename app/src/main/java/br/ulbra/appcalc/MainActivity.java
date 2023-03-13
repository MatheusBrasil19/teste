package br.ulbra.appcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edtValor1, edtValor2;
    Button btnSomar;
    Button btnSubtrair;
    Button btnMultiplicar;
    Button btnDivisao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor1 = findViewById(R.id.edtV1);
        edtValor2 = findViewById(R.id.edtV2);
        btnSomar = findViewById(R.id.btnsomar);
        btnSubtrair = findViewById(R.id.btnsubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDivisao = findViewById(R.id.btndivisao);


        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, soma;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                soma = valor1 + valor2;
                Toast.makeText(MainActivity.this, "a soma dos valores é: " + soma,
                        Toast.LENGTH_LONG).show();
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, subtrair;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                subtrair = valor1 - valor2;
                Toast.makeText(MainActivity.this, "a soma dos valores é: " + subtrair,
                        Toast.LENGTH_LONG).show();
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, Multiplicar;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                Multiplicar = valor1 * valor2;
                Toast.makeText(MainActivity.this, "a soma dos valores é: " + Multiplicar,
                        Toast.LENGTH_LONG).show();
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, divisao;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                divisao = valor1 / valor2;
                Toast.makeText(MainActivity.this, "a soma dos valores é: " + divisao,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
