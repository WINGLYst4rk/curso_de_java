package oo.composicao.desafio.resposta;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//Lista para armazenar os itens e produtos das compras
	List<Item> itens = new ArrayList<>();
	
	//metodo para adicionar itens
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));// passadno o item e criando o produto para adicionar
	}
	
	//metodo para adicionar um item e criar um produto
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);// usasndo inferencia para criar um produto
		this.itens.add(new Item(produto, qtde));
	}
	
	//metodo para calcular o total de cada compra
	double obterValorTotal() {
		double total = 0;
		for(Item item : itens) {
			total += (item.quantidade * item.produto.preco);
		}
		return total;
	}
}
