package array;
//3) Faça um programa que imprima a quantidade de elementos pares de uma lista.

import java.util.ArrayList;

public class Exercicio05 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		for (int i=1; i<=150; i++) {
			if (i % 3 == 0) {
				array.add(i);
			}
		}
		System.out.println(array);
		
		int count = 0;
		
		for (int i = 0 ; i < array.size(); i++) {
			if (array.get(i) % 2 == 0) {
				count += 1;
			}
		}
		System.out.println("Contém " + count + " números pares na lista!");
	}

}
