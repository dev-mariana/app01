package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Objetos correspondentes as views do xml
    EditText etPrato;
    Button btPedido;
    TextView tvPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculando objetos java com as views do xml
        etPrato = findViewById(R.id.etPrato);
        btPedido = findViewById(R.id.btPedido);
        tvPedido = findViewById(R.id.tvPedido);
    }

    //Capturar o texto de etPrato e inserir em tvPedido
    public void exibirPedido(View view) {
        String prato = etPrato.getText().toString();
        tvPedido.setText("Seu pedido: " + prato);
    }
}