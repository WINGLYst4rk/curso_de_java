package oo.composicao.desafio.resposta;

public class Sistema {

	public static void main(String[] args) {
		 Cliente cliente = new Cliente("Maria Julia Moraes");
		 
		 Compra compra1 = new Compra();
		 compra1.adicionarItem("Caneta", 9.67, 120);
		 compra1.adicionarItem(new Produto("Notebook", 18890.25), 2);
		 
		 Compra compra2 = new Compra();
		 compra2.adicionarItem("caderno", 10.90, 20);
		 compra2.adicionarItem(new Produto("Impressora", 985.70), 1);
		 
		 cliente.compras.add(compra1);
		 cliente.compras.add(compra2);
		 
		 System.out.println(cliente.obterValorTotal());
	}
}
