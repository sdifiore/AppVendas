package com.example.appvenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AtualizarProdutosActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private EditText quantidade,preco;
    private Produtos produto;
    private TextView dados_atuais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atualizar_produto);

        database = new AcessBaseDados(this);
        dados_atuais = findViewById(R.id.ed_dados_atuais);
        quantidade = findViewById(R.id.ed_quantidade);
        preco = findViewById(R.id.ed_preco);
        produto = (Produtos)getIntent().getSerializableExtra("produto");
        dados_atuais.setText(produto.toString()+"\n");
    }
    public void atualizaProduto(View view){

        if(quantidade.getText().toString().equals("") || preco.getText().toString().equals("")) {
            Toast.makeText(this,"ERROR preencha todos os campos",Toast.LENGTH_LONG).show();
        }else {
            produto.setQuantidade(Integer.parseInt(quantidade.getText().toString()));
            produto.setPreco(Float.parseFloat(preco.getText().toString()));
            database.atualizarProdutos(produto);
            Toast.makeText(this,"Atualizado com sucesso",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,ListaProdutosActivity.class);
            startActivity(intent);
        }
    }
}
