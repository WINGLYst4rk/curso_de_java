package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		/*
		 * 6. Jogo da adivinhaçao: Tentar adivinhar um numero entre 0 - 100. Armazene um
		 * numero aleatorio em uma variavel. O Jogador tem 10 tentativas para adivinhar
		 * o numero gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o numero inserido e maior ou menor do que
		 * o numero armazenado. *
		 */
		// imports
		Random rand = new Random();

		// variavel
		int numeroVariavel = rand.nextInt(101);
		int numeroDeTentativas = 10;
		int numeroEntrada = 0;

		// logica
		do {
			System.out.println("Digite um numero entre 0 e 100 para saber se acertou o numero secreto:");
			numeroEntrada = entrada.nextInt();
			if (numeroEntrada == numeroVariavel) {
				System.out.println("Parabens voce acertou o numero secreto!");
				System.out.printf("O numero secreto era %d\n", numeroVariavel);
			} else if (numeroDeTentativas > 0) {
				System.out.println("Voce nao acertou o numero secreto!");
				numeroDeTentativas--;
				System.out.printf("Voce ainda tem %d tentativas\n", numeroDeTentativas);
				if(numeroEntrada > numeroVariavel) {
					System.out.printf("O numero %d é maior que o numero secreto.\n", numeroEntrada);
				}else if(numeroEntrada < numeroVariavel) {
					System.out.printf("O numero %d é menor que o numero secreto.\n", numeroEntrada);
				}
			} else {
				System.out.println("Voce nao acertou o numero e não tem mais tentativas!");
			}
		} while (numeroDeTentativas != 0);

		entrada.close();

	}

}
