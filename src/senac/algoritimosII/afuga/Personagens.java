package senac.algoritimosII.afuga;

public class Personagens {

	public static String descricao() {
		String resposta;
		
		resposta = "Descri��o de Classes do jogo \n \r"
				+ "ASSASINO - PEDRO \n" + "PONTOS FORTES: \n" + "Habilidades com faca \n" + "Experi�ncia no Mar \n"
			    + "ILUSIONISTA - THIAGO \n" + "PONTOS FORTES \n" + "M�gico \n \r"
			    + "GUERREIRO - MATHEUS \n" + "PONTOS FORTES: \n" + "Atirador \n" + "Forte Fisicamente \n \r"
			    + "CURANDEIRO - JONAS \n" + "PONTOS FORTES: \n" + "Mestre da Medicina \n" + "Raciocinio R�pido \n \r";

		return resposta;
	}
	
	public static String classe(String personagem) {
		String resposta;

		if (personagem.equals("PEDRO")) {
			resposta = "Boa Escolha você escolheu o Pedro um guerrreiro forte" +
					"Cada personagem possui uma bolsa com itens \n" +
					"Digite \"ver\" para acessar a bolsa ";
			 
		} else if (personagem.equals("MATHEUS")) {
			resposta = "Boa Escolha você escolheu o Matheus um guerrreiro forte" + 
					"Cada personagem possui uma bolsa com itens \n"
					+ "Digite \"ver\" para acessar a bolsa ";
			
		} else if (personagem.equals("THIAGO")) {
			resposta = "Boa Escolha você escolheu o Thiago um guerrreiro forte" +
					"Cada personagem possui uma bolsa com itens \n" + 
					"Digite \"ver\" para acessar a bolsa ";
			
		} else if (personagem.equals("JONAS")) {
			resposta = "Boa Escolha você escolheu o Jonas um guerrreiro forte\n" +
					"Cada personagem possui uma bolsa com itens \n" + 
					"Digite \"ver\" para acessar a bolsa ";
			
		} else {
			resposta = "Opção errada isso vai te complicar no futuro";
		}
		return resposta;
	}
}
