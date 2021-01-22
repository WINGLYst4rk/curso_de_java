package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Marcos"));
		usuarios.add(new Usuario("Maria"));
		usuarios.add(new Usuario("Jonas"));
		usuarios.add(new Usuario("Tereza"));
		
		boolean resultado = usuarios.contains(new Usuario("Tereza"));
		System.out.println(resultado);
		
	}
	
}
