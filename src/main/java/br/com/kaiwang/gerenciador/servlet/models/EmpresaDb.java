package br.com.kaiwang.gerenciador.servlet.models;

import java.util.Locale;

public class EmpresaDb {
	private String nome;
	private int id;
	private static int DBID;
	
	public EmpresaDb(String nome) {
		this.setNome(nome);
		this.setId(DBID);
		DBID ++;
	}
	public String getNome() {
		return this.nome;
	}
	public int getId() {
		return this.id;
	}
	public void setNome(String valor) {
		this.nome = valor;
	}
	public void setId(int value) {
		this.id = value;
	}
	
	@Override
	public String toString() {
		return String.format(new Locale("pt", "BR"), "{ ID: %d, nome: %s}", this.id, this.nome);
	}
	
}
