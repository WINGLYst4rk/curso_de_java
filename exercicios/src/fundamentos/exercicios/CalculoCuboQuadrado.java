package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoCuboQuadrado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		double numero = entrada.nextDouble();
		
		double aoQuadrado = Math.pow(numero, 2);
		double aoCubo = Math.pow(numero, 3);
		
		System.out.printf("O numero: %.2f ao quadrado é: %.2f e ao cubo é: %.2f:", numero, aoQuadrado, aoCubo);
		
		entrada.close();
	}

}
