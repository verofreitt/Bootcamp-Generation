package atividade.vetores.matrizes;

public class AtividadeVetor2 {

	public static void main(String[] args) {
		int[] vetorInteiros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("\nElementos nos índices ímpares:");
        for(int i = 1; i < 10; i += 2) {
            System.out.print(vetorInteiros[i] + " ");
        }
        
        System.out.println("\n\nElementos pares:");
        for (int i = 0; i < 10; i++) {
            if (vetorInteiros[i] % 2 == 0) {
                System.out.print(vetorInteiros[i] + " ");
            }
        }
        
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetorInteiros[i];
        }
        System.out.println("\n\nSoma: " + soma);


        double media = (double) soma / 10;
        System.out.println("Média: " + String.format("%.2f", media));
        
	}

}
