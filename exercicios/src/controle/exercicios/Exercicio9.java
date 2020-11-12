package controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// variivaives
		int maiorNumero = 0;
	

		// logica
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			int numeroEntrada = entrada.nextInt();
			if(numeroEntrada > maiorNumero) {
				maiorNumero = numeroEntrada;
			}
		}

		System.out.printf("O maior numero é %d: ", maiorNumero);
		entrada.close();

	}

}
