package array;

import java.util.ArrayList;

//1) Gere uma lista contendo os múltiplos de 3 entre 1 e 150.


public class Exercicio03 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		for (int i=1; i<=150; i++) {
			if (i % 3 == 0) {
				array.add(i);
			}
		}
		System.out.println(array);
	}

}
