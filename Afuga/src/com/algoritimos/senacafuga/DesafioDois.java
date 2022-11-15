package com.algoritimos.senacafuga;
import java.util.Scanner;

public class DesafioDois {

	private static Scanner input = new Scanner(System.in);
	public static void desafioDois(String personagem) {
		String opcoes;
		int num = 0;
		boolean menu = false;
                
		do {
			opcoes = input.next().toUpperCase();
                         
			switch (opcoes) {
			case "DICA":
                      String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\OpcaoDica4.txt");

                            
				num = input.nextInt();    
				break;
                                
			case "NAO":
		      String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\OpcaoNao5.txt");
				num = input.nextInt();
				break;

			case "AJUDA":
		      String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\OpcaoAjuda3.txt");
                      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\OpcaoAjudapartedois.txt");
                      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\OpcaoAjudapartetres.txt");

				num = input.nextInt();
				break;
			}

			switch (num) {
			case 133:
		      String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\RespostaCase1.txt");
				menu = true;
				acertou(personagem);
				break;
			default:
                      String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\RespostaCase2.txt");				
                      break;
                      
			}

		} while (!menu);
	}
	
	public static void acertou(String personagem) {
		String ver, desatar;

		do {

                      String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\SegundaparteIntroducao6.txt");					+ "Para desatar esse n�, pegue o canivete que est� na sua mochila e corte o n�. \n");
			ver = input.next().toUpperCase();
                        
                       
			if (ver.equals("VER")) {
				Bolsa.bolsa(personagem, ver, null);
		     String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\SegundaparteVer7.txt");					+ "Para desatar esse n�, pegue o canivete que est� na sua mochila e corte o n�. \n");
			}
		} while (ver.equals("null"));
		 
		do {
		      String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\SegundaparteDesatar8.txt");	
			desatar = input.next().toUpperCase();
			if (desatar.equals("DESATAR")) {
                       String userAcer = "\\acer\\Documentos\\";
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Documents\DesafioDois\Terceiraparte9.txt");			
                        }

		} while (!desatar.equals("DESATAR"));               
	}
}
