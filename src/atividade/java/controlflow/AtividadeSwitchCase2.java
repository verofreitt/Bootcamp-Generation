package atividade.java.controlflow;
import java.util.Scanner;

public class AtividadeSwitchCase2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome do colaborador: ");
		String nomeColab = scanner.nextLine();
		
		System.out.println("Escolha o código de um colaborado");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		int codColab = scanner.nextInt();
		
		
		String cargoColab = "";
		float salarioColab;
		float reajuste = 0.0f;
		float novoSalario = 0.0f;
		
		switch (codColab) {
		case 1:
			cargoColab = "Gerente";
			System.out.println("Informe o salario do colaborador: ");
			salarioColab = scanner.nextFloat();
			reajuste = (float) (salarioColab*0.10);	
			novoSalario = salarioColab + reajuste;
			break;
		case 2:
			cargoColab = "Vendedor";
			System.out.println("Informe o salario do colaborador: ");
			salarioColab = scanner.nextFloat();
			reajuste = (float) (salarioColab*0.7);
			novoSalario = salarioColab + reajuste;
			break;
		case 3:
			cargoColab = "Supervisor";
			System.out.println("Informe o salario do colaborador: ");
			salarioColab = scanner.nextFloat();
			reajuste = (float) (salarioColab*0.9);
			novoSalario = salarioColab + reajuste;
			break;
		case 4:
			cargoColab = "Motoristae";
			System.out.println("Informe o salario do colaborador: ");
			salarioColab = scanner.nextFloat();
			reajuste = (float) (salarioColab*0.6);
			novoSalario = salarioColab + reajuste;
			break;
		case 5:
			cargoColab = "Estoquista";
			System.out.println("Informe o salario do colaborador: ");
			salarioColab = scanner.nextFloat();
			reajuste = (float) (salarioColab*0.5);
			novoSalario = salarioColab + reajuste;
			break;
		case 6:
			cargoColab = "Técnico de TI";
			System.out.println("Informe o salario do colaborador: ");
			salarioColab = scanner.nextFloat();
			reajuste = (float) (salarioColab*0.8);
			novoSalario = salarioColab + reajuste;
		default:
            System.out.println("Código inválido.");
		}
		
		System.out.println("Nome do colaborador: " +nomeColab);
		System.out.println("Cargo: "+cargoColab);
		System.out.println("Salário: R$ "+novoSalario);
		
		scanner.close();

	}

}
