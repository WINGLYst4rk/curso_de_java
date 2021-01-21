package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana paula");
		lista.add(u1);
		
		lista.add(new Usuario("Marcos"));
		lista.add(new Usuario("Jonas"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Day"));
		
		System.out.println(lista.get(3));// acessando um nome pelo indice

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}

}
