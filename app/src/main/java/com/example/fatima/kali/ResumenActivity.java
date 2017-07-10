package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ResumenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);


        TextView nombre =(TextView)findViewById(R.id.nombre);
        TextView empresa =(TextView)findViewById(R.id.nombreempresa);
        TextView telefono =(TextView)findViewById(R.id.telefono);
        TextView mail =(TextView)findViewById(R.id.mail);
        TextView horario =(TextView)findViewById(R.id.horario);
        TextView categoria =(TextView)findViewById(R.id.categoria);
        TextView palabrasclave =(TextView)findViewById(R.id.palabrasclave);
        TextView descripcion =(TextView)findViewById(R.id.descripcion);
        TextView domicilio =(TextView)findViewById(R.id.domiciliofijo);

        ImageView imagen=(ImageView)findViewById(R.id.imageView1);

        Button atras=(Button)findViewById(R.id.atras);
        Button siguiente=(Button)findViewById(R.id.siguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResumenActivity.this, UbicacionUsuarioBActivity.class));
            }
        });
    }
}
