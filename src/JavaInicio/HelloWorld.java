package JavaInicio;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome: ");
        String nome = scanner.next();

        System.out.print("Qual sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Qual sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos e tem a altura " + altura + " de altura");

        scanner.close();
    }
}

