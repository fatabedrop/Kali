package com.example.fatima.kali;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_agenda);


        TextView favorito1=(TextView)findViewById(R.id.amigo1);
        TextView favorito2=(TextView)findViewById(R.id.amigo2);
        TextView favorito3=(TextView)findViewById(R.id.amigo3);
        TextView favorito4=(TextView)findViewById(R.id.amigo4);
        TextView favorito5=(TextView)findViewById(R.id.amigo5);
        TextView favorito6=(TextView)findViewById(R.id.amigo6);
        TextView favorito7=(TextView)findViewById(R.id.amigo7);
        TextView favorito8=(TextView)findViewById(R.id.amigo8);
        TextView favorito9=(TextView)findViewById(R.id.amigo9);
        TextView favorito10=(TextView)findViewById(R.id.amigo10);

        ImageView f1=(ImageView)findViewById(R.id.pp1);
        ImageView f2=(ImageView)findViewById(R.id.pp2);
        ImageView f3=(ImageView)findViewById(R.id.pp3);
        ImageView f4=(ImageView)findViewById(R.id.pp4);
        ImageView f5=(ImageView)findViewById(R.id.pp5);
        ImageView f6=(ImageView)findViewById(R.id.pp6);
        ImageView f7=(ImageView)findViewById(R.id.pp7);
        ImageView f8=(ImageView)findViewById(R.id.pp8);
        ImageView f9=(ImageView)findViewById(R.id.pp9);
        ImageView f10=(ImageView)findViewById(R.id.pp10);

        ImageButton negocio=(ImageButton)findViewById(R.id.miNegocio);
        ImageButton buscar=(ImageButton)findViewById(R.id.buscar);
        ImageButton promos=(ImageButton)findViewById(R.id.promociones);
        ImageButton perf=(ImageButton)findViewById(R.id.perfil);



        negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgendaActivity.this, NegocioActivity.class));
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgendaActivity.this, BuscarActivity.class));

            }
        });

        promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgendaActivity.this, PromocionesActivity.class));

            }
        });

        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgendaActivity.this, PerfilActivity.class));

            }
        });
    }

}
