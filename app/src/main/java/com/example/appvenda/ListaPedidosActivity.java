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

public class ListaPedidosActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private AcessBaseDados database;
    private List<Pedidos> pedido;
    // private List<Pedidos> pedidoFilter = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pedido);
        listView = findViewById(R.id.list_view_pedidos);
        database = new AcessBaseDados(this);
        pedido = database.obterPedido();
        //pedidoFilter.addAll(pedido);
        ArrayAdapter<Pedidos> adapter = new ArrayAdapter<Pedidos>(getApplicationContext(),android.R.layout.simple_list_item_1,pedido);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,AtualizarPedidosActivity.class);
        intent.putExtra("pedido",(Pedidos)parent.getItemAtPosition(position));
        startActivity(intent);


    }
}

