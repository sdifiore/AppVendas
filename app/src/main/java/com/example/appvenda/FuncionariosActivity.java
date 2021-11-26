package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FuncionariosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionarios);
    }
    public void listaFuncionario(View view){
        Intent intent = new Intent(this,ListaFuncionariosActivity.class);
        startActivity(intent);
    }
    public void cadastraFuncionario(View view){
        Intent intent = new Intent(this,CadastroFuncionarioActivity.class);
        startActivity(intent);
    }
}