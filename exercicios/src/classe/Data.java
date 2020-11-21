package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String DataFormatada(){
		String formatado = String.format("%d/%d/%d", dia, mes, ano);
		return formatado;		
	}
	
}
