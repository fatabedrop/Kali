package com.example.fatima.kali;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BienvenidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        Button siguiente=(Button)findViewById(R.id.vamos);
        Button dudas=(Button)findViewById(R.id.dudas);




        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BienvenidoActivity.this, BuscarActivity.class));
            }
        });
    }
}
