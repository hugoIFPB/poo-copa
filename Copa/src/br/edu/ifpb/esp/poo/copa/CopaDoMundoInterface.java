package br.edu.ifpb.esp.poo.copa;

import java.util.Calendar;

public interface CopaDoMundoInterface {

		Copa adicionarCopa(String pais, int ano);
		
		Selecao adicionarSelecao(String pais, String sigla);
		
		Jogador adicionarJogador(Selecao selecao, String nome);
		
		void participacao(Jogador jogador, Copa copa);
		
		Jogo adicionarJogo(Copa copa, Calendar data, Selecao time1, Selecao time2);
		
		Selecao[] listarSelecoes();
		
		Selecao[] listarSelecoes(Copa copa);
		
	}
