package controle;

import java.util.Scanner;

public class WhileIndeterminado {
//	minha forma
//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		String op = "";
//		
//		while(op != "sair" ) {
//			System.out.println("Você diz:");
//			String texto = entrada.next().toLowerCase();
//			System.out.println(texto);
//			op = texto;
//		}
//		
//		entrada.close();
//	}
	//forma proposta pelo curso
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String op = "";
		
		while(!op.equalsIgnoreCase("sair")) {
			System.out.println("Você escreve:");
			op = entrada.next();
		}
		
		entrada.close();
	}
}
