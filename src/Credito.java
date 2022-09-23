import java.util.Scanner;

public class Credito {
	private static Scanner input = new Scanner(System.in);
public static void credito(boolean conquista) {
		
		if (conquista == true) {
			System.out.println("Mas e o que aconteceu com Giovanni ?");
			System.out.println("Calma, calma isso � assunto para outro jogo...");
			System.out.println("Voc� ganhou!!!");
			System.out.println("CR�DITOS");
			System.out.println("Isabela Midori");
			System.out.println("Nathalia Aldinar");
			System.out.println("Nicolas Marques");
			System.out.println("P�mera Natali");
			System.out.println("Robson Vila�a");
			System.out.println("END!");
			System.exit(0);
		} 
		if (conquista == false){
			System.out.println("voc� perdeu o jogo! Mas n�o desista de se tornar um grande patrulheiro do mar, na pr�xima voc� conseguir�!");
			System.out.println("Digite \"EU CONSIGO\" para come�ar o jogo de novo");
			String recomeco = input.next().toUpperCase();
			if(recomeco.equals("EU CONSIGO")) {
				InicioJogo.inicioJogo();
			}
		}
		
	}
}
