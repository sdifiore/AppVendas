package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

    }
    public void cadastroCliente(View view){
        Intent intent = new Intent(this,CadastroClienteActivity.class);
        startActivity(intent);
    }
    public void listarCliente(View view){
        Intent intent = new Intent(this,ListaClienteActivity.class);
        startActivity(intent);
    }


}