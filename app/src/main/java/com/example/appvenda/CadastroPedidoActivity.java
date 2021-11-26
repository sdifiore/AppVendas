package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class CadastroPedidoActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private EditText codigo;
    private EditText descricao;
    private EditText quantidade;
    private EditText preco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);
        codigo = findViewById(R.id.id_cod_pedido);
        descricao = findViewById(R.id.id_descricao_pedido);
        quantidade = findViewById(R.id.id_quantidade_pedido);
        preco = findViewById(R.id.id_preco_pedido);
        database = new AcessBaseDados(this);
    }
    public void salvarPedido(View view){
        if(codigo.getText().toString().equals("")
                |descricao.getText().toString().equals("")
                |quantidade.getText().toString().equals("")
                |preco.getText().toString().equals("")) {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
        }else {
            Pedidos pedido = new Pedidos();
            pedido.setCodigo_pedido(codigo.getText().toString());
            pedido.setDescricao_pedido(descricao.getText().toString());
            pedido.setQuantidade(Integer.parseInt(quantidade.getText().toString()));
            pedido.setPreco(Float.parseFloat(preco.getText().toString()));
            long id = database.insertPedido(pedido);
            Toast.makeText(this, "Pedido cadastrado com sucesso!", Toast.LENGTH_LONG).show();
        }

    }
}
