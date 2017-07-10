package com.example.fatima.kali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_login);

        Button iniciars = (Button)findViewById(R.id.iniciars);
        Button registarse= (Button)findViewById(R.id.registrarse);

        EditText email= (EditText) findViewById(R.id.mail);
        EditText pass=(EditText) findViewById(R.id.password);


    }
}
