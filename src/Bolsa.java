import java.util.ArrayList;
import java.util.List;

public class Bolsa {

	public static void bolsa(String personagem, String adicionar, String obj) {

		List<String> bolsa = new ArrayList<String>();
		bolsa.add("\n Canivete");
		bolsa.add("\n Sinalizador");
		bolsa.add("\n Lanterna");
		bolsa.add("\n Kit Primeiros Socorros");

		if (adicionar.equals("VER") && personagem.equals("PEDRO")) {
			bolsa.add("\n Espada");
			System.out.println(bolsa);
		} else if (adicionar.equals("VER") && personagem.equals("THIAGO")) {
			bolsa.add("\n Livro");
			System.out.println(bolsa);
		} else if (adicionar.equals("VER") && personagem.equals("MATHEUS")) {
			bolsa.add("\n Arma de Fogo");
			System.out.println(bolsa);
		} else if (adicionar.equals("VER") && personagem.equals("JONAS")) {
			bolsa.add("\n Tranquilizante");
			System.out.println(bolsa);
		}
		
		if (adicionar.equals("ADICIONAR")) {
			bolsa.add(obj);
		}
	}
}
