package com.algoritimos.senacafuga;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Arquivo {
	
	public static void gerarArquivo() { 

		File file = new File("Afuga"); 
		file.mkdir(); 
		File arquivo = new File("Afuga/fases.txt"); 

		try { 
			arquivo.createNewFile(); 

		} catch (IOException e) { 
			e.printStackTrace(); 
		} 
	}
	
	public static void lerArquivo(String local) {
		Path path = Paths.get(local);
		System.out.println(path.toAbsolutePath());
		try {
			System.out.println(Files.readString(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//"C:\\Users\\robson.vlima3\\workspace\\Senac\\src\\Aula03"
	}
}