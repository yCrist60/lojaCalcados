package br.com.lojacalcados.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class Conexao {
	//A classe connection no permiter estabelecer 
	//a conexao com o banco de dados
	public Connection cx = null;
	
	//Nos ajudar a executar as consulta sql, tais como
	//Insert, Update, Delete, Select
	public PreparedStatement pst = null;
	
	//Guarda os resultados das consultas Select
	public ResultSet rs = null;
	
	public boolean abrirBanco() {
		boolean rs = true;
		try {
			/*
			 * Para carregar o Drive de comunica��o do java
			 * com o banco de dados mysql, utilizamos o 
			 * comando Class.forName que ser� respons�vel
			 * por "subir" o drive do mysql.
			 * ao final da linha temos o comando newInstance
			 * que reliza a instancia do drive de comunica��o
			 * gerando um objeto de execu��o
			 * */
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			//Ao carregar a conexao com o banco de dados ser�
			//necess�rio passar alguns dados ao drive, tais como
			//usuario,senha e nome do banco de dados
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/calcadosdb","root","");
		}
		catch(ClassNotFoundException cnf) {
			System.out.println("Erro ao estabelecer a conex�o com o banco -> "+cnf.getMessage());
			rs = false;
		}
		catch(Exception e) {
			System.out.println("Erro inesperado -> "+e.getMessage());
			rs = false;
		}
		return rs;
	}
	
	public boolean fecharBanco() {
		boolean rs = true;
		try {
			cx.close();//tentar fechar o banco de dados
		}
		catch(Exception e) {
			System.out.println("Erro ao tentar fechar o banco -> "+e.getMessage());
			rs = false;
		}
		return rs;
	}
	
	
	
	
}
