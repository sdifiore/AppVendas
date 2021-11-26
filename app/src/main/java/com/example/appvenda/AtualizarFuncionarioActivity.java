package com.example.appvenda;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AtualizarFuncionarioActivity extends AppCompatActivity {
    private AcessBaseDados database;
    private Funcionario funcionario;
    private EditText telefone,email,cargo,salario;
    private TextView dados_atuais;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atualizar_funcionario);
        database = new AcessBaseDados(this);
        funcionario = (Funcionario)getIntent().getSerializableExtra("funcionario");
        dados_atuais = findViewById(R.id.ed_dados_atuais);
        dados_atuais.setText(funcionario.toString()+"\n");
        telefone = findViewById(R.id.ed_telefone_funcionario);
        email = findViewById(R.id.ed_email_funcionario);
        cargo = findViewById(R.id.ed_cargo);
        salario = findViewById(R.id.ed_salario);
        telefone.setText(funcionario.getTelefone());
        email.setText(funcionario.getEmail());
        cargo.setText(funcionario.getCargo());
        salario.setText(String.valueOf(funcionario.getSalario()));

    }
    public void atualizaFuncionario(View view){

        funcionario.setTelefone(telefone.getText().toString());
        funcionario.setEmail(email.getText().toString());
        funcionario.setCargo(cargo.getText().toString());
        funcionario.setSalario(Double.parseDouble(salario.getText().toString()));

        database.atualizarFuncionario(funcionario);
        Toast.makeText(this,"Dados atualizados com sucesso",Toast.LENGTH_LONG).show();

    }
}
