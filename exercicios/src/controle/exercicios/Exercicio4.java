package controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// variaveis
		int numeroEntrada = 0;
		int divisorPrimo = 1;
		int validarOp = 2;

		// logica
		System.out.println("Digite um numero para saber se é primo");
		numeroEntrada = entrada.nextInt();

		if ((numeroEntrada % numeroEntrada == 0 && numeroEntrada % divisorPrimo == 0)
				&& (numeroEntrada % validarOp != 0)) {

			System.out.printf("O numero %d e primo:\n", numeroEntrada);

		} else {

			System.out.printf("O numero %d nao e primo:\n", numeroEntrada);
		}

		entrada.close();

	}
}
