package com.algoritimos.senacafuga;

public class Personagem {

	private String nome;
	private String classe;
	private String PontoForte;
	private int forca;
	
	public Personagem() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getPontoForte() {
		return PontoForte;
	}

	public void setPontoForte(String pontoForte) {
		PontoForte = pontoForte;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}	
}
