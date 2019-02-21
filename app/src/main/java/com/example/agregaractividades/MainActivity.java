package com.example.agregaractividades;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btningresar;
    EditText txtusuario;
    EditText txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btningresar = findViewById(R.id.btningresar);
        txtusuario = findViewById(R.id.txtusuario);
        txtpassword = findViewById(R.id.txtpassword);


        /*new CountDownTimer(10000,2000)
        {
            public void onTick(long milisegundos)
            {

            }

            public void onFinish()
            {
                funcion();
            }


        }.start();*/

        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = txtusuario.getText().toString();
                String password = txtpassword.getText().toString();

                if (usuario.equals("marilu") && password.equals("abc123"))
                {
                    showSecondActivity();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Usuario y/o password incorrectos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void showSecondActivity()
    {
        Intent i = new Intent(this, SecondActivity.class );
        startActivity(i);
        //finish();
    }

}
