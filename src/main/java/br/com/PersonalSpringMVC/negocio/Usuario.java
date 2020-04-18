package br.com.PersonalSpringMVC.negocio;

import java.util.ArrayList;


public class Usuario extends Contato {

	
	private Integer id;
	private String nome;
	private String login;
	private String senha;
	private Contato contato;
	private boolean masculino;
	private ArrayList<Exercicio> exercicios;
	
	
	public Usuario() {
	}
	public Usuario(String nome, String login, String senha) {
		this();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}	
	public Usuario(Integer id, String nome, String login, String senha) {
		this(nome, login, senha);
		this.id = id;
	}	
	public Usuario(Integer id, String nome, String login, String senha, Contato contato) {
		this(id, nome, login, senha);
		this.contato = contato;
	}	
	@Override
	public String toString() {
		return String.format("%d - %s - %s - %s", 
					this.getId(),
					this.getNome(),
					this.getLogin(),
					this.getSenha()
				);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
}