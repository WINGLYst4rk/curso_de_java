package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data(12, 02, 2023);
		Data d2 = new Data();
		Data d3 = new Data();

		d2.dia = 25;
		d2.mes = 04;
		d2.ano = 3024;

		System.out.printf("A data digitada e: %s\n", d1.DataFormatada());

		System.out.printf("A data digitada e: %s\n", d2.DataFormatada());
		
		System.out.printf("A data digitada e: %s", d3.DataFormatada());

	}

}
