package collections.java;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueExemploCollection {

	public static void main(String[] args) {
int op;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			
			System.out.println("\n----------------------------------------------");
			System.out.println("\n\t\tMenu do Estoque");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque ?");
			System.out.println("\n(2) Deseja mostrar os produtos do estoque ?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque ?");
			System.out.println("\n(4) Deseja remover produtos do estoque ?");
			System.out.println("\n(0) Deseja sair do programa?");
			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o produto que entrará no lugar do "+verifica+" : ");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				System.out.println(estoque);
				break;
			case 4:
				ler.nextLine();
				System.out.println("\nDigite o nome do produto para remover do estoque: ");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
					
				}else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nMuito obrigado por utilizar do nosso programa de ESTOQUE...\nVolte sempre!!!");
				break;
				default:
					System.out.println("\nOpção inválida");
			}
			
		}while(op != 0);

	}

}
