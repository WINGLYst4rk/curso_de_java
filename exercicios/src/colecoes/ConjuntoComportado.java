package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// entendendo a diferença entre treeSet e HashSet

		// Set<String> listaAprovados = new HashSet<>(); //nao respeitam a ordem de
		// inserção
		SortedSet<String> listaAprovados = new TreeSet<>(); // respeita a ordem de inserção

		listaAprovados.add("Ana");
		listaAprovados.add("Joao");
		listaAprovados.add("Marcos");
		listaAprovados.add("Sr. Rodrigues");
		
		Set<Integer> nums = new TreeSet<>();
		
		nums.add(1);
		nums.add(3);
		nums.add(2);
		nums.add(4);

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		for(int n : nums) {
			System.out.println(n);
		}

	}

}
