package com.example.appvenda;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroFuncionarioActivity  extends AppCompatActivity {
    private AcessBaseDados database;
    private EditText nome , telefone, email ,cargo ,salario;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_funcionario);
        database = new AcessBaseDados(this);
        nome = findViewById(R.id.ed_nome_funcionario);
        telefone = findViewById(R.id.ed_telefone_funcionario);
        email = findViewById(R.id.ed_email_funcionario);
        cargo = findViewById(R.id.ed_cargo);
        salario = findViewById(R.id.ed_salario);

    }
    public void salvarFuncionario(View view){
        Funcionario funcionario = new Funcionario();
        if(nome.getText().toString().equals("")
                 |telefone.getText().toString().equals("")
                 |email.getText().toString().equals("")
                 |cargo.getText().toString().equals("")
                 | salario.getText().toString().equals("")){
            Toast.makeText(this,"Preencha todos os campos",Toast.LENGTH_LONG).show();
        }else {
            funcionario.setNome(nome.getText().toString());
            funcionario.setTelefone(telefone.getText().toString());
            funcionario.setEmail(email.getText().toString());
            funcionario.setCargo(cargo.getText().toString());
            funcionario.setSalario(Double.parseDouble(salario.getText().toString()));
            long id = database.insertFuncionario(funcionario);
            Toast.makeText(this, "Funcionário cadastrado com sucesso!", Toast.LENGTH_LONG).show();
        }

    }
}
