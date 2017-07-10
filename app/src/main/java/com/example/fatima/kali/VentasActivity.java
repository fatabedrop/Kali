package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

public class VentasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ventas);

        TextView venta1=(TextView)findViewById(R.id.venta1);
        TextView venta2=(TextView)findViewById(R.id.venta2);
        TextView venta3=(TextView)findViewById(R.id.venta3);
        TextView venta4=(TextView)findViewById(R.id.venta4);
        TextView venta5=(TextView)findViewById(R.id.venta5);
        TextView venta6=(TextView)findViewById(R.id.venta6);
        TextView venta7=(TextView)findViewById(R.id.venta7);
        TextView venta8=(TextView)findViewById(R.id.venta8);
        TextView venta9=(TextView)findViewById(R.id.venta9);
        TextView venta10=(TextView)findViewById(R.id.venta10);

        ImageButton negocio=(ImageButton)findViewById(R.id.miNegocio);
        ImageButton buscar=(ImageButton)findViewById(R.id.buscar);
        ImageButton promos=(ImageButton)findViewById(R.id.promociones);
        ImageButton perf=(ImageButton)findViewById(R.id.perfil);



        negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VentasActivity.this, NegocioActivity.class));
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VentasActivity.this, BuscarActivity.class));

            }
        });

        promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VentasActivity.this, PromocionesActivity.class));

            }
        });

        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VentasActivity.this, PerfilActivity.class));

            }
        });
    }
}
