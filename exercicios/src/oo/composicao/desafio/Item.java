package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {

	Produto produto;
	int quantidade;
	List<Produto> produtos = new ArrayList<>();
	
	void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}
}
