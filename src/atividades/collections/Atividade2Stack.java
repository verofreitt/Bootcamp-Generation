package atividades.collections;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2Stack {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("\n********************************************");
	        System.out.println("1 - Adicionar Livro na pilha");
	        System.out.println("2 - Listar todos os Livros");
	        System.out.println("3 - Retirar Livro da pilha");
	        System.out.println("0 - Sair");
	        System.out.println("********************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
            case 1:
                System.out.print("Digite o nome do livro: ");
                String nomeLivro = scanner.nextLine();
                pilhaLivros.push(nomeLivro);
                System.out.println("\nPilha: \n" + pilhaLivros);
                System.out.println("\nLivro adicionado!");
                break;
            case 2:
                System.out.println("\nLista de Livros na Pilha: \n" + pilhaLivros + "\n");
                break;
            case 3:
                if (pilhaLivros.isEmpty()) {
                    System.out.println("\nA Pilha está vazia!\n");
                } else {
                    String livroRetirado = pilhaLivros.pop();
                    System.out.println("\nPilha: \n" + pilhaLivros);
                    System.out.println("O Livro " + livroRetirado + " foi retirado da pilha!");
                }
                break;
            case 0:
                System.out.println("\nPrograma Finalizado!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
            
            
		}while(opcao != 0);

	}

}
