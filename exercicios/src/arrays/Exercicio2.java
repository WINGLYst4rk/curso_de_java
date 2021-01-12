package arrays;

public class Exercicio2 {

	public static void main(String[] args) {

		double[] notasA = { 8.9, 6.8, 10, 8.8 };

		double mediaA = 0;
		for (double notaA : notasA) {
			mediaA += notaA;
		}
		
		System.out.printf("a media do aluno A e: %.2f", mediaA / notasA.length);
		
		double[] notasB = new double [4];
		notasB [0] = 10;
		notasB [1] = 8.4;
		notasB [2] = 7.4;
		notasB [3] = 7;
		
		double mediaB = 0;
		
		for (double notaB : notasB) {
			mediaB += notaB;
		}
		
		System.out.printf("\na media do aluno B e: %.2f", mediaB / notasB.length);
	}

}
