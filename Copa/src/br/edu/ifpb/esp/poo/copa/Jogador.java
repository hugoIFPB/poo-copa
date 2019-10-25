package br.edu.ifpb.esp.poo.copa;

import java.util.Calendar;

public class Jogador {
	
	private Integer id;
	private String nome;
	private Calendar nascimento;
	private Selecao selecao;
	
	public Selecao getSelecao() {
		return selecao;
	}
	
	public void setSelecao(Selecao selecao) {
		this.selecao = selecao;
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
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
}
