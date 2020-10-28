package controle.exercicios;

import java.util.Scanner;

public class Exercicios3 {
	
	public static void main(String[] args) {

		/* 3. Criar um programa que receba duas notas parciais, calcular a media
		 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
		 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
		 * "Recuperacao", caso contrario imprime no console "Reprovado".
		 */
		
		/* Criar um programa que recebe 2 notas e calcula a media final do aluno
		 * Restriçoes:
		 * -caso a nota do aluno seja maior que 7 mostrar "Aprovado"
		 * -Caso a nota seja menor que 7 e maior que 4 mostar "Recuperação"
		 * -Caso a nota seja menor que 4 mostrar "Reprovado"
		 */
		Scanner entrada = new Scanner(System.in);

		//variaveis
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
				
		//logica
		System.out.println("Digite a primeira nota:");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7 && media <= 10) {
			System.out.println("Aluno Aprovado!");
		} else if(media >= 4 && media < 7) {
			System.out.println("Aluno em recuperação!");
		} else if(media < 4) {
			System.out.println("Aluno Reprovado");
		} else {
			System.out.println("Media nao cadastrada!");
		}
		entrada.close();
		
	}
	
}
