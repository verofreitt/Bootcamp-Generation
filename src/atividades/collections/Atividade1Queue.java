package atividades.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1Queue {

	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("\n********************************************");
	        System.out.println("1 - Adicionar Cliente a fila");
	        System.out.println("2 - Listar todos os Clientes");
	        System.out.println("3 - Retirar cliente da fila");
	        System.out.println("0 - Sair");
	        System.out.println("********************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
            case 1:
                System.out.print("Digite o nome: ");
                String nomeCliente = scanner.nextLine();
                filaClientes.add(nomeCliente);
                System.out.println("\nFila: \n" + filaClientes);
                System.out.println("Cliente Adicionado!\n");
                break;
            case 2:
                System.out.println("\nLista de Clientes na Fila: \n" + filaClientes + "\n");
                break;
            case 3:
                if (filaClientes.isEmpty()) {
                    System.out.println("\nA Fila está vazia!\n");
                } else {
                    String clienteChamado = filaClientes.poll();
                    System.out.println("\nFila: \n" + filaClientes);
                    System.out.println("O Cliente " + clienteChamado + " foi Chamado!\n");
                }
                break;
            case 0:
                System.out.println("Programa Finalizado!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

    } while (opcao != 0);

    scanner.close();

	}

}
