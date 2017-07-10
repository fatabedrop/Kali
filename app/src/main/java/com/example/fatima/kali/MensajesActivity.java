package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MensajesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes);

        TextView usuario1=(TextView)findViewById(R.id.amigo1);
        TextView usuario2=(TextView)findViewById(R.id.amigo2);
        TextView usuario3=(TextView)findViewById(R.id.amigo3);
        TextView usuario4=(TextView)findViewById(R.id.amigo4);

        TextView mensajep1=(TextView)findViewById(R.id.mensaje1);
        TextView mensajep2=(TextView)findViewById(R.id.mensaje2);
        TextView mensajep3=(TextView)findViewById(R.id.mensaje3);
        TextView mensajep4=(TextView)findViewById(R.id.mensaje4);

        ImageButton negocio=(ImageButton)findViewById(R.id.miNegocio);
        ImageButton buscar=(ImageButton)findViewById(R.id.buscar);
        ImageButton promos=(ImageButton)findViewById(R.id.promociones);
        ImageButton perf=(ImageButton)findViewById(R.id.perfil);



        negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MensajesActivity.this, NegocioActivity.class));
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MensajesActivity.this, BuscarActivity.class));

            }
        });

        promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MensajesActivity.this, PromocionesActivity.class));

            }
        });

        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MensajesActivity.this, PerfilActivity.class));

            }
        });
    }
}
