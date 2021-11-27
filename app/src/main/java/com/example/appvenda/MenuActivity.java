package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void products(View view) {
        Intent intent = new Intent(this, ProdutosActivity.class);
        startActivity(intent);
    }

    public void funcionarios(View view) {
        Intent intent = new Intent(this, FuncionariosActivity.class);
        startActivity(intent);
    }

    public void clientes(View view) {
        Intent intent = new Intent(this, ClienteActivity.class);
        startActivity(intent);
    }

    public void pedidos(View view) {
        Intent intent = new Intent(this, PedidosActivity.class);
        startActivity(intent);
    }

    public void updateDatabase(View view) {
        Intent intent = new Intent(this, UpdateDatabaseActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, ClienteLoginActivity.class);
        startActivity(intent);
    }


}
