package atividade.java.controlflow;
import java.util.Scanner;

public class AtividadeIfElse4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha entre vertebrado ou invertebrado");
		String primeiraEscolha = scanner.nextLine();
		String vertebrado = "vertebrado";
		String invertebrado = "invertebrado";
		
		System.out.println("Escolha entre Ave ou mamifero");
		String segundaEscolha = scanner.nextLine();
		String ave = "Ave";
		String mamifero = "mamifero";
		String inseto = "inseto";
		String anelideo = "anelideo";
		
		System.out.println("Escolha entre carnivoro ou onívoro");
		String terceiraEscolha = scanner.nextLine();
		String carnivoro = "carnivoro";
		String onivoro = "onivoro";
		String hematofago = "hematofago";
		
		
		if(primeiraEscolha.equalsIgnoreCase(vertebrado)) {
			if(segundaEscolha.equalsIgnoreCase(ave)) {
				if(terceiraEscolha.equalsIgnoreCase(carnivoro)) {
					System.out.println("Águia");
				}else {
					System.out.println("Pomba");
				}
			}else if(segundaEscolha.equalsIgnoreCase(mamifero)){
				if(terceiraEscolha.equalsIgnoreCase(onivoro)) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
			}else {
				System.out.println("Dado inválido");
			}
		}
		
		if(primeiraEscolha.equalsIgnoreCase(invertebrado)) {
			if(segundaEscolha.equalsIgnoreCase(inseto)) {
				if(terceiraEscolha.equalsIgnoreCase(hematofago)) {
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
			}else if(segundaEscolha.equalsIgnoreCase(anelideo)){
				if(terceiraEscolha.equalsIgnoreCase(hematofago)) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Minhoca");
				}
			}else {
				System.out.println("Dado inválido");
			}
		}
		scanner.close();
	}

}
