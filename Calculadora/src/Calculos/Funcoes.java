package Calculos;

import java.util.Scanner;

public class Funcoes {
	
	
	public static float soma(float x , float y) {
		float num1 = x;
		float num2 = y;
		float soma = num1 + num2;
		return soma;
	}
	
	public static void main(String[] args) {
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		String num1 = en.next().replace(".", ",");
		System.out.println("Digite um outro número:");
		String num2 = en.next().replace(".", ",");
		
		float b = Float.parseFloat(num1);
		float a = Float.parseFloat(num2);
		
		soma(b, a);
		en.close();
		
	}

}
