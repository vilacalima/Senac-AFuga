
public class Credito {
	
public static String credito(boolean conquista) {
		String resposta =  null;
		if (conquista == true) {
			resposta = "Mas e o que aconteceu com Giovanni ? \n\r"
					+ "Calma, calma isso ï¿½ assunto para outro jogo... \n\r"
					+ "Você ganhou!!!! \n\r"
					+ "CRÉDITOS \n\r"
					+ "Isabela Midori \n\r"
					+ "Nathalia Aldinar \n\r"
					+ "Nicolas Marques \n\r"
					+ "Robson Vilaça \n\r"
					+ "Fim de jogo \n\r"; 
		} 
		if (conquista == false){
			resposta = "Você perdeu o jogo! Mas não desista de se tornar um grande patrulheiro do mar, "
					+ "na próxima você conseguirá!";
		}
		return resposta;
	}
}
