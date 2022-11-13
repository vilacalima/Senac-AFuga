package com.algoritimos.senacafuga;

public class Credito {
	
public static String credito(boolean conquista) {
		String resposta =  null;
		if (conquista == true) {
			resposta = "Mas e o que aconteceu com Giovanni ? \n\r"
					+ "Calma, calma isso � assunto para outro jogo... \n\r"
					+ "Voc� ganhou!!!! \n\r"
					+ "CR�DITOS \n\r"
					+ "Isabela Midori \n\r"
					+ "Nathalia Aldinar \n\r"
					+ "Nicolas Marques \n\r"
					+ "Robson Vila�a \n\r"
					+ "Fim de jogo \n\r"; 
		} 
		if (conquista == false){
			resposta = "Voc� perdeu o jogo! Mas n�o desista de se tornar um grande patrulheiro do mar, "
					+ "na pr�xima voc� conseguir�!";
		}
		return resposta;
	}
}
