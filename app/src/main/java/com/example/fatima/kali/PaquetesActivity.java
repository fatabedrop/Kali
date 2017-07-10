package com.example.fatima.kali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class PaquetesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paquetes);

        GridLayout premium=(GridLayout)findViewById(R.id.grid1);
        GridLayout basico=(GridLayout)findViewById(R.id.grid2);
        GridLayout gratis=(GridLayout)findViewById(R.id.grid3);

        Button atras=(Button)findViewById(R.id.atras);
        Button siguiente=(Button)findViewById(R.id.siguiente);
        Button ayuda=(Button)findViewById(R.id.ayuda);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaquetesActivity.this, ResumenActivity.class));
            }
        });

    }
}
