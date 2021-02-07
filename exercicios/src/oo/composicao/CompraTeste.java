package oo.composicao;

public class CompraTeste {

	public static void main(String [] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Carlos Magno";
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));// aplicando relação bidirecional
		compra1.adicionarItem("Lapis", 12, 5.50);// sem necessidade de criar o o item ja que o metodo ja cria e adiciona na compra
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		//Demonstração da relação bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).
				compra.obterValorTotal();
		System.out.println("O total é R$" + total);
	}
	
}
