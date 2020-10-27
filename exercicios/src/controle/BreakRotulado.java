package controle;

public class BreakRotulado {
	
	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) {// forma de nomear um laco de repeticao : no caso esse e externo
			for (int j = 0; j < 3; j++) {// esse e o interno : o label pode receber qualquer nome 
				
				if(i == 1) {
					break externo; //indicando que o break e no laco externo 
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println();
		}
	System.out.println("Fim!");
	}
}
