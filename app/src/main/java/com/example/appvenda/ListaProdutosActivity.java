package com.example.appvenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private AcessBaseDados database;
    private List<Produtos> produto;
   // private List<Produtos> produtoFilter = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_produto);
        listView = findViewById(R.id.list_view_produtos);
        database = new AcessBaseDados(this);
        produto = database.obterProduto();
        //produtoFilter.addAll(produto);
        ArrayAdapter<Produtos> adapter = new ArrayAdapter<Produtos>(getApplicationContext(),android.R.layout.simple_list_item_1,produto);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,AtualizarProdutosActivity.class);
        intent.putExtra("produto",(Produtos)parent.getItemAtPosition(position));
        startActivity(intent);


        }
}


