package arrays;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Olá digite a quantidade de notas para calcular a media:");
		int quantidadeNotas = entrada.nextInt();

		double[] notas = new double[quantidadeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("digite a %dº nota ", i + 1);
			notas[i] = entrada.nextDouble();
		}

		double media = 0;

		for (double nota : notas) {
			media += nota;
		}

		System.out.printf("A media do alulo e: %.1f", media / quantidadeNotas);
		System.out.printf("\nForam digitadas %d notas!", quantidadeNotas);

		entrada.close();

	}

}
