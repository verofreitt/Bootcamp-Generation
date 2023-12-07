package atividade.java.controlflow;
import java.util.Scanner;

public class AtividadeIfElse1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número para A: ");
		int A = scanner.nextInt();
		System.out.println("Digite o número para B: ");
		int B = scanner.nextInt();
		System.out.println("Digite o número para C: ");
		int C = scanner.nextInt();
		
		int soma = A + B;
		
		if (soma > C) {
            System.out.println(A + " + " + B + " = " + soma + " > " + C);
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < C) {
            System.out.println(A + " + " + B + " = " + soma + " < " + C);
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println(A + " + " + B + " = " + soma + " = " + C);
            System.out.println("A Soma de A + B é Igual a C");
        }
		scanner.close();
	}

}
