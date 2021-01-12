package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Wingly", 75.5);
		Comida c1 = new Comida("macarrao", 0.560);
		Comida c2 = new Comida("Arroz", 0.234);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}
	
}
