package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		//variaveis
		int numeroEntrada = 0;
		int soma = 0;
		
		//logica
		do {
			System.out.println("digite um numero para somar ou qualquer numero negativo para sair:");
			numeroEntrada = entrada.nextInt();
			soma += numeroEntrada;
			System.out.printf("A soma parcial e: %d\n", soma);
		} while(numeroEntrada > 0);
		
		System.out.printf("A soma total e: %d\n", soma);
		entrada.close();
		
	}
	
}
