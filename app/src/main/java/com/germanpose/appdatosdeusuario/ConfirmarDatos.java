package com.germanpose.appdatosdeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmarDatos extends AppCompatActivity {

    TextView tvnombre;
    TextView tvfecha;
    TextView tvtelefono;
    TextView tvemail;
    TextView tvdescripcion;

    String nombre;
    String fecha;
    String telefono;
    String email;
    String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = this.getIntent().getExtras();
        nombre = parametros.getString(getResources().getString(R.string.parametro_nombre));
        fecha = parametros.getString(getResources().getString(R.string.parametro_fecha));
        telefono = parametros.getString(getResources().getString(R.string.parametro_telefono));
        email = parametros.getString(getResources().getString(R.string.parametro_email));
        descripcion = parametros.getString(getResources().getString(R.string.parametro_descripcion));

        tvnombre = findViewById(R.id.tvNombre);
        tvfecha = findViewById(R.id.tv_Fecha_Nacimiento);
        tvtelefono = findViewById(R.id.tv_Tel);
        tvemail = findViewById(R.id.tv_Email);
        tvdescripcion = findViewById(R.id.tv_Descripcion);

        tvnombre.setText(nombre);
        tvfecha.setText(fecha);
        tvtelefono.setText(telefono);
        tvemail.setText(email);
        tvdescripcion.setText(descripcion);


    }


    public void ClickBoton(View view) {
        onBackPressed();
        finish();
    }
}