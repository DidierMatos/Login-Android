package com.simulogin.innovasoftdl.login_android;

import android.support.v7.app.AppCompatActivity;
import com.simulogin.innovasoftdl.login_android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    EditText etnombre, etusuario, etpassword, etedad;
    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etnombre = findViewById(R.id.edtxt_nombre);
        etusuario = findViewById(R.id.edtxt_usuario);
        etpassword = findViewById(R.id.edtxt_contraseña);
        etedad = findViewById(R.id.edtxt_edad);

        btn_registrar = findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}