package com.example.appvenda;

import java.io.Serializable;

public class Funcionario extends Cliente implements Serializable {

    private Double salario;
    private String cargo;

    public Funcionario(){

    }

    public Funcionario(long id,String nome,String telefone,String email,String cargo , Double salario){
        this.cargo =cargo;
        this.salario=salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString(){
        return "id: " +getId()+ "\nnome: " +getNome()+ "\nTelefone: " +getTelefone()+
                "\nEmail: " +getEmail()+ "\nCargo: " +getCargo()+ "\nSalario: " +getSalario();
    }
}
