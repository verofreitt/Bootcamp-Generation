package JavaInicio;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resultado, opcao;	
		
		do {
			
			System.out.println("\n--Calculadora que só multiplica por 5-- ");
			System.out.println("\nDigite um numero: ");
			opcao = leia.nextInt();
			resultado = opcao * 5;
			System.out.println("\n\nO resultado da multiplicação é: " + resultado);
			System.out.println("\n Entre com outro numero ou digite 0 para sair: ");
			opcao = leia.nextInt();
			
			
		}while(opcao != 0);
		
		System.out.println("\n Obrigado por usar nossa Calculadora futuristica! ");
		
		

	}

}
