package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class RegistroB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrob);

        EditText nombre =(EditText)findViewById(R.id.nombre);
        EditText empresa =(EditText)findViewById(R.id.nombreempresa);
        EditText telefono =(EditText)findViewById(R.id.telefono);
        EditText mail =(EditText)findViewById(R.id.mail);
        EditText horario =(EditText)findViewById(R.id.horario);
        EditText categoria =(EditText)findViewById(R.id.categoria);
        EditText palabrasclave =(EditText)findViewById(R.id.palabrasclave);
        EditText descripcion =(EditText)findViewById(R.id.descripcion);
        EditText domicilio =(EditText)findViewById(R.id.domiciliofijo);

        ImageButton imagenempresa=(ImageButton)findViewById(R.id.fotonegocio);
        Button atras=(Button)findViewById(R.id.atras);
        Button siguiente=(Button)findViewById(R.id.siguiente);


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistroB.this, UbicacionUsuarioBActivity.class));
            }
        });

    }
}
