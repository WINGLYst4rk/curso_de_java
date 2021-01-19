package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos tem na turma? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double[][] alunoArray = new double [qtdAlunos][qtdNotas];
		
		for (int i = 0; i < alunoArray.length; i++) {
			System.out.println("Digite a nota do %dº aluno:" + (i + 1));
			for (int n = 0; n < alunoArray.length; n++) {
				System.out.printf("Digite a %dº nota:", n + 1);
				alunoArray[i][n] = entrada.nextDouble();
			}
		}
		

		entrada.close();
	}

}
