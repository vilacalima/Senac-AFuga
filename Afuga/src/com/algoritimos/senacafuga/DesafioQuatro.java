package com.algoritimos.senacafuga;

import java.util.Scanner;

public class DesafioQuatro {

	private static Scanner input = new Scanner(System.in);
	
	public static void historiaDesafioQuatro(String personagem) throws Exception {
		Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\historia.txt");
		String opcao = input.next().toUpperCase();
		primeiraParte(opcao, personagem);
	}
	
	public static void primeiraParte(String opcao, String personagem) throws Exception {
		
			String subir;
			if(opcao.equals("CORRER")) {
				Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\primeiraParteCorrer.txt");
				subir = input.next().toUpperCase();
				if(subir.equals("SUBIR")) {
					segundaParte(subir, personagem);
				}
			} else if(opcao.equals("FICAR")) {
				Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\primeiraParteFicar.txt");
				verBolsa(personagem);
				segundaParte("FICAR", personagem);
			}
	}
	
	public static void segundaParte(String opcao, String personagem) throws Exception {
		
		if(opcao.equals("SUBIR")) {
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\segundaParteCorrer.txt");
			
			terceiraParteVerBolsa("CORRER", "SUBIR");

		} else if (opcao.equals("FICAR")) {
			terceiraParteVerBolsa(opcao, null);
			
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\segundaParteFicar2.txt");
			String ultimaFase = input.next().toUpperCase();
			retaFinal(ultimaFase, personagem);
		}
	}

	public static void terceiraParteVerBolsa(String opcao, String ver) throws Exception {
		
		if (opcao.equals("CORRER") && ver.equals("SUBIR")) {
			
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\terceiraParteVerBolsaCorrer.txt");
			Credito.credito(false);
			
		} else if(opcao.equals("FICAR") || ver.equals("VER")){
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\terceiraParteverBolsaFicar.txt");
		}
	}
	
	public static void retaFinal(String opcao, String persoangem) throws Exception {

		switch (opcao) {
		case "COMBATE":
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\retaFinalCombate.txt");
			segundaParte("SUBIR", persoangem);
			break;

		case "CONFIAR":
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\retaFinalConfiar.txt");
			Credito.credito(true);
			break;		
		}
	}
	
	public static void verBolsa(String personagem) throws Exception {
		String ver;
		
		Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioQuatro\\verBolsa.txt");
		ver = input.next().toUpperCase();
		
			if(ver.equals("VER")) {
				Bolsa.bolsa(personagem, ver, null);
			}else {
				System.out.println("Opcao errada, tente novamente");
			}
	}
}

