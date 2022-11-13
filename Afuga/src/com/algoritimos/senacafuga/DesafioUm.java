package com.algoritimos.senacafuga;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DesafioUm {



	
	private static String resposta = null;
	private static Scanner input = new Scanner(System.in);
	
	/**
	 * @throws Exception
	 */
	public static void parteUm() throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		String opcao = input.next().toUpperCase();
		
		do {
			String userIsabela = "\\isabe\\OneDrive\\Documentos\\";
			Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto0.txt");

			opcao = input.next().toUpperCase();

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
		String userIsabela = "\\isabe\\OneDrive\\Documentos\\";
		Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto1.txt");

		Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto2.txt");


		do {

			Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto3.txt");
			opcao = input.next().toUpperCase();

			switch (opcao) {
			case "CURAR":
			Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto4.txt");
				do {

					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto5.txt");
					opcao = input.next().toUpperCase();

					switch (opcao) {
					case "SIM":

					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto6.txt");

						break;
					case "PEGAR":
					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto7.txt");
						break;
					default:
					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto8.txt");
						break;
					}
				} while (!opcao.equals("PEGAR"));
				break;

			case "PEGAR":
			Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto9.txt");
				Bolsa.bolsa(personagem, "ADICIONAR", "\n Pe de cabra");
				

				do {
					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto10.txt");
					opcao = input.next().toUpperCase();

					switch (opcao) {
					case "SIM":
						tentativa = tentativa + 1;
						Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto11.txt");

						break;
					case "PEGAR":
					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto12.txt");
						break;
					default:
					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto13.txt");
						break;
					}
				} while (!opcao.equals("PEGAR") && (tentativa < 3));

				if (!opcao.equals("PEGAR")) {
					Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto14.txt");

					Credito.credito(false);
				}

				break;
			default:
			Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto15.txt");
				break;
			}
		} while ((!"CURAR".equals(opcao)) && (!"PEGAR".equals(opcao)));
		
	}
	
	/**
	 * @throws Exception
	 * 
	 */
	public static void parteTres() throws Exception {
		
		Scanner input = new Scanner(System.in);
		String opcao = "";
		final String userIsabela = "\\isabe\\OneDrive\\Documentos\\";
		do {
			
			Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto16.txt");
			opcao = input.next().toUpperCase();
		} while (!"IR".equals(opcao));

		Arquivo.lerArquivo("C:\\Users" + userIsabela + "Senac-AFuga\\Afuga\\src\\falas\\Desafio1\\texto17.txt");
	}
	
	
	
	
	
	
}
