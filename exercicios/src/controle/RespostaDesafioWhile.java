package controle;

import java.util.Scanner;

public class RespostaDesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double notas = 0;
		double total = 0;
		
		//receberas notas
		while(notas != -1) {
			System.out.println("Digite a nota (ou -1 para sair): ");
			notas = entrada.nextDouble();
			if(notas >= 0 && notas <= 10) {
				total += notas;
				quantidadeDeNotas ++;
			}else if(notas != -1) {
				System.out.println("Nota invalida: ");
			}
		}
		
		//calcular media
		double media = total / quantidadeDeNotas;
		System.out.printf("A media e: %.1f", media); //modifiquei a resposta final para mostrar menos casas decimais
		
		entrada.close();
	}
}
