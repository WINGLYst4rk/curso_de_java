package oo.composicao.desafio.resposta;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	//Lista para armazenar as compras do objeto cliente
	List<Compra> compras = new ArrayList<>();
	
	//metodo para calcular total de todas as compras
	double obterValorTotal() {
		double total = 0;
		for(Compra compra : compras) {
			total += (compra.obterValorTotal());
		}
		return total;
	}
}
