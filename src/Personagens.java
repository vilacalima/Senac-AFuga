
public class Personagens {

	public static String descricao() {
		String resposta;
		
		resposta = "Descrição de Classes do jogo \n \r"
				+ "ASSASINO - PEDRO \n" + "PONTOS FORTES: \n" + "Habilidades com faca \n" + "Experiência no Mar \n"
			    + "ILUSIONISTA - THIAGO \n" + "PONTOS FORTES \n" + "Mágico \n \r"
			    + "GUERREIRO - MATHEUS \n" + "PONTOS FORTES: \n" + "Atirador \n" + "Forte Fisicamente \n \r"
			    + "CURANDEIRO - JONAS \n" + "PONTOS FORTES: \n" + "Mestre da Medicina \n" + "Raciocinio Rápido \n \r";

		return resposta;
	}
	
	public static String classe(String personagem) {
		String resposta;

		if (personagem.equals("PEDRO")) {
			resposta = "Boa Escolha vocÃª escolheu o Pedro um guerrreiro forte" +
					"Cada personagem possui uma bolsa com itens \n" +
					"Digite \"ver\" para acessar a bolsa ";
			 
		} else if (personagem.equals("MATHEUS")) {
			resposta = "Boa Escolha \n";
			
		} else if (personagem.equals("THIAGO")) {
			resposta = "Boa Escolha \n";
			
		} else if (personagem.equals("JONAS")) {
			resposta = "Boa Escolha \n";
			
		} else {
			resposta = "OpÃ§Ã£o errada isso vai te complicar no futuro";
		}
		return resposta;
	}
}
