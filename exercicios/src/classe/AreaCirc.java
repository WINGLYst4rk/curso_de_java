package classe;

public class AreaCirc {

	double raio;
	final static double PI  = 3.14159265359;//criando um atributo associado a classe sendo static e constante com final
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		double calcArea = Math.pow(raio, 2) * PI;
		return calcArea;
	}
	
	static double Area(double raio) {
		double calc = Math.pow(raio, 2) * PI;
		return calc;
	}
}
