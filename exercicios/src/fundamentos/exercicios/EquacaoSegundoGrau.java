package fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero A: ");
		double a = entrada.nextDouble();
				
		System.out.print("Digite o numero B: ");
		double b = entrada.nextDouble();
		
		System.out.print("Digite o numero C: ");
		double c = entrada.nextDouble();
		
		System.out.printf("A equação é : %.2f x² + %.2f x + %.2f: \n", a, b, c);
		
		// Lógica
		double delta = (b * b) - ( 4 * a * c);
		
		double x1 = -b + Math.sqrt(delta) / (2 * a);
		double x2 = -b - Math.sqrt(delta) / (2 * a);
		
		
		System.out.printf("O delta da equação %.2fx² + %.2fx + %.2f é: %.2f", a, b, c, delta);
		System.out.printf("\n O X¡ da equação %.2fx² + %.2fx + %.2f é: %.2f ", a, b, c, x1);
		System.out.printf("\n O X¡¡ da equação %.2fx² + %.2fx + %.2f é: %.2f ", a, b, c, x2);
		
		entrada.close();
		
	}

}
