package com.example.appvenda;

import java.io.Serializable;

public class Produtos implements Serializable {
    private long id;
    private String codigo_produto;
    private String descricao_produto;
    private int quantidade;
    private float preco;

    public Produtos() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(String codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return "id: "+id+ "\nCodigo: "+codigo_produto + "\nDescricao: "+ descricao_produto + "\nQuantidade: " + quantidade + "\nPreco: " + preco;
    }
}
