package com.algoritimos.senacafuga;

public class DesafioQuatro {
	private static String resposta;
	public static String primeiraParte(String personagem, String opcao) {
				
		do {
			switch (opcao) {
			case "CORRER":
				resposta = "Giovanni você é muito lento, se ficarmos iremos morrer ! \n"
						+ "Eu não posso te esperar mais, boa sorte.. \n";
				break;
			case "FICAR":
				resposta = "E agora Giovanni? Se ficarmos iremos perder \n"
						+ "Giovanni: Não se preocupe porque eu tenho um plano, vou subir no mastro "
						+ "e enquanto você luta aqui em baixo eu te cubro lá de cima";
				break;
			default:
				resposta = "Opção errada";
			}
		} while (!opcao.equals("CORRER") || !opcao.equals("FICAR"));
		return resposta;
	}
	
	public static String segundaParte(String opcao) {
		
		if (opcao.equals("CORRER")) {
			resposta = "Digite \"Subir\" para subir na jangada e ir para o mar \n\r"
						+ "Não foi uma boa escolha sair do navio sem Giovanni agora você não tem quem cubra "
						+ "a sua retaguarda e acabou de ser atingido /n/r" 
						+ "E agora o que voc� ir� fazer ?";

		} else if (opcao.equals("FICAR")) {
			resposta = "Olhe a sua bolsa e pegue algo para sua defesa";
		}
		
		return resposta;
	}

	public static void terceiraParteVerBolsa(String opcao, String ver) {
		if (opcao.equals("CORRER") || ver.equals("VER")) {
			resposta = "Enquanto voc� pegava a sua ferramenta um dos tripulantes conseguiu alcan�ar a nado e interceptou a sua jangada e te matou..";
			Credito.credito(false);
		} else if(opcao.equals("FICAR") || ver.equals("VER")){
			resposta = "Você escolheu um ótimo item de defesa, vamos lá";
		}
	}
	
	
	
	public static String terceiraParteFicar() {
		
		resposta = "Tem dois oponentes vindo até você"
				+ "Você tem duas opções"
				+ "Digite \"Combate\" para entrar em combate com dois oponentes mesmo com Giovanni no apoio"
				+ "Digite \"Confiar\" para confiar em Giovanni e lutar apenas contra um oponente";
		
		return resposta;
	}

	public static String retaFinal(String opcao) {

		switch (opcao) {
		case "COMBATE":
			resposta = "Você não confiou em Giovanni"
					+ "E entrou foi atingido por um dos oponentes"
					+ "Giovanni por sua vez conseguiu atingir fatalmente os oponentes, porém não confia mais em você";
			segundaParte("CORRER");
			break;

		case "CONFIAR":
			resposta = "Você confiou em Giovanni! \n\r"
					+ "E Giovanni conseguiu interceptar um dos oponentes";

			break;
		}
		
		return resposta;
	}
}
