package com.example.appvenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AtualizarClienteActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private TextView dados_atuais;
    private Cliente cliente;
    private EditText cpf;
    private EditText telefone;
    private EditText email;
    private EditText endereco;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atualizar_cliente);
        database = new AcessBaseDados(this);
        cliente = (Cliente)getIntent().getSerializableExtra("cliente");
        dados_atuais =findViewById(R.id.id_cliente);
        dados_atuais.setText(cliente.toString());
        cpf = findViewById(R.id.id_cliente_cpf_atualiza);
        telefone = findViewById(R.id.id_cliente_telefone_atualiza);
        email = findViewById(R.id.id_cliente_email_atualiza);
        endereco = findViewById(R.id.id_cliente_email_atualiza);


    }
    public void atualiza_Cliente(View view){
        cliente.setCpf(cpf.getText().toString());
        cliente.setTelefone(telefone.getText().toString());
        cliente.setEmail(email.getText().toString());
        cliente.setEndereco(endereco.getText().toString());

        if(cliente.getCpf().equals("") || cliente.getTelefone().equals("") || cliente.getEmail().equals("") || cliente.getEndereco().equals("")) {
            Toast.makeText(this,"Preencha todos os campos",Toast.LENGTH_LONG).show();
        }else{
            database.atualizarCliente(cliente);
            Toast.makeText(this,"Atualizado com sucesso",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ListaClienteActivity.class);
            startActivity(intent);

        }
    }


}
