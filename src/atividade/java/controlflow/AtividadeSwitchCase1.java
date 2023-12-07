package atividade.java.controlflow;
import java.util.Scanner;

public class AtividadeSwitchCase1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5 - Refrigerante");
		System.out.println("6 - Suco de Laranja");
		int opcao = scanner.nextInt();
		System.out.print("Digite a quantidade que desejada: ");
		int quantidade = scanner.nextInt();
		String produto = "";
		double preco = 0.0;
		

		switch (opcao) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10.00;
			break;
		case 2:
			produto = "X-Salada";
			preco = 15.00;
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8.00;
			break;
		case 6:
			produto = "Suco de Laranja";
			preco = 13.00;
			break;
		default:
            System.out.println("Código inválido.");
            System.exit(0);
		}

		double valorTotal = quantidade * preco;
		System.out.println("Produto: " + produto);
		System.out.println("Valor Total: R$ " + valorTotal);
		
		scanner.close();
		
	}

}
