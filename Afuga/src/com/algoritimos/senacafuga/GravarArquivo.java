package com.algoritimos.senacafuga;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class GravarArquivo {

	public static void main(String[] args) throws Exception {
		Path novoDiretorio = Files.createDirectory(Path.of("./novoDiretorio-" + UUID.randomUUID()));
		System.out.println("Novo diretório:" + novoDiretorio.toAbsolutePath());
		
		Path novoArquivo = Files.createFile(novoDiretorio.resolve("novoArquivo.txt"));
		System.out.println("Novo arquivo:" + novoArquivo.toAbsolutePath());
		
		Files.writeString(novoArquivo, "Valor gerado é " + UUID.randomUUID() + "\r\n",
		StandardCharsets.ISO_8859_1, StandardOpenOption.APPEND);
		
	}
	
	
}
