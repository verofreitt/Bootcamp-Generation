package atividade.java.controlflow;
import java.util.Scanner;

public class AtividadeIfElse3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Nome do doador: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a Idade do doador: ");
		int idade = scanner.nextInt();
		System.out.println("Primeira doação de sangue?");
		boolean primeiraDoacao = scanner.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if(idade >= 60 && primeiraDoacao == true) {
				System.out.println(nome+" não está apto para doar sangue!");
			}else {
				System.out.println(nome+" está apta para doar sangue!");
			}
		}else {
			System.out.println(nome+" não está apto para doar sangue!");
		}
		
		scanner.close();

	}

}
