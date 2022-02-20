package questoes;

import java.util.Scanner;

public class Questao01 {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		
		int qnt = 0;
		
		System.out.println("Digite o tamanho da escada: ");
		entrada = new Scanner(System.in);
		
		qnt = entrada.nextInt();
		
		for (int i = 0; i < qnt; i++) {
			for (int j = qnt; (j - 1) > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		entrada.close();
	}
}
