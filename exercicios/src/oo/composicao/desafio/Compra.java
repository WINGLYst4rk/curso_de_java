package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	// Metodo que adiciona um produto pronto
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}

	// Metodo que adiciona e cria um produto
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}

	// Metodo para somar todos os valores de uma compra
	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += (item.quantidade * item.produto.preco);
		}
		return total;
	}
}
