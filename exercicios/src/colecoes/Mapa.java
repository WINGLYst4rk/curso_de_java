package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();// o Map n�o possui o metodo add
		// o metodo pput poussui duas funcionalidades
		// tanto adiciona um item/objeto quato caso ja exista um com a mesma chave 
		//ele atualiza a informa��o da mesma
		usuarios.put(1, "Clarice");
		usuarios.put(1, "Clara");
		usuarios.put(1, "Carla");
		
		System.out.println(usuarios.size());// retorna 1 pois os estamos mudando a informa��o da chave
	}
	
}
