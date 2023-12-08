package atividade.java.controlflow;
import java.util.Scanner;

public class AtividadeFor1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		int primeiroNumero = scanner.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		int segundoNumero = scanner.nextInt();
		int contador;
		
		System.out.println("O primeiro número deve ser menor do que o segundo número");
		
		for(contador = primeiroNumero; contador < segundoNumero; contador++) {
				if(contador % 3 == 0 && contador % 5 == 0){
			        System.out.println(contador+" é múltiplo de 3 e 5");
			}
		}
		System.out.println("o intervalo é inválido");
		
		scanner.close();
	}

}
