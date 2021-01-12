package classe;

// esse aquivo tem erros que seram comentados para evitar problemas
public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";		
		System.out.println(s1.concat("!!!"));// tudo aconencerapois a variavel esta inicializada e tem um espaço alocado na memoria
		
		// criando uma condição
		//alterei para criar uma condição ternaria
		String s2 = Math.random() > 0.5 ? "opa" : null;
		if(s2 != null) {
			System.out.println(s2.concat("???"));// tra um erro em tempo de execução pois a variavel não aponta para nenhum lugar na memoria			
		}
		
//		String s3;
//		System.out.println(s3.concat("!?!?!?"));// tera um erro de compilação pois a variavel nao foi inicializada
//		
		//criando outra atribuiçao
		Data d1 = Math.random() > 0.5 ? new Data() : null;// "criando" um objeto sem espaço alocado na memoria || condição ternaria para ter uma "aleatoridade"
		if(d1 != null) {
			d1.mes = 05;// não é possível acessar atribtos de objetos com valo null	
			System.out.println(d1.DataFormatada());
		}
	}
	
}
