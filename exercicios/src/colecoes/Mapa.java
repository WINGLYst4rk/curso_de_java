package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();// o Map não possui o metodo add
		// o metodo pput poussui duas funcionalidades
		// tanto adiciona um item/objeto quato caso ja exista um com a mesma chave 
		//ele atualiza a informação da mesma
		usuarios.put(1, "Clarice");
		usuarios.put(2, "Clara");
		usuarios.put(3, "Carla");
		usuarios.put(4, "Roberto");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());// retorna se o Map esta vazio
		
		System.out.println(usuarios.keySet());// retorna todas as chaves sem ordenação
		System.out.println(usuarios.values());// retorna os valores de cada chave
	}
	
}
