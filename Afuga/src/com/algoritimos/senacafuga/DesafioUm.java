package com.algoritimos.senacafuga;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DesafioUm {



	
	private static String resposta = null;
	private static Scanner input = new Scanner(System.in);
// private static String user = "\\isabe\\OneDrive\\Documentos\\";
//	private static String user = "\\robso\\workspace\\";
	 private static String user = "\\robson.vlima3\\workspace\\";
	
	/**
	 * @throws Exception
	 */
	public static void parteUm(String personagem) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		String opcao = null;
		
		do {
			
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto1.txt");

			opcao = input.next().toUpperCase();
			parteDois(personagem);

		}

		while (!opcao.equals("OLHAR"));
		
	}
	
	/**
	 * @param personagem
	 * @throws Exception
	 */
	public static void parteDois(String personagem) throws Exception {
		
		Scanner input = new Scanner(System.in);
		String opcao = "";
		int tentativa = 0;
//		Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto1.txt");

		Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto2.txt");


		do {

			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto3.txt");
			opcao = input.next().toUpperCase();

			switch (opcao) {
			case "CURAR":
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto4.txt");
				do {

					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto5.txt");
					opcao = input.next().toUpperCase();

					switch (opcao) {
					case "SIM":

					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto6.txt");

						break;
					case "PEGAR":
					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto7.txt");
						break;
					default:
					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto8.txt");
						break;
					}
				} while (!opcao.equals("PEGAR"));
				break;

			case "PEGAR":
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto9.txt");
				Bolsa.bolsa(personagem, "ADICIONAR", "\n Pe de cabra");
				

				do {
					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto10.txt");
					opcao = input.next().toUpperCase();

					switch (opcao) {
					case "SIM":
						tentativa = tentativa + 1;
						Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto11.txt");

						break;
					case "PEGAR":
					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto12.txt");
						break;
					default:
					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto13.txt");
						break;
					}
				} while (!opcao.equals("PEGAR") && (tentativa < 3));

				if (!opcao.equals("PEGAR")) {
					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto14.txt");

					Credito.credito(false);
				}

				break;
			default:
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto15.txt");
				break;
			}
		} while ((!"CURAR".equals(opcao)) && (!"PEGAR".equals(opcao)));
		parteTres();
	}
	
	/**
	 * @throws Exception
	 * 
	 */
	public static void parteTres() throws Exception {
		
		Scanner input = new Scanner(System.in);
		String opcao = "";
		do {
			
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto16.txt");
			opcao = input.next().toUpperCase();
		} while (!"IR".equals(opcao));

		Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto17.txt");
	}
	
	
	
	
	
	
}
