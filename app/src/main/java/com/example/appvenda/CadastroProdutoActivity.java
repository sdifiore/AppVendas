package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class CadastroProdutoActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private EditText codigo;
    private EditText descricao;
    private EditText quantidade;
    private EditText preco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produto);
        codigo = findViewById(R.id.id_cod_product);
        descricao = findViewById(R.id.id_descricao_product);
        quantidade = findViewById(R.id.id_quantidade_product);
        preco = findViewById(R.id.id_preco_product);
        database = new AcessBaseDados(this);
    }
    public void salvarProduto(View view){
        if(codigo.getText().toString().equals("")
                |descricao.getText().toString().equals("")
                |quantidade.getText().toString().equals("")
                |preco.getText().toString().equals("")) {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
        }else {
            Produtos produto = new Produtos();
            produto.setCodigo_produto(codigo.getText().toString());
            produto.setDescricao_produto(descricao.getText().toString());
            produto.setQuantidade(Integer.parseInt(quantidade.getText().toString()));
            produto.setPreco(Float.parseFloat(preco.getText().toString()));
            long id = database.insertProduto(produto);
            Toast.makeText(this, "Produto cadastrado com sucesso!", Toast.LENGTH_LONG).show();
        }

    }
}
