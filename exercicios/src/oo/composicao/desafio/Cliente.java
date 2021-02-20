package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();

	// Construtor do cliente
	Cliente(String nome) {
		this.nome = nome;
	}

	// Metodo para adicionar uma compra sem expor a lista
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	// Metodo para Somar todos os totais das compras
	double obterValorTotal() {
		double total = 0;
		for (Compra compra : compras) {
			total += (compra.obterValorTotal());
		}
		return total;
	}
}
