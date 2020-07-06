package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro salario:");
		String salario1 = sc.nextLine().replace(",", ".");

		System.out.println("Digite o segundo salario:");
		String salario2 = sc.nextLine().replace(",", ".");

		System.out.println("Digite o terceiro salario:");
		String salario3 = sc.nextLine().replace(",", ".");// Usando replace para substituir a "," por "."

		double sl1 = Double.parseDouble(salario1);
		double sl2 = Double.parseDouble(salario2);
		double sl3 = Double.parseDouble(salario3);

		double mediaSalario = (sl1 + sl2 + sl3) / 3;
		System.out.printf("A média salarial é: %.2f.", mediaSalario);

		sc.close();

	}

}
