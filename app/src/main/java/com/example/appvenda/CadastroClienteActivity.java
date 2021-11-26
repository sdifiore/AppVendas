package com.example.appvenda;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CadastroClienteActivity extends AppCompatActivity {
    private EditText nome;
    private EditText cpf;
    private EditText telefone;
    private EditText email;
    private EditText endereco;
    private AcessBaseDados acessBaseDados;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_cliente);

        nome = findViewById(R.id.id_cliente_name);
        cpf = findViewById(R.id.id_cliente_cpf);
        telefone = findViewById(R.id.id_cliente_telefone);
        email = findViewById(R.id.id_cliente_email);
        endereco = findViewById(R.id.id_cliente_endereco);
        acessBaseDados = new AcessBaseDados(this);
    }
    public void salvarCliente(View view){
        Cliente cliente = new Cliente();
        if(nome.getText().toString().equals("")
                |cpf.getText().toString().equals("")
                |telefone.getText().toString().equals("")
                |email.getText().toString().equals("")
                |endereco.getText().toString().equals("")) {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
        }else {
            cliente.setNome(nome.getText().toString());
            cliente.setCpf(cpf.getText().toString());
            cliente.setTelefone(telefone.getText().toString());
            cliente.setEmail(email.getText().toString());
            cliente.setEndereco(endereco.getText().toString());
            long id = acessBaseDados.insertClient(cliente);
            Toast.makeText(this, "Cliente cadastrado com sucesso: " + cliente.getNome(), Toast.LENGTH_LONG).show();
            nome.setText("");
            cpf.setText("");
            telefone.setText("");
            email.setText("");
            endereco.setText("");
        }
    }

}
