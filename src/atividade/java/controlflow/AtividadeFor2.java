package atividade.java.controlflow;

import java.util.Scanner;

public class AtividadeFor2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pares = 0, impares = 0, contador;
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "º numero: ");
			int numero = scanner.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);
        scanner.close();

	}

}
