package com.example.fatima.kali;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.view.Window;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;

public class BuscarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_buscar);

        Button servicio1=(Button)findViewById(R.id.s1);
        Button servicio2=(Button)findViewById(R.id.s2);
        Button servicio3=(Button)findViewById(R.id.s3);
        Button servicio4=(Button)findViewById(R.id.s4);
        Button servicio5=(Button)findViewById(R.id.s5);
        Button servicio6=(Button)findViewById(R.id.s6);
        Button servicio7=(Button)findViewById(R.id.s7);
        Button servicio8=(Button)findViewById(R.id.s8);
        Button servicio9=(Button)findViewById(R.id.s9);
        Button servicio10=(Button)findViewById(R.id.s10);

        AutoCompleteTextView buscador =(AutoCompleteTextView) findViewById(R.id.busqueda);

        ImageButton negocio=(ImageButton)findViewById(R.id.miNegocio);
        ImageButton buscar=(ImageButton)findViewById(R.id.buscar);
        ImageButton promos=(ImageButton)findViewById(R.id.promociones);
        ImageButton perf=(ImageButton)findViewById(R.id.perfil);



        negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuscarActivity.this, NegocioActivity.class));
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuscarActivity.this, BuscarActivity.class));

            }
        });

        promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuscarActivity.this, PromocionesActivity.class));

            }
        });

        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuscarActivity.this, PerfilActivity.class));

            }
        });


    }
}
