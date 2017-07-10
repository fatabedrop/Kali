package com.example.fatima.kali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegistroA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrousuarioa);


        Button regis=(Button)findViewById(R.id.regis);
        EditText nombre=(EditText)findViewById(R.id.nombre);
        EditText apellido=(EditText)findViewById(R.id.apellido);
        EditText mail=(EditText)findViewById(R.id.mail);
        EditText password=(EditText)findViewById(R.id.password);

        TextView errortxt=(TextView)findViewById(R.id.errortxt);

        
    }
}
