package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

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


}
