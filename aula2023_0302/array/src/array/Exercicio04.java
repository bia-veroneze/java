package array;
//2) Faça um programa que imprima uma lista de trás para frente

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio04 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		for (int i=1; i<=150; i++) {
			if (i % 3 == 0) {
				array.add(i);
			}
		}
		Collections.reverse(array);
		System.out.println(array);
	}

}
