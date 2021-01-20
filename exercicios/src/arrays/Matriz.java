package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos tem na turma? ");
		int qtdAlunos = entrada.nextInt();

		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();

		double[][] alunosArray = new double[qtdAlunos][qtdNotas];
		
		double total = 0;

		for (int i = 0; i < alunosArray.length; i++) {
			for (int j = 0; j < alunosArray.length; j++) {

				System.out.printf("Digite a %dº nota do %dº aluno: ", j + 1, i + 1);
				alunosArray[i][j] = entrada.nextDouble();
				total += alunosArray [i] [j] ;
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		
		System.out.printf("A media da turma e: %.2f  ", media);

		entrada.close();
	}

}
