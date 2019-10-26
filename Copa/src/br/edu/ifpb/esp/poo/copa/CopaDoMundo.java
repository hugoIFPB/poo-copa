package br.edu.ifpb.esp.poo.copa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CopaDoMundo implements CopaDoMundoInterface{

	private List<Copa> copas;
	private Set<Selecao> selecoes;
	
	public CopaDoMundo() {
		copas = new ArrayList<Copa>();
		selecoes =new HashSet<Selecao>();
	}
	
	@Override
	public Copa adicionarCopa(String pais, int ano) {
		Copa copa = new Copa();
		copa.setAno(ano);
		copa.setPais(pais);
		copas.add(copa);
		return copa;
	}

	@Override
	public Selecao adicionarSelecao(String pais, String sigla) {
		Selecao s = new Selecao();
		s.setPais(pais);
		s.setSigla(sigla);
		selecoes.add(s);
		return s;
	}

	@Override
	public Jogador adicionarJogador(Selecao selecao, String nome) {
		Jogador j = new Jogador();
		j.setSelecao(selecao);
		j.setNome(nome);
		selecao.addJogador(j);
		return j;
	}

	@Override
	public void participacao(Jogador jogador, Copa copa) {
		copa.getJogadores().add(jogador);
	}

	@Override
	public Jogo adicionarJogo(Copa copa, Calendar data, Selecao time1, Selecao time2) {
		Jogo jogo = new Jogo();
		jogo.setCopa(copa);
		jogo.setData(data);
		jogo.setTime1(time1);
		jogo.setTime2(time2);
		copa.getJogos().add(jogo);
		return jogo;
	}

	@Override
	public Selecao[] listarSelecoes() {
		Selecao[] ss = new Selecao[selecoes.size()];
		return selecoes.toArray(ss);
	}

	@Override
	public Selecao[] listarSelecoes(Copa copa) {
		List<Selecao> selecoes2 = copa.getSelecoes();
		Selecao[] ss = new Selecao[selecoes2.size()];
		return selecoes2.toArray(ss);
	}

}
