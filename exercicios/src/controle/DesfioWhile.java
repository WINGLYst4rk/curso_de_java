package controle;

import java.util.Scanner;

public class DesfioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		Double notas = 0.0;
		int qtNotas = 0;
		Double media = 0.0;
		
		
		while(!texto.equalsIgnoreCase("sim")) {
			System.out.println("Digite uma nota:");
			notas = entrada.nextDouble();
			if(notas > 0.0 && notas < 10.0) {
				notas += notas;
				qtNotas ++;
			}else {
				System.out.println("Digite uma nota valida:");
				notas = entrada.nextDouble();				
			}
			System.out.println("Quer calcular a media agora?");
			texto = entrada.next();
			
		}

		entrada.close();
	}
}
