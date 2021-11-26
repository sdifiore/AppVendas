package com.example.appvenda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class Conexao extends SQLiteOpenHelper {
    private static final String name = "Gerenciamento_vendas.db";
    private static final int version = 2;
    public Conexao(Context context) {
        super(context, name,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Cliente(id_cliente INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "nome VARCHAR(50)," +
                "cpf VARCHAR(20)," +
                "telefone VARCHAR(15)," +
                "email VARCHAR(50)," +
                "endereco VARCHAR(100))");
        db.execSQL("CREATE TABLE Produtos(id_produto INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "codigo_produto VARCHAR(20)," +
                "descricao VARCHAR(200)," +
                "quantidade INT," +
                "preco DECIMAL)");
        db.execSQL("CREATE TABLE Pedidos(id_pedido INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "codigo_pedido VARCHAR(20)," +
                "descricao VARCHAR(200)," +
                "quantidade INT," +
                "preco DECIMAL)");
        db.execSQL("CREATE TABLE Funcionario(id_funcionario INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "nome VARCHAR(50)," +
                "telefone VARCHAR(15)," +
                "email VARCHAR(50)," +
                "cargo VARCHAR(50)," +
                "salario DECIMAL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE Cliente");
        db.execSQL("DROP TABLE Funcionario");
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }
}
