package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaClienteActivity extends AppCompatActivity implements AdapterView.OnItemClickListener , Serializable {

    private ListView listView;
    private AcessBaseDados database;
    private List<Cliente> cliente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cliente);
        listView = findViewById(R.id.list_view_clientes);
        database = new AcessBaseDados(this);
        cliente = database.obterCliente();
        ArrayAdapter<Cliente> adapter = new ArrayAdapter<Cliente>(this, android.R.layout.simple_list_item_1, cliente);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,AtualizarClienteActivity.class);
        intent.putExtra("cliente",(Cliente)parent.getItemAtPosition(position));
        startActivity(intent);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}