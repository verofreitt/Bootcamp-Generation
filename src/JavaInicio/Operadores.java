package JavaInicio;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, y, result;
		
		System.out.println("\nDigite um numero: ");
		x = scanner.nextInt();
		System.out.println("\nDigite um numero: ");
		y = scanner.nextInt();
		
		result = x % y;
		
	
		System.out.println("\nResto divisão: " + result);
		
		scanner.close();
	}

}
