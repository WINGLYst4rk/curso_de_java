package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, int quantidade, double preco) {// metodo para criar os itens e adicionar ao objeto compra atual
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {// classe responsavel por controlar a adição dos items na classe compra
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
