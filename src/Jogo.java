import java.util.Scanner;

public class Jogo {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		Inicio do Jogo
		/* InicioJogo.inicioJogo(); */

		String resposta, ver;
		System.out.println("Escolha a sua classe: ");
		String personagem = input.next().toUpperCase();
		
		resposta = Personagens.classe(personagem);
		System.out.println(resposta);
				
		ver = input.next().toUpperCase();
		Bolsa.bolsa(personagem, ver, null);
		
		  // Desafios
		  
			/*
			 * DesafioUm.desafioUm(personagem); DesafioDois.desafioDois(personagem);
			 * DesafioTres.desafioTres(personagem); DesafioQuatro.desafioQuatro(personagem);
			 */
		 

	}
}
