package com.example.appvenda;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExcluirProdutoActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private EditText id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excluir_produto);
        database = new AcessBaseDados(this);
        id = findViewById(R.id.id_cod_product_exclude);

    }
    public void excluirProduto(View view){

        if(id.getText().toString().equals("")){
            Toast.makeText(this,"Preencha todos os dados!",Toast.LENGTH_LONG).show();

        }else {
            database.excluirProdutos(id.getText().toString());
            Toast.makeText(this, "Produto excluido com Sucesso!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,ProdutosActivity.class);
            startActivity(intent);
        }

    }
}
