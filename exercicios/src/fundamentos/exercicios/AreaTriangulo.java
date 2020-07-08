package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite a base do triangulo");
		double base = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A area do triangulo vai ser: %.2f", area);
		
		entrada.close();
	}

}
