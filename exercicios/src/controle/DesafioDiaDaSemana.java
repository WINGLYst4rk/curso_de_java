package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String diaSemana = teclado.nextLine();
		
		// Usando a função "contains()"para checar a String
		if(diaSemana.contains("domingo") || diaSemana.contains("Domingo")) {
			System.out.println("o dia digitado é igual: " + 1);
		} else if(diaSemana.contains("segunda") || diaSemana.contains("Segunda")) {
			System.out.println("o dia digitado é igual: " + 2);
		} else if(diaSemana.contains("terça") || diaSemana.contains("Terça") || diaSemana.contains("terca") || diaSemana.contains("Terca")) {
			System.out.println("o dia digitado é igual: " + 3);
		}else if(diaSemana.contains("quarta") || diaSemana.contains("Quarta")) {
			System.out.println("o dia digitado é igual: " + 4);
		} else if(diaSemana.contains("quinta") || diaSemana.contains("Quinta")) {
			System.out.println("o dia digitado é igual: " + 5);
		} else if(diaSemana.contains("sexta") || diaSemana.contains("Sexta")) {
			System.out.println("o dia digitado é igual: " + 6);
		} else if(diaSemana.contains("sábado") || diaSemana.contains("Sábado") || diaSemana.contains("sabado") || diaSemana.contains("Sabado")) {
			System.out.println("o dia digitado é igual: " + 7);
		} else {
			System.out.println("Dia invalido!!");
		}
		
		// Podendo usar a função "equalsIgnoraCase()"
//		if("domigo".equalsIgnoreCase(diaSemana)) {
//			System.out.println(1);
//		} else if("segunda".equalsIgnoreCase(diaSemana)) {
//			System.out.println(2);
//		} else if("terça".equalsIgnoreCase(diaSemana) || "terca".equalsIgnoreCase(diaSemana)) {
//			System.out.println(3);
//		} else if("quarta".equalsIgnoreCase(diaSemana)) {
//			System.out.println(4);
//		} else if("quinta".equalsIgnoreCase(diaSemana)) {
//			System.out.println(5);
//		} else if("sexta".equalsIgnoreCase(diaSemana)) {
//			System.out.println(6);
//		} else if("sábado".equalsIgnoreCase(diaSemana) || "sabado".equalsIgnoreCase(diaSemana)) {
//			System.out.println(7);
//		} else {
//			System.out.println("Dia invalido!");
//		}
		
		System.out.println("Fim!!");
		
		teclado.close();
	}

}
