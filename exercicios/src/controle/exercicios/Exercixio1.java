package controle.exercicios;

import java.util.Scanner;

public class Exercixio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// logica
		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um numero: ");
			int numero = entrada.nextInt();
			if (numero > 0 && numero < 10) {
				if (numero % 2 == 0) {
					System.out.printf(" O numero %d está entre 0 e 10 e é par \n", numero);
				} else {
					System.out.println("O numero digitado não esta entre 0 e 10 e não é par: ");
				}
			} else if (numero % 2 == 0) {
				System.out.println("O numero não esta entre 0 e 10, mas é par: ");
			} else {
				System.out.println("O numero digitado não esta entre 0 e 10 e não é par: ");
			}
		}
		entrada.close();

	}
}
