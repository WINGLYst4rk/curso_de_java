package oo.composicao;

public class CompraTeste {

	public static void main(String [] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Carlos Magno";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Lapis", 12, 5.50));
		compra1.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}
	
}
