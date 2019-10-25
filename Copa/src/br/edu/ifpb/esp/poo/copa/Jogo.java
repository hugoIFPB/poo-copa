package br.edu.ifpb.esp.poo.copa;

import java.util.Calendar;

public class Jogo {

	private Integer id;
	private Calendar data;
	private Copa copa;
	private Selecao time1;
	private Selecao time2;
	private Integer golsTime1;
	private Integer golsTime2;
	
	
	
	public Selecao getTime1() {
		return time1;
	}

	public void setTime1(Selecao time1) {
		this.time1 = time1;
	}

	public Selecao getTime2() {
		return time2;
	}

	public void setTime2(Selecao time2) {
		this.time2 = time2;
	}

	public Integer getGolsTime1() {
		return golsTime1;
	}

	public void setGolsTime1(Integer golsTime1) {
		this.golsTime1 = golsTime1;
	}

	public Integer getGolsTime2() {
		return golsTime2;
	}

	public void setGolsTime2(Integer golsTime2) {
		this.golsTime2 = golsTime2;
	}

	public Copa getCopa() {
		return copa;
	}
	
	public void setCopa(Copa copa) {
		this.copa = copa;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
}
