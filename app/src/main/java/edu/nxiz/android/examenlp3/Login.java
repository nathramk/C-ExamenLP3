package edu.nxiz.android.examenlp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText txtUser;
    EditText txtPass;
    String user;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtUser = (EditText)findViewById(R.id.txtUser);
        txtPass = (EditText)findViewById(R.id.txtPass);

        Button btnIngresar = (Button)findViewById(R.id.btnIngresar);




        btnIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                user = txtUser.getText().toString();
                password = txtPass.getText().toString();
                if (user.equals("admin")&& password.equals("123456")){
                    Intent i=new Intent(Login.this, APP.class);
                    startActivity(i);

                }else{

                    Toast.makeText(getApplicationContext(), "Se olvido el usuario o la contraseña", Toast.LENGTH_SHORT).show();

                }

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void introClave(View view){
        Intent j=new Intent(this, Error.class);
        startActivity(j);
    }


}
