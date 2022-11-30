package com.algoritimos.senacafuga;
import java.util.Scanner;

public class DesafioDois {

	private static Scanner input = new Scanner(System.in);
        
	/**
	 * @param personagem
	 * @throws Exception
	 */
	public static void desafioDois(String personagem) throws Exception {
		String opcoes;
		int num = 0;
		boolean menu = false;
		
		do {
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\PrimeiraparteIntroducao1.txt");
			Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\PrimeiraParteOpcoes2.txt");
			opcoes = input.next().toUpperCase();
                         
			switch (opcoes) {
			case "DICA":
                      
		      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\OpcaoDica4.txt");
				num = input.nextInt();    
				break;
                                
			case "NAO":
		      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\OpcaoNao5.txt");
				num = input.nextInt();
				break;

			case "AJUDA":
		      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\OpcaoAjuda3.txt");
                      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\OpcaoAjudapartedois.txt");
                      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\OpcaoAjudapartetres.txt");

				num = input.nextInt();
				break;
			}

			switch (num) {
			case 133:
		      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\RespostaCase1.txt");
				menu = true;
				acertou(personagem);
				break;
			default:
		      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\RespostaCase2.txt");				
                      break;
                      
			}

		} while (!menu);
	}
	
	public static void acertou(String personagem) throws Exception {
		String ver = "";
		String desatar = "";

		do {

             Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\SegundaparteIntroducao6.txt");					
            
		     Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\SegundaParteVer7.txt");
		     ver = input.next().toUpperCase();
		     if (ver.equals("VER")) { 
		      Bolsa.bolsa(personagem, ver, null);
			}
		} while (ver.equals("null"));
		 
		do {
		      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\SegundaparteDesatar8.txt");	
			desatar = input.next().toUpperCase();
			if (desatar.equals("DESATAR")) {
		      Arquivo.lerArquivo("Afuga\\src\\falas\\DesafioDois\\Terceiraparte9.txt");			
                        }

		} while (!desatar.equals("DESATAR"));               
	}
}
