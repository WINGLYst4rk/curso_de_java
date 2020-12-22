package classe;

public class DesafioPrimeiroTrauma {

	int a = 3; //não pode mexer aqui
	static int b = 12;
	public static void main(String[] args) {
		DesafioPrimeiroTrauma numero = new DesafioPrimeiroTrauma();// resolvi criando uma instancia e amarzenando em uma variavel
		//pode mexer aqui
		System.out.println(numero.a); //pode mexer aqui
		System.out.println(b); //pode mexer aqui
		//pode mexer aqui
	}
	
}
// atributos mesmo estando na mesma classe caso queira chamar em outro metodo devera criar uma instacia
//pois nesse exmplo o atributo e de classe foi necessario criar uma nova instancia para poder usar