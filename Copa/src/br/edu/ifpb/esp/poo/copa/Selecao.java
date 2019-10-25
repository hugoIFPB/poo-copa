package br.edu.ifpb.esp.poo.copa;

import java.util.List;

public class Selecao {

	private Integer id;
	private String pais;
	private String sigla;
	private List<Jogador> jogadores;
	
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
