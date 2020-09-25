package com.example.aplicacionencargada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class resultado extends AppCompatActivity {

    TextView TXResultado;
    TextView txtinfrapeso,txtnormal,txtsobrepeso,txtobesidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        txtinfrapeso= (TextView) findViewById(R.id.infrapeso);
        txtnormal= (TextView) findViewById(R.id.normal);
        txtsobrepeso= (TextView) findViewById(R.id.sobrepeso);
        txtobesidad= (TextView) findViewById(R.id.obesidad);

        TXResultado = (TextView) findViewById(R.id.tv_resultado);
        Intent i = getIntent();
        double altura = i.getDoubleExtra("altura",0);
        double peso = i.getDoubleExtra("peso",0);
        double imc = (peso/Math.pow(altura,2));
        TXResultado.setText(String.valueOf(imc));


        if(imc<18.5){
            txtinfrapeso.setBackgroundColor(Color.parseColor("#000000"));
            txtinfrapeso.setTextColor(Color.parseColor("#ffffff"));
        }
        if(imc>=18.5&&imc<25){
            txtnormal.setBackgroundColor(Color.parseColor("#000000"));
            txtnormal.setTextColor(Color.parseColor("#ffffff"));
        }
        if(imc>=25&&imc<30){
            txtsobrepeso.setBackgroundColor(Color.parseColor("#000000"));
            txtsobrepeso.setTextColor(Color.parseColor("#ffffff"));
        }
        if(imc>=30){
            txtobesidad.setBackgroundColor(Color.parseColor("#000000"));
            txtobesidad.setTextColor(Color.parseColor("#ffffff"));
        }



    }

    public void volverOnClick(View v){
        super.onBackPressed();
    }
}