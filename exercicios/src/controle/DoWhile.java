package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//if(...) senteca; ou {}
		//while(...) senteca; ou {}
		//for(...; ...; ...) senteca; ou {}
		
		//do senteca; ou {} while(...);
				
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Diga as palavras Magicas..");
			System.out.println("Digite sair para encerrar!");
			texto = entrada.next();
			
		}while(!texto.equalsIgnoreCase("sair"));

		entrada.close();
	}
}
