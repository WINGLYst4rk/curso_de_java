package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		//código base do Leonardo leitão
		// agora vou adicionar minha versão
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = en.nextDouble();
		
		//criando variaveis para substituir dentro dos ifs
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		boolean criterioRecuperacao = media < 7.0 && media >= 4.5;
		boolean criterioAprovado = media < 10.0 && media >= 7.0;
		
		if(criterioAprovado) {
			System.out.println("Parabéns!");
			System.out.println("Aprovado!");
		}
		
		if(criterioRecuperacao) {
			System.out.println("Recuperação!");
			System.out.println("Não desista!");
		}
		
		if(criterioReprovacao) {
			System.out.println("Reprovado!");
		}
		
		en.close();
	}
}
