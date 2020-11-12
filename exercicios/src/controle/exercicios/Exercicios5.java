package controle.exercicios;

import java.util.Scanner;

public class Exercicios5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// variaveis
		int numeroEntrada = 0;
		int contarDivisores = 0;

		// logica
		System.out.println("Digite um numero para saber se o mesmo e primo: ");
		numeroEntrada = entrada.nextInt();

		for (int i = 2; i < numeroEntrada; i++) {
			if (numeroEntrada % i == 0) {
				contarDivisores++;
			}
		}
		
		switch(contarDivisores) {
		case 0:
			System.out.printf("O numero %d e primo\n", numeroEntrada);
			break;
		default:
			System.out.printf("O numero %d nao e primo:\n", numeroEntrada);
		
		}

//		if (contarDivisores == 0) {
//			System.out.printf("O numero %d e primo:\n", numeroEntrada);
//		} else {
//			System.out.printf("O numero %d nao e primo:\n", numeroEntrada);
//		}

		entrada.close();

	}

}
