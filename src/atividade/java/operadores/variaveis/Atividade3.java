package atividade.java.operadores.variaveis;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o salário bruto: ");
        float salarioBruto = scanner.nextFloat();
        System.out.print("Digite o adicional noturno: ");
        float adicionalNoturno = scanner.nextFloat();
        System.out.print("Digite as horas extras: ");
        float horasExtras = scanner.nextFloat();
        System.out.print("Digite os descontos: ");
        float descontos = scanner.nextFloat();
        
        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
        
        System.out.println(String.format("Salário Líquido: %.2f", salarioLiquido));
		
		
		scanner.close();

	}

}
