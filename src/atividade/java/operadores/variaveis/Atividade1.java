package atividade.java.operadores.variaveis;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o abono: ");
        double abono = scanner.nextDouble();
        
        double novoSalario = salario + abono;
        
        System.out.println(String.format("Novo Salário: %.2f", novoSalario));

		
		scanner.close();
	}

}
