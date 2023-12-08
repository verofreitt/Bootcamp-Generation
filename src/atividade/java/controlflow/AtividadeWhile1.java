package atividade.java.controlflow;
import java.util.Scanner;
public class AtividadeWhile1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menores = 0, maiores = 0;
		
		System.out.println("Digite uma idade:");
		int idade = scanner.nextInt();
		
		
		while(idade >= 0) {
			if(idade < 21) {
				menores++;
			}else if (idade > 50) {
				maiores++;
			}
			System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menores);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores);
		
        scanner.close();
	}

}
