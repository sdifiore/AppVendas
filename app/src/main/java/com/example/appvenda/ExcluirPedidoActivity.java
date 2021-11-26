package com.example.appvenda;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExcluirPedidoActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private EditText id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excluir_pedido);
        database = new AcessBaseDados(this);
        id = findViewById(R.id.id_cod_pedido_exclude);

    }
    public void excluirPedido(View view){

        if(id.getText().toString().equals("")){
            Toast.makeText(this,"Preencha todos os dados!",Toast.LENGTH_LONG).show();

        }else {
            database.excluirPedidos(id.getText().toString());
            Toast.makeText(this, "Pedido excluido com Sucesso!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,PedidosActivity.class);
            startActivity(intent);
        }

    }
}
