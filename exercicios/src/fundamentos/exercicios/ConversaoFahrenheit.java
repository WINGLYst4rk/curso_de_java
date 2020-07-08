package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double temperatura = entrada.nextDouble();
		
		// Lógica
		//(t°C * 9 / 5) + 32
		//(t°F - 32) * 5 / 9
		double resultado = (temperatura - 32) * 5 / 9;
		
		System.out.printf("A temperatura %.2f °F em Celsius é: %.2f", temperatura, resultado );
		entrada.close();
	}

}
