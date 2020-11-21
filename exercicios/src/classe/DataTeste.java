package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		Data d2 = new Data();

		d1.dia = 12;
		d1.mes = 02;
		d1.ano = 2023;

		d2.dia = 25;
		d2.mes = 04;
		d2.ano = 3024;

		System.out.printf("A data digitada e: %s\n", d1.DataFormatada());

		System.out.printf("A data digitada e: %s", d2.DataFormatada());

	}

}
