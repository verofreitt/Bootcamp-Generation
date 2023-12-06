package atividade.java.operadores.variaveis;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
        float notaUm = scanner.nextFloat();
        System.out.print("Digite a nota 2: ");
        float notaDois = scanner.nextFloat();
        System.out.print("Digite a nota 3: ");
        float notaTres = scanner.nextFloat();
        System.out.print("Digite a nota 4: ");
        float notaQuatro = scanner.nextFloat();
        
        float mediaFinal = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        
        System.out.println(String.format("Média final: %.1f", mediaFinal));
		
		
		scanner.close();

	}

}
