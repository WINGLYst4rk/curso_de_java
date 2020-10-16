package controle;

public class SwitchSemBreack {
	
	public static void main(String[] args) {
		
		String faixa = "branca";
		
		switch(faixa.toLowerCase()) {// o uso do break permite que so seja executado um case
		case "preta":	
			System.out.println("Sei o Bassei-Dai...");
		case "marron":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		default:
			System.out.println("Não sei nada");
		}
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("sabe andar");
		case 0:
			System.out.println("sabe respirar");

		}
	}

}
