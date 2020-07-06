package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		//desafio propostopela coder cursos sobre operaodres aritmeticos
		int a = 6 * (3 + 2);// primeira equação
		int b = ((1 - 5) * (2 - 7));// segunda equação
		
		
		int exp1 = 2;// expoente ao qual a equação vai ser elevado
		int exp2 = 3;//outro expoente para outra equação
		
		
		int div1 = 2;// primeiro divisor 
		int div2 = 2 * 3;// segundo divisor
		int div3 = (int) Math.pow(10, exp2);// usando cast para converter double para int e declarando e nicializando o terceiro divisor
		
		
		int resultadoDivisao = b / div1;
		
		
		int resultadoExpo1 = (int) Math.pow(resultadoDivisao, exp1);
		int resultadoExpo2 = (int) Math.pow(a, exp1) / div2;
		
		int resultadoSubtracao = resultadoExpo2 - resultadoExpo1;
		
		
		int resultadoExpo3 = (int) Math.pow(resultadoSubtracao, exp2);
		int resultado = resultadoExpo3 / div3;
		
		System.out.println("O resultado da operação é: " + resultado);
		
	}

}
