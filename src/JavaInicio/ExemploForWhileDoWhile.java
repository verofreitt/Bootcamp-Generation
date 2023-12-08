package JavaInicio;
import java.util.Scanner;

public class ExemploForWhileDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int resultado, opcao, num;
		
		System.out.println("Calculadora que só multiplica por 5");
		System.out.println("Digite um numero diferente de 0");
		opcao = scanner.nextInt();
		
		while(opcao != 0) {
			resultado = opcao * 5;
			System.out.println("o resultado da multiplicação é" + resultado);
			
			System.out.println("entre com outro numero ou digite 0 para sair");
			opcao = scanner.nextInt();
		}
		System.out.println("Obrigado por usar a calculadora futurista!");
scanner.close();
	}

}
