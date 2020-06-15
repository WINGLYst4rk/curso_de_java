package fundamentos;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		System.out.println("La vamos nos");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nome:");
		String letra = sc.nextLine();
		System.out.println("seu nome é: "+letra);
		sc.close();
	}

}
