package classe;

//alteração para usar o this. e o this();
// nao é possivel a utilizacao do this. em metodos do tipo static pois o metodo estatico esta associado a classe
//nao e possivel tambem usar o this() em mais de um metodo da classe pois um ficaria chamando o outros
public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){ //usando o this para tanto resolver o conflito como para indicar que estou acessando uma variavel de instacia
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){
		//comentando para usar o this(); como uma funcao para declara tudo em uma unica linha
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); // nao e possivel fazer igual ao this. no caso o this() faz a esma coisa que chamar o costrutor
		// por isso se deve passar os dados e nao as variaveis da instancia
	}
	
	//e possivel usar em outros metodos da classe 
	//mais nao e necessario pois o metodo ja esta associado com uma instancia
	String DataFormatada(){
		String formatado = String.format(formato, dia, mes, ano); 
		return formatado;		
	}
	
	String formato = "%d/%d/%d";
}
