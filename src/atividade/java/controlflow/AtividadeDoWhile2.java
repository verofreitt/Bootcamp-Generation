package atividade.java.controlflow;
import java.util.Scanner;

public class AtividadeDoWhile2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0, numero;
		float contador = 0f;
		
		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			if(numero == 0) {
				break;
			}
			if(numero % 3 == 0) {
				soma += numero;
				contador++;
			}
			
		}while(numero != 0);
		
		double media = (soma / contador);
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
	}

}
