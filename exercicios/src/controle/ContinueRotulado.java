package controle;

public class ContinueRotulado {
	
	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) {// forma de nomear um laco de repeticao : no caso esse e externo
			for (int j = 0; j < 3; j++) {// esse e o interno : o label pode receber qualquer nome 
				
				if(i == 1) {
					continue externo; //indicando que o continue e no laco externo 
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println();
		}
	System.out.println("Fim!");
	}
}
