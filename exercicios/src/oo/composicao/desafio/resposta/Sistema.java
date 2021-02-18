package oo.composicao.desafio.resposta;

public class Sistema {

	public static void main(String[] args) {
		 Cliente cliente = new Cliente("Maria Julia Moraes");
		 
		 Compra compra1 = new Compra();
		 compra1.adicionarItem("Caneta", 1, 120);
		 compra1.adicionarItem(new Produto("Notebook", 1000), 2);
		 
		 Compra compra2 = new Compra();
		 compra2.adicionarItem("caderno", 10, 20);
		 compra2.adicionarItem(new Produto("Impressora", 1000), 1);
		 
		 // Quando aprender sobre emcapsulamento vai entender melhor sobre por que pelo metodo da classe cliente e melhor
		 cliente.adicionarCompras(compra1);// metodo da classe cliente
		 cliente.compras.add(compra2);// metodo da classe compra
		 
		 System.out.println(cliente.obterValorTotal());
	}
}
