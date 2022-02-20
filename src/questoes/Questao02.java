package questoes;

import java.util.Scanner;

public class Questao02 {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		boolean caracterMai = false;
		boolean caracterMin = false;
		boolean caracterNum = false;
		boolean caracterEsp = false;

		char[] caracterEspeciais = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };

		String senha = entrada.next();

		if (senha.length() >= 6) {

			for (int i = 0; i < senha.length(); i++) {
				int charCode = senha.codePointAt(i);
//				System.out.println(charCode);

				if (charCode >= 65 && charCode <= 90) {
					caracterMai = true;
				}

				if (charCode >= 97 && charCode <= 122) {
					caracterMin = true;
				}

				if (charCode >= 48 && charCode <= 57) {
					caracterNum = true;
				}

				for (int j = 0; j < caracterEspeciais.length; j++) {

					int charCodeEsp = caracterEspeciais[j];
					if (charCode == charCodeEsp) {
						caracterEsp = true;
					}
				}
			}

			if (caracterMai == false)
				System.out.println("A senha deve conter no mínimo 1 letra maiuscula!");

			if (caracterMin == false)
				System.out.println("A senha deve conter no mínimo 1 letra minuscula!");

			if (caracterNum == false)
				System.out.println("A senha deve conter no mínimo 1 número!");

			if (caracterEsp == false)
				System.out.println("A senha deve conter no mínimo 1 caracter especial!");

			if (caracterMai == true && caracterMin == true && caracterNum == true && caracterEsp == true)
				System.out.println("Senha Forte!");

		} else {

			int qnt = 6 - senha.length();
			System.out.println("Faltam " + qnt + " caracteres!");
		}

		entrada.close();

	}
}
