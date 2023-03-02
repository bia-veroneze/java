package array;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio01 {
	public static void main(String[] args) {
		ArrayList <Integer> listaInteiros = new ArrayList<>();
		listaInteiros.add(1);
		listaInteiros.add(2);
		listaInteiros.add(3);
		listaInteiros.add(4);
		listaInteiros.add(5);
		System.out.println(listaInteiros);
		Collections.reverse(listaInteiros);
		System.out.println(listaInteiros);
		Collections.reverse(listaInteiros);
		System.out.println(listaInteiros);

		
	}

}
