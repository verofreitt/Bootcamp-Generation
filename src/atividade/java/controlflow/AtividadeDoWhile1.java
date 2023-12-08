package atividade.java.controlflow;

import java.util.Scanner;

public class AtividadeDoWhile1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int positivosSoma = 0, numero;
		
		do {
			System.out.println("Digite um numero positivo ou negativo:");
			numero = scanner.nextInt();
			
			if(numero > 0) {
				positivosSoma += numero;
			}
		}while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " + positivosSoma);
		scanner.close();

	}

}
