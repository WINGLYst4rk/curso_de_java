package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		//c�digo base do Leonardo leit�o
		// agora vou adicionar minha vers�o
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = en.nextDouble();
		
		//criando variaveis para substituir dentro dos ifs
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		boolean criterioRecuperacao = media < 7.0 && media >= 4.5;
		boolean criterioAprovado = media < 10.0 && media >= 7.0;
		
		if(criterioAprovado) {
			System.out.println("Parab�ns!");
			System.out.println("Aprovado!");
		}
		
		if(criterioRecuperacao) {
			System.out.println("Recupera��o!");
			System.out.println("N�o desista!");
		}
		
		if(criterioReprovacao) {
			System.out.println("Reprovado!");
		}
		
		en.close();
	}
}
