package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;// Operador E (AND)!
		boolean comprouTV32 = trabalho1 ^ trabalho2;// Operador OU exclusivo (XOR)!
		boolean tomouSorvete = (trabalho1 || trabalho2);// Operador OU (OR)! 
		boolean maisSaudavel = !tomouSorvete;// Operador unário de negação (NOT)!
		
		System.out.println("comprou TV de 50\" ? " + comprouTV50);
		System.out.println("comprou TV de 32\" ? "  + comprouTV32);
		System.out.println("comprou sorvete? " + tomouSorvete);
		System.out.println("Mais saúdavel? " + maisSaudavel);
	}

}
