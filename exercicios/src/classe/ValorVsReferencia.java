package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
		
		Data d1 = new Data(1, 12, 2028);
		Data d2 = d1; //atribuição por referencia (objeto)
		
		d1.dia = 12;
		d2.mes = 10;
		
		System.out.println(d1.DataFormatada());
		System.out.println(d2.DataFormatada());
		
		voltarDataPadrao(d1); //chamando o metodo e passando um objeto como parameto
		
		//anbos possuem o mesmo valor pois o objeto data foi passado como parametro assim passando a referencia e nao o valor
		System.out.println(d1.DataFormatada());
		System.out.println(d2.DataFormatada());
		
		int c = 3;
		alterarPrimitivo(c);// chamaando o metodo passando o valor de c
		System.out.println(c); //o resultado permanece o mesmo de antes da chamada pois foi criada uma copia de c ja que só foi passado o valor
	}
	
	static void voltarDataPadrao(Data d) { //metodo criado para demonstrar passagem de referencia como parametro
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) { //metodo criado para demontrar a passagen de valor como parametro
		a++;
	}
}
