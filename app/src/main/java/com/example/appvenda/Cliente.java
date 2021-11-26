package com.example.appvenda;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Cliente implements Serializable {
    private long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Cliente(){

    }
    public Cliente(long id, String nome, String cpf, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @NonNull
    @Override
    public String toString(){
        return "id: "+id+ ":\nNome: "+nome+ " \nCpf: "+cpf+ " \nTelefone: " +telefone+ " \nEmail: "+email+ " \nEndereco: ";
   }

}
