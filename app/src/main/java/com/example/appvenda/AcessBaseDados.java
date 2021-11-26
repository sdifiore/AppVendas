package com.example.appvenda;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AcessBaseDados {
    private Conexao conexao;
    private SQLiteDatabase database;
    private Date dateDia = new Date();
    private Calendar calendar;
    private String myString;
    public AcessBaseDados(Context context) {
        conexao = new Conexao(context);
        database = conexao.getWritableDatabase();
        myString = DateFormat.getDateInstance(DateFormat.SHORT).format(dateDia);

    }

    public long insertClient(Cliente cliente){
        ContentValues values = new ContentValues();
        values.put("nome",cliente.getNome());
        values.put("cpf",cliente.getCpf());
        values.put("telefone",cliente.getTelefone());
        values.put("email",cliente.getEmail());
        values.put("endereco",cliente.getEndereco());
        return database.insert("cliente",null,values);
    }
    public List<Cliente> obterCliente(){
        List<Cliente> cliente = new ArrayList<>();
        Cursor cursor = database.query("Cliente",new String[]{"id_cliente","nome", "cpf", "telefone","email", "endereco"}
        ,null,null,null,null,null);
        while(cursor.moveToNext()){
            Cliente auxiliar = new Cliente();
            auxiliar.setId(cursor.getInt(0));
            auxiliar.setNome(cursor.getString(1));
            auxiliar.setCpf(cursor.getString(2));
            auxiliar.setTelefone(cursor.getString(3));
            auxiliar.setEmail(cursor.getString(4));
            auxiliar.setEndereco(cursor.getString(5));
            cliente.add(auxiliar);

        }
        return cliente;
    }

    public boolean atualizarCliente(Cliente cliente){
        ContentValues values = new ContentValues();
        values.put("cpf",cliente.getCpf());
        values.put("telefone",cliente.getTelefone());
        values.put("email",cliente.getEmail());
        values.put("endereco",cliente.getEndereco());
        database.update("Cliente",values,"id_cliente = ?", new String[]{String.valueOf(cliente.getId())});
        return true;
    }

    public long insertProduto(Produtos produtos){
        ContentValues values = new ContentValues();
        values.put("codigo_produto",produtos.getCodigo_produto());
        values.put("descricao",produtos.getDescricao_produto());
        values.put("quantidade",produtos.getQuantidade());
        values.put("preco",produtos.getPreco());
        return database.insert("Produtos",null,values);
    }
    public List<Produtos> obterProduto() {
        List<Produtos> produto = new ArrayList<>();
        Cursor cursor = database.query("Produtos",
                new String[]{"id_produto","codigo_produto", "descricao", "quantidade", "preco"}
                , null, null, null, null, null);
        while (cursor.moveToNext()) {
            Produtos auxiliar = new Produtos();
            auxiliar.setId(cursor.getLong(0));
            auxiliar.setCodigo_produto(cursor.getString(1));
            auxiliar.setDescricao_produto(cursor.getString(2));
            auxiliar.setQuantidade(cursor.getInt(3));
            auxiliar.setPreco(cursor.getFloat(4));
            produto.add(auxiliar);

        }
        return produto;
    }
    public boolean atualizarProdutos(Produtos produto){
        ContentValues values = new ContentValues();
        values.put("quantidade",produto.getQuantidade());
        values.put("preco",produto.getPreco());
        database.update("Produtos",values,"id_produto = ?",new String[]{String.valueOf(produto.getId())});

        return true;
    }
    public boolean excluirProdutos(String id){
        database.delete("Produtos","id_produto = ?",new String[]{String.valueOf(id)});
        return true;
    }




    public long insertPedido(Pedidos pedidos){
        ContentValues values = new ContentValues();
        values.put("codigo_pedido",pedidos.getCodigo_pedido());
        values.put("descricao",pedidos.getDescricao_pedido());
        values.put("quantidade",pedidos.getQuantidade());
        values.put("preco",pedidos.getPreco());
        return database.insert("Pedidos",null,values);
    }
    public List<Pedidos> obterPedido() {
        List<Pedidos> pedido = new ArrayList<>();
        Cursor cursor = database.query("Pedidos",
                new String[]{"id_pedido","codigo_pedido", "descricao", "quantidade", "preco"}
                , null, null, null, null, null);
        while (cursor.moveToNext()) {
            Pedidos auxiliar = new Pedidos();
            auxiliar.setId(cursor.getLong(0));
            auxiliar.setCodigo_pedido(cursor.getString(1));
            auxiliar.setDescricao_pedido(cursor.getString(2));
            auxiliar.setQuantidade(cursor.getInt(3));
            auxiliar.setPreco(cursor.getFloat(4));
            pedido.add(auxiliar);

        }
        return pedido;
    }
    public boolean atualizarPedidos(Pedidos pedido){
        ContentValues values = new ContentValues();
        values.put("quantidade",pedido.getQuantidade());
        values.put("preco",pedido.getPreco());
        database.update("Pedidos",values,"id_pedido = ?",new String[]{String.valueOf(pedido.getId())});

        return true;
    }
    public boolean excluirPedidos(String id){
        database.delete("Pedidos","id_pedido = ?",new String[]{String.valueOf(id)});
        return true;
    }




    public long insertFuncionario(Funcionario funcionario){
        ContentValues values = new ContentValues();
        values.put("nome",funcionario.getNome());
        values.put("telefone",funcionario.getTelefone());
        values.put("email",funcionario.getEmail());
        values.put("cargo",funcionario.getCargo());
        values.put("salario",funcionario.getSalario());
        return database.insert("Funcionario",null,values);

    }
    public List<Funcionario> obterFuncionario() {
        List<Funcionario> funcionario = new ArrayList<>();
        Cursor cursor = database.query("Funcionario",
                new String[]{"id_funcionario","nome","telefone","email","cargo","salario"}
                , null, null, null, null, null);
        while (cursor.moveToNext()) {
            Funcionario auxiliar = new Funcionario();
            auxiliar.setId(cursor.getLong(0));
            auxiliar.setNome(cursor.getString(1));
            auxiliar.setTelefone(cursor.getString(2));
            auxiliar.setEmail(cursor.getString(3));
            auxiliar.setCargo(cursor.getString(4));
            auxiliar.setSalario(cursor.getDouble(5));
            funcionario.add(auxiliar);

        }
        return funcionario;
    }
    public boolean atualizarFuncionario(Funcionario funcionario){
        ContentValues values = new ContentValues();
        values.put("telefone",funcionario.getTelefone());
        values.put("email",funcionario.getEmail());
        values.put("cargo",funcionario.getCargo());
        values.put("salario",funcionario.getSalario());
        database.update("Funcionario",values,"id_funcionario = ?",
                new String[]{String.valueOf(funcionario.getId())});
        return true;
    }



}
