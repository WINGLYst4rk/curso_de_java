package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informa��o do funcionario
		
		//tipos n�mericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //usando "L" para informar o java que � um numero maior que o int
		
		//Tipos num�ricos reais
		float salario = 11_445.44F;//Usando "F" para informar que � maior que int e menor que double
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeFerias = false;// pode ser "false" ou "true"
		
		//Tipo caractere
		char status = 'A';// ativo
		
		//dia de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias?" + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
