package com.algoritimos.senacafuga;

public class Personagem {

	private String nome;
	private String classe;
	private String pontoForte;
	private int forca;
	
	public Personagem() {
		
	}
	
	public Personagem(String nome, String classe, String pontoForte, int forca) {
		this.nome = nome;
		this.classe = classe;
		this.pontoForte = pontoForte;
		this.forca = forca;
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
		return pontoForte;
	}

	public void setPontoForte(String pontoForte) {
		this.pontoForte = pontoForte;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}	
}
