package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		// Formas de adiciona items/objetos na pilha
		livros.add("O Pequeno Príncipe");// retorna true or false
		livros.push("Don Quixote");// retorna uma exceção caso não consiga adicionar um item
		livros.push("O Hobbit");

		// outros metodos
		//livros.isEmpty()
		//livros.clear()
		//livros.size()
		//livros.contains()

		// mesma logica da fila
		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());// funciona da mesma forma que o remove
		System.out.println(livros.poll());

	}

}
