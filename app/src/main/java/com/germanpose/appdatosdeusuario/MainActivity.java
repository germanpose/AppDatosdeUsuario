package com.germanpose.appdatosdeusuario;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    String nombre;
    String telefono;
    String email;
    String descripcion;
    String fecha;

    TextInputEditText edit_nombre;
    TextInputEditText edit_tel;
    TextInputEditText edit_email;
    TextInputEditText edit_descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "on Create", Toast.LENGTH_LONG).show();

        edit_nombre = findViewById(R.id.EditText_Nombre);
        edit_tel = findViewById(R.id.EditText_Telefono);
        edit_email = findViewById(R.id.EditText_Email);
        edit_descripcion = findViewById(R.id.EditText_Descripcion);



    }

    public void getFecha(){

        DatePicker calendario = findViewById(R.id.DatePicker);
        fecha = String.valueOf(calendario.getDayOfMonth()) + "/" +
                String.valueOf(((calendario.getMonth()) + 1)+ "/" +
                        String.valueOf(calendario.getYear()));
    }




    public void getDatos() {

        nombre = edit_nombre.getText().toString();
        telefono = edit_tel.getText().toString();
        email = edit_email.getText().toString();
        descripcion = edit_descripcion.getText().toString();

    }


    public void touch_boton(View view) {

        getFecha();
        getDatos();

        Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
        intent.putExtra(getResources().getString(R.string.parametro_nombre), nombre);
        intent.putExtra(getResources().getString(R.string.parametro_fecha), fecha);
        intent.putExtra(getResources().getString(R.string.parametro_telefono), telefono);
        intent.putExtra(getResources().getString(R.string.parametro_email), email);
        intent.putExtra(getResources().getString(R.string.parametro_descripcion), descripcion);
        startActivity(intent);

    }


}