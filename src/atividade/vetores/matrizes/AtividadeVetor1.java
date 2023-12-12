package atividade.vetores.matrizes;

import java.util.Scanner;

public class AtividadeVetor1 {

	public static void main(String[] args) {
		int vetorInt[] = {2,5,1,3,4,9,7,8,10,6};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a posição desejada");
		
		int numero = scanner.nextInt();
		
		int posicao = -1;
		for (int contador = 0;contador < vetorInt.length; contador++) {
			if(vetorInt[contador] == numero) {
				posicao = contador;
			}
		}
		
		if (posicao != -1) {
            System.out.println("O número " + numero + " está localizado na posição: " + posicao);
        } else { 
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }
		scanner.close();
	}

}
