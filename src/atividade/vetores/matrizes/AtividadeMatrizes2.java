package atividade.vetores.matrizes;

public class AtividadeMatrizes2 {

	public static void main(String[] args) {
		double[][] notas = {{4.0, 5.0, 7.0, 3.0},{2.5, 6.5, 4.7, 8.0},{4.8, 5.4, 9.0, 7.8},{10.0, 8.5, 9.5, 8.0},
	            {9.0, 6.5, 7.6, 8.2},{5.0, 5.0, 5.0, 6.3},{7.0, 8.0, 9.0, 8.5},{5.5, 3.5, 2.5, 1.0},
	            {8.0, 9.0, 10.0, 9.5},{5.6, 5.8, 6.5, 7.0}};
		
		double[] medias = new double[10];
		
		for (int aluno = 0; aluno < 10; aluno++) {
            double soma = 0;
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                soma += notas[aluno][bimestre];
            }
            medias[aluno] = soma / 4;
        }
		
		System.out.println("\nMédias dos Alunos:");
        for (int aluno = 0; aluno < 10; aluno++) {
            System.out.println("Aluno " + (aluno + 1) + ": " + String.format("%.1f", medias[aluno]));
        }

	}

}
