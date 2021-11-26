package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PedidosActivity extends AppCompatActivity {
    private Pedidos pedido;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
    }
    public void cadastrarPedidos(View view) {
        Intent intents = new Intent(this, CadastroPedidoActivity.class);
        startActivity(intents);
    }
    public void atualizaPedido(View view) {
        Intent intents = new Intent(this, AtualizarPedidosActivity.class);
        startActivity(intents);
    }
    public void excluirPedido(View view){
        Intent intent = new Intent(this,ExcluirPedidoActivity.class);
        startActivity(intent);
    }
    public void listarPedidos(View view){
        Intent intent = new Intent(this,ListaPedidosActivity.class);
        startActivity(intent);
    }
}
