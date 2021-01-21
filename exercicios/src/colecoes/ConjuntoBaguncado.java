package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
 
		HashSet conjunto = new HashSet();

		conjunto.add(1.2);// double -> Double 
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character

		System.out.println("Tamanho e: " + conjunto.size());

		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho e: " + conjunto.size());//mostrando o tamanho

		System.out.println(conjunto.remove("teste"));//removendo um item
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho e: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));// verificando se o conjunto contem esse caractere
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		
		Set nums = new HashSet();// outra forma de usar o HashSet atravez de uma interface
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//mostrando o conteudo dos conjuntos
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // uniao entre dois con juntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);

	}

}
