import java.util.Scanner;

public class Personagens {

	public static String classe(String personagem) {
		String resposta = "";

		if (personagem.equals("PEDRO")) {
			resposta = "Boa Escolha você escolheu o Pedro um guerrreiro forte" +
					"Cada personagem possui uma bolsa com itens \n" +
					"Digite \"ver\" para acessar a bolsa ";
			 
		} else if (personagem.equals("MATHEUS")) {
			resposta = "Boa Escolha \n";
			
		} else if (personagem.equals("THIAGO")) {
			resposta = "Boa Escolha \n";
			
		} else if (personagem.equals("JONAS")) {
			resposta = "Boa Escolha \n";
			
		} else {
			resposta = "Opção errada isso vai te complicar no futuro";
		}
		return resposta;
	}
}
