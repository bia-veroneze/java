package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//MANU

public class Exercicio02MENU {
	public static void main(String[] args) {
		Boolean rodando = true;
		
		Scanner scanner = new Scanner(System.in);
		ArrayList <String> lista = new ArrayList<>();
		

		
			while (rodando) {
				
				
				System.out.println(" Menuzin");
				System.out.println();
				System.out.println(" 1. Adicionar elemento");
				System.out.println(" 2. Remover elemento");
				System.out.println(" 3. Mostrar lista");
				System.out.println(" 4. Mostrar de tras pra frente");
				System.out.println(" 5. Sair");
				System.out.println();
				System.out.println("  > ");

				int entrada = scanner.nextInt();
				
				switch (entrada) {
				case 1:
					System.out.println("digite o elemento a ser add: ");
					scanner.nextLine();
					String nome = scanner.nextLine();
					
					lista.add(nome);
					
					break;
				case 2:
					System.out.println("digite o elemento a ser removido");
					scanner.nextLine();
					nome = scanner.nextLine();
					boolean removeu = lista.remove(nome);
					if (removeu) {
						System.out.println(removeu+ "  removido com sucesso.");
					}else {
						System.out.println(removeu+ "  não encontrado");
					}
				
					break;
				case 3:
					scanner.nextLine();

					System.out.println(lista);
					
					break;
				case 4:
					scanner.nextLine();

					Collections.reverse(lista);
					System.out.println(lista);
					Collections.reverse(lista);
					
					break;
				case 5:
					rodando = false;
					break;
				default:
					
//					System.out.println("ESSA OPCAO NAO EXISTE");
					System.out.println("digite uma opcao valida");
					
		scanner.close();			
					
					
				}
			}
	}
}
