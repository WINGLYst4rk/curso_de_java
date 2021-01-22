package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// diferentes fpormas de adiconar
		// o que muda entre add e offer e que quando a fila esta cheia o add retorna um
		// erro e o offer retorna false
		
		fila.add("Ana");// retorna uma exceção caso não consoga adicionar na fila
		fila.offer("Bia");// retorna true or false quando vai adicionar a fila true caso consiga e false caso não
		fila.add("Carlos");
		fila.offer("Jonas");
		fila.add("Julia");
		fila.offer("Daniel");

		// formas de mostrar os elementos da fila
		// o comportamento muda quando a fila esta vazia
		// nenhum vai remover o elemento da fila
		
		System.out.println(fila.peek());// retorna null caso a fila esteja vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());// retona uma exceção de fila vazia
		System.out.println(fila.element());

		// outros metodos
		// fila.clear();
		// fila.size();
		// fila.isEmpty();
		//fila.contains(...)

		// poll e um metodo que retorna o primeiro elemento da fila e ja o remove da fila
		// retorna null caso a fila esteja vazia
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());// retorna uma exceção de fila vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());// retorna null caso a fila estaja vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
