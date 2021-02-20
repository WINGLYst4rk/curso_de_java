package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Maria Gonçaves");// Criando um cliente

		// Criando dois produtos
		Produto caneta = new Produto("Caneta", 2.0);
		Produto impressora = new Produto("Impressora", 1000.0);

		// Criando uma compra e adicionando 2 itens
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("notebook", 1500.0), 2);
		compra1.adicionarItem(caneta, 2);
		compra1.adicionarItem("Lapis", 1, 20);

		// Criando outra compra
		Compra compra2 = new Compra();
		compra2.adicionarItem(impressora, 1);
		compra2.adicionarItem(new Produto("Caderno", 10.0), 10);

		// Adicionando as compras ao cliente
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);

		System.out.println(cliente1.obterValorTotal());
		System.out.println();
	}
}
