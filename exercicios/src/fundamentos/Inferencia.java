package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);// declaracao e inicializacao da variavel
		
		a = 12;
		System.out.println(a);
		
		//a = "..."
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // variável foi declarada
		d = 123.65;// variável foi inicializada
		System.out.println(d);// usada!
		
		/*
		 *
		 * nao e possivel decalrar a vairavel e inicializar em outra linha
		 * o java so faz a inferencia apartir da declaracao e inicializacao da variavel na mesma linha
		 * e possivel usar ela so declarando e o java vai descobrir quando for atribuido um valor a ela
		 
		var e;
		e = 123.76;
		*/
	}

}
