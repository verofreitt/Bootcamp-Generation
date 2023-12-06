package atividade.java.operadores.variaveis;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite primeiro número: ");
        float n1 = scanner.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = scanner.nextFloat();
        System.out.print("Digite o terceiro número: ");
        float n3 = scanner.nextFloat();
        System.out.print("Digite o quarto número: ");
        float n4 = scanner.nextFloat();
        
        float diferenca = (n1 * n2) - (n3 * n4);
        
        System.out.println(String.format("Média final: %.1f", diferenca));
		
		
		scanner.close();

	}

}
