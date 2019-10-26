package br.edu.ifpb.esp.poo.copa;

import java.util.LinkedList;
import java.util.List;

public class Selecao {

	private Integer id;
	private String pais;
	private String sigla;
	private List<Jogador> jogadores;

	public Selecao() {
		jogadores = new LinkedList<Jogador>();
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
