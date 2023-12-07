package atividade.java.controlflow;

import java.util.Scanner;

public class AtividadeIfElse2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            if (numero > 0) {
                System.out.println("O Número " + numero + " é par e positivo!");
            } else if (numero < 0) {
                System.out.println("O Número " + numero + " é par e negativo!");
            }
        } else {
            if (numero > 0) {
                System.out.println("O Número " + numero + " é ímpar e positivo!");
            } else if (numero < 0) {
                System.out.println("O Número " + numero + " é ímpar e negativo!");
            } 
        }
        
        scanner.close();

	}

}
