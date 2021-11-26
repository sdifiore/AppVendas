package com.example.appvenda;

import java.io.Serializable;

public class Pedidos implements Serializable {
    private long id;
    private String codigo_pedido;
    private String descricao_pedido;
    private int quantidade;
    private float preco;

    public Pedidos() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getDescricao_pedido() {
        return descricao_pedido;
    }

    public void setDescricao_pedido(String descricao_pedido) {
        this.descricao_pedido = descricao_pedido;
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
        return "id: "+id+ "\nCodigo: "+codigo_pedido + "\nDescricao: "+ descricao_pedido + "\nQuantidade: " + quantidade + "\nPreco: " + preco;
    }
}