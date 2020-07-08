package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		double resultado = peso / (altura * altura);
		
		System.out.printf("O IMC do Peso: %.2f e da Altura: %.2f é: %.2f", peso , altura, resultado);
		entrada.close();
	}

}
