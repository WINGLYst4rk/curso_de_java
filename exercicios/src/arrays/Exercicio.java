package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double notasAlunoA[] = new double[4];// criando um array unidimensional com 3 indicies

		// atribuindo valores ao array
		// arrays em java começam no indicie 0
		// array inicializado com os valores padrões
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 8.9;// atribuindo uma nota no indicie 0 do array
		notasAlunoA[1] = 7;
		notasAlunoA[2] = 9.8;
		notasAlunoA[3] = 10;

		String a = Arrays.toString(notasAlunoA);// ussando uma classe array do java
		System.out.println(a);

		double total = 0;

		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.printf("A media do aluno e: %.2f", total/notasAlunoA.length);
		
		double[] notasAlunoB = { 6.9, 8.9, 10, 7.8 };
		
		double media = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			media += notasAlunoB[i];
		}
		
		System.out.printf("\nA media do Aluno B e: %.2f", media / notasAlunoB.length);
	}

}
