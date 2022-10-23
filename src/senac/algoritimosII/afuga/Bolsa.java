package senac.algoritimosII.afuga;
import java.util.ArrayList;
import java.util.List;

public class Bolsa {

	public static List<String> bolsa(String personagem, String adicionar, String obj) {

		List<String> bolsa = new ArrayList<String>();
		bolsa.add("\n Canivete");
		bolsa.add("\n Sinalizador");
		bolsa.add("\n Lanterna");
		bolsa.add("\n Kit Primeiros Socorros");

		if (adicionar.equals("VER") && personagem.equals("PEDRO")) {
			bolsa.add("\n Espada");
		} else if (adicionar.equals("VER") && personagem.equals("THIAGO")) {
			bolsa.add("\n Livro");
		} else if (adicionar.equals("VER") && personagem.equals("MATHEUS")) {
			bolsa.add("\n Arma de Fogo");
		} else if (adicionar.equals("VER") && personagem.equals("JONAS")) {
			bolsa.add("\n Tranquilizante");
		}
		
		if (adicionar.equals("ADICIONAR"))
			bolsa.add(obj);
		
		return bolsa;
	}
	
	/*
	 * public static void armamento(String acao, String personagem) {
	 * if(acao.equals("VER")) { if(personagem.equals("PEDRO")) {
	 * 
	 * } else if(personagem.equals("MATHEUS")) {
	 * 
	 * switch (personagem) { case "PEDRO": do {
	 * System.out.println("Escolha o seu item"); escolha =
	 * input.next().toUpperCase();
	 * 
	 * switch (escolha) { case "ESPADA":
	 * System.out.println("Você escolheu um bom item de defesa vamos lá");
	 * retaFinal("FICAR", personagem); break; case "CANIVETE":
	 * System.out.println("Você escolheu um bom item de defesa vamos lá");
	 * retaFinal("FICAR", personagem); break; case "LANTERNA":
	 * System.out.println("Você escolheu um bom item de defesa vamos lá");
	 * retaFinal("FICAR", personagem); break; default:
	 * System.out.println("Ops, não temos esse item na lista"); break; } } while
	 * (escolha != "ESPADA" || escolha != "CANIVETE" || escolha != "LANTERNA");
	 * 
	 * } else if(personagem.equals("THIAGO")) {
	 * 
	 * } else if(personagem.equals("JONAS")) {
	 * 
	 * } } else {
	 * 
	 * } }
	 */
}
