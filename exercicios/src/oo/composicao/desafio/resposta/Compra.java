package oo.composicao.desafio.resposta;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//Lista para armazenar os itens e produtos das compras
	List<Item> itens = new ArrayList<>();
	
	//metodo para adicionar itens
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));// passadno o item e ja criando o produto para adicionar
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
