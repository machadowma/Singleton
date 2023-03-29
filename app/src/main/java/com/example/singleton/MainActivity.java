package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirTela();
            }
        });

        Usuario u = Usuario.getInstance();
        u.setLogin("jose");
        u.setNome("Jose Silva dos Santos");
        textView.setText("Login: "+u.getLogin()+", Nome: "+u.getNome());
    }

    public void abrirTela(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}