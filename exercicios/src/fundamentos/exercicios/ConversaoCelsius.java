package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoCelsius {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		
		System.out.print("Digite a temperatura em Celsius:");
		double temperatura1 = teclado.nextDouble();
		
		
		// Lógica
		//(t°C * 9 / 5) + 32
		//(t°F - 32) * 5 / 9
		double resultado = (temperatura1 * 9 / 5) + 32;
		System.out.printf("A temperatura: %.2f °C em Fahrenheit: %.2f ", temperatura1, resultado);
		
		teclado.close();
	}

}
