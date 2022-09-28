import java.util.Scanner;

public class Jogo {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String resposta, ver, escolha;
//		Inicio do Jogo
		resposta = Historia.historiaInicial();
		System.out.println(resposta);
//		Descrição e escolha dos personagens		
		resposta = Personagens.descricao();
		System.out.println(resposta);

		
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
			/* Desafio Cinco */
		System.out.println("Parabéns você chegou na última fase...");
		System.out.println("Ohh não os outros tripulantes descobriram que você está prestes a sair do navio, escolha uma das opições e sobreviva:");
		System.out.println("Digite \"Correr\" para correr e deixar Giovanni para trás");
		System.out.println("Digite \"Ficar\" para ficar e lutar");
		escolha = input.next();
		
		resposta = DesafioQuatro.inicio(personagem, escolha);
		System.out.println(resposta);
	}
}
