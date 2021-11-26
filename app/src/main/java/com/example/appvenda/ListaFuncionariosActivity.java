package com.example.appvenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class ListaFuncionariosActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private AcessBaseDados database;
    private List<Funcionario> funcionarios;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_funcionarios);
        listView = findViewById(R.id.list_view_funcionarios);
        database = new AcessBaseDados(this);
        funcionarios = database.obterFuncionario();
        ArrayAdapter<Funcionario> adapter = new ArrayAdapter<Funcionario>(this, android.R.layout.simple_list_item_1, funcionarios);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(this,AtualizarFuncionarioActivity.class);
        intent.putExtra("funcionario",(Funcionario)parent.getItemAtPosition(position));
        startActivity(intent);

    }
}