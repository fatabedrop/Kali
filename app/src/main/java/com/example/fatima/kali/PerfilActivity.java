package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_perfil2);

        ImageButton negocio=(ImageButton)findViewById(R.id.miNegocio);
        ImageButton buscar=(ImageButton)findViewById(R.id.buscar);
        ImageButton promos=(ImageButton)findViewById(R.id.promociones);
        ImageButton perf=(ImageButton)findViewById(R.id.perfil);



        negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, NegocioActivity.class));
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, BuscarActivity.class));

            }
        });

        promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, PromocionesActivity.class));

            }
        });

        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, PerfilActivity.class));

            }
        });
    }
}
