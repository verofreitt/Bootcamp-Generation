package JavaInicio;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		float media[] = new float[4];
		String nomes[] = new String[4];
		float n1,n2,n3,mediaGeral,somaMedia=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<media.length;x++) { // x = x + 1
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			
			System.out.println("\nMédia alune "+(x+1)+" foi de: "+media[x]);
			
			somaMedia += media[x];//somaMedia = somaMedia + media[x]
			
		}
		
		mediaGeral = somaMedia/x;
		
		System.out.println("\nMédia geral foi de: "+mediaGeral);
		
		for(x=0;x<4;x++) {
			System.out.println("\nMédia alune "+(x+1)+" foi de: "+media[x]);
		}

		System.out.println("\nMédia do primeiro alune: "+media[0]);

	}

}
