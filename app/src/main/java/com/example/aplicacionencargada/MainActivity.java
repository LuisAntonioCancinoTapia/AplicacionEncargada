package com.example.aplicacionencargada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText ET_Peso,ET_Altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_Peso =(EditText) findViewById(R.id.txt_peso);
        ET_Altura =(EditText) findViewById(R.id.txt_altura);
    }

    public void CalcularOnClick(View v){
        try {
            double peso = Double.parseDouble(ET_Peso.getText().toString());
            double altura = Double.parseDouble(ET_Altura.getText().toString());

            Intent i = new Intent(this, resultado.class);
            i.putExtra("peso",peso);
            i.putExtra("altura",altura);
            startActivity(i);

        }catch (Exception e){
            Toast.makeText(this, "Error en el ingreso de datos",Toast.LENGTH_SHORT).show();
        }
    }


}