package com.algoritimos.senacafuga;
import java.util.Scanner;

public class DesafioDois {

	private static Scanner input = new Scanner(System.in);
        private static String userAcer = "\\acer\\Desktop\\";
	public static void desafioDois(String personagem) throws Exception {
		String opcoes;
		int num = 0;
		boolean menu = false;
                
		do {
			opcoes = input.next().toUpperCase();
                         
			switch (opcoes) {
			case "DICA":
                      
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\OpcaoDica4.txt");
				num = input.nextInt();    
				break;
                                
			case "NAO":
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\OpcaoNao5.txt");
				num = input.nextInt();
				break;

			case "AJUDA":
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\OpcaoAjuda3.txt");
                      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\OpcaoAjudapartedois.txt");
                      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\OpcaoAjudapartetres.txt");

				num = input.nextInt();
				break;
			}

			switch (num) {
			case 133:
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\RespostaCase1.txt");
				menu = true;
				acertou(personagem);
				break;
			default:
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\RespostaCase2.txt");				
                      break;
                      
			}

		} while (!menu);
	}
	
	public static void acertou(String personagem) throws Exception {
		String ver = null, desatar;

		do {

                    Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\SegundaparteIntroducao6.txt");					
                        
                       
			if (ver.equals("VER")) {
				Bolsa.bolsa(personagem, ver, null);
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\SegundaParteVer7.txt");					
			}
		} while (ver.equals("null"));
		 
		do {
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\SegundaparteDesatar8.txt");	
			desatar = input.next().toUpperCase();
			if (desatar.equals("DESATAR")) {
		      Arquivo.lerArquivo("C:\\Users" + userAcer + "Senac-AFuga\\Afuga\\src\\falas\\DesafioDois\\Terceiraparte9.txt");			
                        }

		} while (!desatar.equals("DESATAR"));               
	}
}
