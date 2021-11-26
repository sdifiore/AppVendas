package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProdutosActivity extends AppCompatActivity {
    private Produtos produto;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
    }
    public void cadastrarProdutos(View view) {
        Intent intents = new Intent(this, CadastroProdutoActivity.class);
        startActivity(intents);
    }
    public void atualizaProduto(View view) {
        Intent intents = new Intent(this, AtualizarProdutosActivity.class);
        startActivity(intents);
    }
    public void excluirProdutos(View view){
        Intent intent = new Intent(this,ExcluirProdutoActivity.class);
        startActivity(intent);
    }
    public void listarProdutos(View view){
        Intent intent = new Intent(this,ListaProdutosActivity.class);
        startActivity(intent);
    }
}