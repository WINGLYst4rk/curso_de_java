package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// logica
		/*
		 * (ano % 4 = 0 || ano % 100 = 0) && ano % 400 = 0 ano bissexto
		 * 
		 * ano % 4 = 0 ano bissexto
		 * 
		 */
		Scanner entrada = new Scanner(System.in);

		String op = "";
		int anoRecebido = 0;

		do {
			System.out.println("Digite o ano que deseja saber se é bissexto:");
			anoRecebido = entrada.nextInt();
			if (anoRecebido > -1 && anoRecebido % 4 == 0) {
				System.out.printf("O ano %d é bissexto: \n", anoRecebido);
			} else if (anoRecebido > -1) {
				System.out.printf("O ano %d não é bissexto: ", anoRecebido);
			}
			System.out.println("deseja saber outro ano? ");
			op = entrada.next();
		} while(!op.equalsIgnoreCase("nao"));
		
		System.out.println("Programa encerrando!");
		entrada.close();

	}

}
