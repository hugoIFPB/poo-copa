package br.edu.ifpb.esp.poo.copa;

import java.util.List;

public class Copa {

	public static final String ORGANIZADOR = "FIFA";
	
	private Integer id;
	private Integer ano;
	private String pais;
	private List<Jogador> jogadores;
	private List<Jogo> jogos;
	private List<Selecao> selecoes;
	
	public List<Selecao> getSelecoes() {
		return selecoes;
	}
	
	public void setSelecoes(List<Selecao> selecoes) {
		this.selecoes = selecoes;
	}
	
	public List<Jogo> getJogos() {
		return jogos;
	}
	
	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
