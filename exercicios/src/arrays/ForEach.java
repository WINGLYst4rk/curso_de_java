package arrays;

public class ForEach {

	public static void main(String[] args) {
		
		//declarando e preechendo o array
		double[] notas = { 8.9, 6.8, 10, 7.4 };
		
		//formato do forEach no java
		for (double nota: notas) {
			System.out.print(nota + " ");
		}
		
	}
	
}
