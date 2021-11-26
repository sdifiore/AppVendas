package com.example.appvenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AtualizarPedidosActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private EditText quantidade,preco;
    private Pedidos pedido;
    private TextView dados_atuais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atualizar_pedido);

        database = new AcessBaseDados(this);
        dados_atuais = findViewById(R.id.ed_dados_atuais);
        quantidade = findViewById(R.id.ed_quantidade);
        preco = findViewById(R.id.ed_preco);
        pedido = (Pedidos)getIntent().getSerializableExtra("pedido");
        dados_atuais.setText(pedido.toString()+"\n");
    }
    public void atualizaPedido(View view){

        if(quantidade.getText().toString().equals("") || preco.getText().toString().equals("")) {
            Toast.makeText(this,"ERROR preencha todos os campos",Toast.LENGTH_LONG).show();
        }else {
            pedido.setQuantidade(Integer.parseInt(quantidade.getText().toString()));
            pedido.setPreco(Float.parseFloat(preco.getText().toString()));
            database.atualizarPedidos(pedido);
            Toast.makeText(this,"Pedido atualizado com sucesso",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,ListaPedidosActivity.class);
            startActivity(intent);
        }
    }
}
