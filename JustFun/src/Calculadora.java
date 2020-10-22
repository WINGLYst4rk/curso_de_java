import java.util.Scanner;

public class Calculadora {
	
	public int Soma(int x, int y) {
		int Soma = x + y;
		return Soma;
	}
	
	public static void main(String[] args) {
		Calculadora test = new Calculadora();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = entrada.nextInt();
		
		int resultado = test.Soma(num1, num2);
		System.out.println("O resultado é: " + resultado );
		entrada.close();
	}
	
}
