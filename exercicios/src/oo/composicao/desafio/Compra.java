package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;

public class Compra {

	
	List<Item> items = new ArrayList<>();
	
	void adicionarItem(Item item) {
		this.items.add(item);
	}
	
	float obterValorTotal() {
		return 0.0f;
	}
}

