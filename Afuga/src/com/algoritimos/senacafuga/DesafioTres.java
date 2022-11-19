package com.algoritimos.senacafuga;

import java.util.Scanner;

public class DesafioTres {
	private static String resposta;
	// private static String user = "\\nicolas.cmarques\\Desktop\\";
 private static String user = "\\isabe\\OneDrive\\Documentos\\";
	//private static String user = "\\robso\\workspace\\";
	private static Scanner input = new Scanner(System.in);
	
	public static void desafioTres(String personagem) throws Exception {
		String iniciar;
		
	
		do {

			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\Historia.txt");
			
			iniciar = input.next().toUpperCase();

			switch (iniciar) {
			case "INICIAR":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesInicioDesafio.txt");
				escolha();
				break;

			case "SAIR":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoPular.txt");
				Credito.credito(false);
				break;

			default:
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoInvalida.txt");
				break;
			}
		} while (!iniciar.equals("INICIAR"));
	}
	public static void alojamento() throws Exception {
		String pegar, ir, olhar;

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\OpcaoIrAlojamento.txt");
			ir = input.next().toUpperCase();
			;

			if (ir.equals("IR")) {
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\TextoAlojamento.txt");
			}

		} while (!ir.equals("IR"));

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\OpcaoOlharAlojamento.txt");
			olhar = input.next().toUpperCase();

			if (olhar.equals("OLHAR")) {
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\VisaoAlojamento.txt");	
				
			}

		} while (!olhar.equals("OLHAR"));

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\OpcaoPegarItemAlojamento.txt");	
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConclusãoAlojamento.txt");	
				cozinha();
			}

		} while (!pegar.equals("PEGAR"));
	}

	public static void escolha() throws Exception {
		Scanner input = new Scanner(System.in); 
		String resposta, pegar;
		boolean RespostaCerta = false;

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoIniciar.txt");	

			resposta = input.next().toUpperCase();

			switch (resposta) {
			case "DIREITA":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoUm.txt");	
				RespostaCerta = true;
				break;

			case "ESQUERDA":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoDois.txt");	
				break;

			case "CIMA":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoTres.txt");	
				break;

			case "BAIXO":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoQuatro.txt");	
				break;

			default:
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConvesOpcaoErrada.txt");	
				break;
			}

		} while (!RespostaCerta);

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\OpcaoColetarMadeira.txt");	
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\ConclusaoColeta.txt");	
				alojamento();
			}

		} while (!pegar.equals("PEGAR"));

	}
	
	public static void cozinha() throws Exception{
		String pegar, ir, resposta;
		boolean RespostaCerta = false;

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\OpcaoIrCozinha.txt");	
			ir = input.next().toUpperCase();

			if (ir.equals("IR")) {
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaTexto.txt");	
			}
		} while (!ir.equals("IR"));

		do {

			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaOpcao.txt");	
			resposta = input.next().toUpperCase();

			switch (resposta) {
			case "DIREITA":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaOpcaoUm.txt");
				break;

			case "ESQUERDA":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaOpcaoDois.txt");
				RespostaCerta = true;
				break;

			case "CIMA":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaOpcaoTres.txt");
				break;

			case "BAIXO":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaOpcaoQuatro.txt");
				break;

			default:
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaOpcaoErrada.txt");
				break;
			}
		} while (!RespostaCerta);

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaPegarItem.txt");
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\FinalTexto.txt");
				fim();
			}

		} while (!pegar.equals("PEGAR"));
	}

	public static void fim() throws Exception {

		String ir;

		do {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\CozinhaEscolhaFinal.txt");
			ir = input.next().toUpperCase();

			switch (ir) {
			case "IR":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\FinalOpcaoRetornar.txt");
				break;

			case "SAIR":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\FinalOpcaoPular.txt");
				Credito.credito(false);
				break;

			default:
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioTres\\FinalOpcaoErrada.txt");
				break;
			}
		} while (!ir.equals("IR"));
	}
}
