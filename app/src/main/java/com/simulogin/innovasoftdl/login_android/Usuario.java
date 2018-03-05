package com.simulogin.innovasoftdl.login_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Usuario extends AppCompatActivity {

    TextView tvNombre,tvUsuario,tvEdad,tvPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        tvNombre = findViewById(R.id.TxtVw_Nombre);
        tvUsuario = findViewById(R.id.TxtVw_Usuario);
        tvEdad = findViewById(R.id.TxtVw_Edad);
        tvPassword = findViewById(R.id.TxtVw_Contraseña);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        int age = intent.getIntExtra("age",-1);


        tvNombre.setText(name);
        tvUsuario.setText(username);
        tvPassword.setText(password);
        tvEdad.setText(age+"");

    }
}
