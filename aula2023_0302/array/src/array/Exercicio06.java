package array;

import java.util.ArrayList;
import java.util.Random;

// Faça um programa que imprima se em uma lista há mais elementos pares, ímpares ou possuem quantidade igual.
public class Exercicio06 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(20) + 1;
			
			array.add(number);
		}
		
		System.out.println("Lista: " + array);
		
		int pares = 0;
		int impares = 0;
				
		for (int i=0; i < array.size(); i++) {
			int number = array.get(i);
			
			if (number % 2== 0) {
				pares += 1;
			} else {
				impares += 1;
			}
		}
		System.out.println("impares: " + impares);
		System.out.println("pares: " + pares);
		
		if (impares < pares) {
			System.out.println("Existem mais impares na lista");
		} else if (impares > pares) {
			System.out.println("Existem mais pares na lista");
		}else {
			System.out.println("tem a mesma quantidade de impares e pares");
		}
	}
}
