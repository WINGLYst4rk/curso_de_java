package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = en.nextDouble();
		
		if(media < 10.0 && media >= 7.0) {
			System.out.println("Parab�ns!");
			System.out.println("Aprovado!");
		}
		
		if(media < 7.0 && media >= 4.5) {
			System.out.println("Recupera��o!");
			System.out.println("N�o desista!");
		}
		
		if(media < 4.5 && media >= 0) {
			System.out.println("Reprovado!");
		}
		
		en.close();
	}
}
