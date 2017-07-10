package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

public class HistorialLLamadasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_historialllamadas);


        TextView mensaje1=(TextView)findViewById(R.id.amigo1);
        TextView mensaje2=(TextView)findViewById(R.id.amigo2);
        TextView mensaje3=(TextView)findViewById(R.id.amigo3);
        TextView mensaje4=(TextView)findViewById(R.id.amigo4);
        TextView mensaje5=(TextView)findViewById(R.id.amigo5);
        TextView mensaje6=(TextView)findViewById(R.id.amigo6);
        TextView mensaje7=(TextView)findViewById(R.id.amigo7);
        TextView mensaje8=(TextView)findViewById(R.id.amigo8);
        TextView mensaje9=(TextView)findViewById(R.id.amigo9);
        TextView mensaje10=(TextView)findViewById(R.id.amigo10);


        ImageButton negocio=(ImageButton)findViewById(R.id.miNegocio);
        ImageButton buscar=(ImageButton)findViewById(R.id.buscar);
        ImageButton promos=(ImageButton)findViewById(R.id.promociones);
        ImageButton perf=(ImageButton)findViewById(R.id.perfil);



        negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HistorialLLamadasActivity.this, NegocioActivity.class));
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HistorialLLamadasActivity.this, BuscarActivity.class));

            }
        });

        promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HistorialLLamadasActivity.this, PromocionesActivity.class));

            }
        });

        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HistorialLLamadasActivity.this, PerfilActivity.class));

            }
        });
    }
}
