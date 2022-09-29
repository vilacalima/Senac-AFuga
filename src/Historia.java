import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class Historia {

	public static String historiaInicial() throws IOException {

		String historia;
		
		historia = "***A FUGA***\r\n" 
				+ "Ap�s vender carga roubada por engano Giovanni teve que fugir da cidade de santos.\r\n"
				+ "Ao entrar em um navio cargueiro onde trabalhavam seus amigos seguiu em dire��o ao Rio de Janeiro \r\n" 
				+ "Mas durante a viagem o inesperado aconteceu, o navio que Giovanni estava colidiu com outro de menor porte, causando um naufr�gio.\r\n"
				+ "E agora Giovanni?\r\n" 
				+ "Junte for�as, colete itens, entre nessa briga e sobreviva!\r\n"
				+ "Boa Sorte!\r\n";

		gerarArquivo(historia, "entrada");
		return historia;
	}
	
	private static void gerarArquivo(String valores, String suffix) throws IOException {
		
		Path bubbleSortDiretorio = Files.createDirectory(Paths.get("./selectionSortDiretorio-" + suffix + "-" + UUID.randomUUID()));
		Path bubbleSortArquivo = Files.createFile(bubbleSortDiretorio.resolve("selectionSortSort-" + suffix + ".txt"));
		Files.write(bubbleSortArquivo, (valores + "\r\n").getBytes(StandardCharsets.ISO_8859_1), StandardOpenOption.APPEND);
	}
}
