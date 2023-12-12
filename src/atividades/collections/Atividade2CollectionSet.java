package atividades.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade2CollectionSet {

	public static void main(String[] args) {
		Set<Integer> numerosSet = new HashSet<>();
		Scanner scanner = new Scanner(System.in); 
		
		int[] numerosDisponiveis = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		for (int numero : numerosDisponiveis) {
            numerosSet.add(numero);
        }
		
		System.out.print("Digite o número desejado: ");
        int numeroProcurado = scanner.nextInt();
        
        if (numerosSet.contains(numeroProcurado)) {
            System.out.println("\nO número " + numeroProcurado + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numeroProcurado + " não foi encontrado!");
        }
        
        scanner.close();

	}

}
