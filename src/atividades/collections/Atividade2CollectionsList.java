package atividades.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2CollectionsList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite 10 números inteiros: \n");
		
		for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
		
		System.out.print("\nDigite o número que você deseja saber a posição!");
        int numeroDesejado = scanner.nextInt();
		
        int posicao = numeros.indexOf(numeroDesejado);
        
        if (posicao != -1) {
            System.out.println("\nO número " + numeroDesejado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("\nO número " + numeroDesejado + " não foi encontrado!");
        }
        
        scanner.close();
	}

}
