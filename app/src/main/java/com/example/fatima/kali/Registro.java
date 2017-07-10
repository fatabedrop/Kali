package com.example.fatima.kali;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button siguiente= (Button) findViewById(R.id.siguiente);
        RadioButton busco=(RadioButton)findViewById(R.id.busco);
        RadioButton ofrezco=(RadioButton)findViewById(R.id.ofrezco);
        RadioButton vendedor=(RadioButton)findViewById(R.id.vendedor);

        final Boolean auxB=busco.isSelected();
        final Boolean auxO=ofrezco.isSelected();
        final Boolean auxV=vendedor.isSelected();

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(auxB==true){
                    startActivity(new Intent(Registro.this, RegistroA.class));
                }
                else
                    if(auxO==true){
                        startActivity(new Intent(Registro.this, RegistroB.class));
                    }
                    else
                        startActivity(new Intent(Registro.this, RegistroB.class));


            }
        });
    }
}
