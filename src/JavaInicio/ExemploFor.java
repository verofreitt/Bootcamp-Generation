package JavaInicio;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int contador;
		
		System.out.println(" As vagas são limitadas, INSCREVA-SE JÁ!");
		
		for(contador = 1; contador >4; contador++) {
			System.out.println("\nVocê foi o " + contador + "º! digite seu nome: ");
			nome = leia.nextLine();
			
		}
		
		System.out.println("Vagas esgotadas");

	}

}
