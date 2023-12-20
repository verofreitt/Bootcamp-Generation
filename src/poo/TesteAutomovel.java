package poo;

public class TesteAutomovel {

	public static void main(String[] args) {
		//instanciando um objeto da classe Automovel
		
				Automovel auto1 = new Automovel("Marina Pereira","Celta","NTO2022",2011);
				
				auto1.imprimirInfo();
				
				System.out.println("\n*****************Transferência de Automóvel***************");
				
				auto1.setNomeProprietario("Natália Olgado");
				
				auto1.imprimirInfo();
				
				auto1.setPlaca("NTO2T22");
				
				auto1.imprimirInfo();
	}

}
