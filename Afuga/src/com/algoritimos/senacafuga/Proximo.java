package com.algoritimos.senacafuga;
import java.util.Scanner;

public class Proximo {
	public static void proximo() {
		Scanner input = new Scanner(System.in); 
		String continuar;
		do {
			System.out.println("Digite \"Continue\" para ver a pr�xima tela");
			continuar = input.next().toUpperCase();

		} while (!continuar.equals("CONTINUE"));
	}
}
