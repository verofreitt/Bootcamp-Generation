package atividade.vetores.matrizes;

public class AtividadeMatrizes1 {

	public static void main(String[] args) {
		int numeroMatriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println("\nElementos da Diagonal Principal:");
		for(int i = 0; i < 3; i++) {
			System.out.print(numeroMatriz[i][i] + " ");
		}
		
		System.out.println("\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(numeroMatriz[i][2 - i] + " ");
        }
        
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += numeroMatriz[i][i];
        }
        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
        
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += numeroMatriz[i][2 - i];
        }
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

	}

}
