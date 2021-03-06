package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		//ArrayList<Usuario> lista = new ArrayList<>();
		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana paula");
		lista.add(u1);
		
		lista.add(new Usuario("Marcos"));
		lista.add(new Usuario("Jonas"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Lia"));// uma ainda vai sobrar pois esta duplicada
		lista.add(new Usuario("Day"));
		
		System.out.println(lista.get(3));// acessando um nome pelo indice

		// Formas de remover algum item ou objeto da lista
		//lista.remove(1);// item
		//lista.remove(new Usuario("Lia"));// objeto
		System.out.println(">>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Lia")));
		
		System.out.println("Tem ? " + lista.contains(new Usuario("Jonas")));
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}

}
