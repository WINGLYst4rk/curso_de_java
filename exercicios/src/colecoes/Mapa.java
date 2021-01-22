package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();// o Map não possui o metodo add
		// o metodo pput poussui duas funcionalidades
		// tanto adiciona um item/objeto quato caso ja exista um com a mesma chave
		// ele atualiza a informação da mesma
		usuarios.put(1, "Clarice");
		usuarios.put(2, "Clara");
		usuarios.put(3, "Carla");
		usuarios.put(4, "Roberto");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());// retorna se o Map esta vazio

		// formas de mostrar os dados
		System.out.println(usuarios.keySet());// retorna todas as chaves sem ordenação
		System.out.println(usuarios.values());// retorna os valores de cada chave
		System.out.println(usuarios.entrySet());// retorna tanto as chaves quato seus valores

		System.out.println(usuarios.containsKey(3));// retorna true or false caso tenha a chave passada no parameto
		System.out.println(usuarios.containsValue("Roberto"));// retorna true or false caso o valor exista no parameto

		System.out.println(usuarios.get(2));// retorna o valor a partir da chave passada
		System.out.println(usuarios.remove(4));// remove o objeto de acordo com a chave
		System.out.println(usuarios.remove(2, "Jonas"));// remove so caso a chave e o valor corespodem ao passado

		// formas de percorre as chaves, valores ou ambos
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		// forma de percorrer os valores
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		// forma de obter ambos
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + "=>");
			System.out.println(registro.getValue());
		}
	}

}
