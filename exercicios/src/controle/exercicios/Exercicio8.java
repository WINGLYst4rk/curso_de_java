package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//variaveis
		String texto = "";
		char arr[];
		
		//logica
		System.out.println("Digite uma palavra");
		texto = entrada.nextLine();
		
		arr = texto.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

		entrada.close();
		
	}
	
}
