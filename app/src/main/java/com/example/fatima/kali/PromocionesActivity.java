package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;

public class PromocionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);

        Button promocion1=(Button)findViewById(R.id.s1);
        Button promocion2=(Button)findViewById(R.id.s2);
        Button promocion3=(Button)findViewById(R.id.s3);
        Button promocion4=(Button)findViewById(R.id.s4);
        Button promocion5=(Button)findViewById(R.id.s5);
        Button promocion6=(Button)findViewById(R.id.s6);
        Button promocion7=(Button)findViewById(R.id.s7);
        Button promocion8=(Button)findViewById(R.id.s8);
        Button promocion9=(Button)findViewById(R.id.s9);
        Button promocion10=(Button)findViewById(R.id.s10);

        AutoCompleteTextView buscador =(AutoCompleteTextView) findViewById(R.id.busqueda);

        ImageButton negocio=(ImageButton)findViewById(R.id.miNegocio);
        ImageButton buscar=(ImageButton)findViewById(R.id.buscar);
        ImageButton promos=(ImageButton)findViewById(R.id.promociones);
        ImageButton perf=(ImageButton)findViewById(R.id.perfil);



        negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PromocionesActivity.this, NegocioActivity.class));
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PromocionesActivity.this, BuscarActivity.class));

            }
        });

        promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PromocionesActivity.this, PromocionesActivity.class));

            }
        });

        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PromocionesActivity.this, PerfilActivity.class));

            }
        });

    }
}
