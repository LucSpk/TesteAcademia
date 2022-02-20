package questoes;

import java.util.Arrays;
import java.util.HashMap;

public class Questao03 {

	public static void main(String[] args) {
		getSubStrings("ifailuhkqq");
	}

	static void getSubStrings(String s) {

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {

				char[] partChar = s.substring(i, j + 1).toCharArray();

				Arrays.sort(partChar);
				
				String novaString = new String(partChar);

				if (map.containsKey(novaString))
					map.put(novaString, map.get(novaString) + 1);

				else
					map.put(novaString, 0);

			}
		}

		int contAnagrama = 0;

		for (String sk : map.keySet()) {
			int n = map.get(sk);
			contAnagrama += n;
		}

		System.out.println(contAnagrama);
	}
}
