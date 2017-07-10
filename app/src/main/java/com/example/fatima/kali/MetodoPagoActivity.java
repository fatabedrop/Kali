package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MetodoPagoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodopago);

        EditText nombre =(EditText)findViewById(R.id.nombre);
        EditText numtarjeta =(EditText)findViewById(R.id.numtarjeta);
        EditText numsecreto =(EditText)findViewById(R.id.numsecreto);
        EditText mes =(EditText)findViewById(R.id.mvencimiento);
        EditText year =(EditText)findViewById(R.id.avencimeinto);

        Button ver=(Button)findViewById(R.id.ver);
        Button aceptar=(Button)findViewById(R.id.aceptar);
        Button atras=(Button)findViewById(R.id.atras);
        Button siguiente=(Button)findViewById(R.id.siguiente);
        Button ayuda=(Button)findViewById(R.id.ayuda);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetodoPagoActivity.this, BienvenidoActivity.class));
            }
        });
    }
}
