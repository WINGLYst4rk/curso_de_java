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

		System.out.printf("A data digitada e: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);

		System.out.printf("A data digitada e: %d/%d/%d", d2.dia, d2.mes, d2.ano);

	}

}
