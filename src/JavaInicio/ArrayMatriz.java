package JavaInicio;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		/*
		 Modelo do meu array do tipo matriz
		 
		 Linha X Coluna
		 
		 0,0 (5)	0,1 (6)
		 1,0 (7)	1,1 (8)
		 2,0 (9)	2,1 (10)
		 
		 */		
			int numeros[][] = new int[3][2];
			int contPares=0,somaImpar=0,linha,coluna;
			
			Scanner leia = new Scanner(System.in);
			
			for(linha=0;linha<3;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					System.out.println("\nEntre com um número na linha "+linha+" e coluna: "+coluna+" : ");
					numeros[linha][coluna] = leia.nextInt();
					
					if(numeros[linha][coluna] % 2 == 0) {
						contPares++;//contPares = contPares + 1
					}else {
						somaImpar += numeros[linha][coluna];
					}
				}
			}
			System.out.println("\nEu tenho: "+contPares+" números pares...");
			System.out.println("\nSomatório do números ímpares: "+somaImpar);

	}

}
