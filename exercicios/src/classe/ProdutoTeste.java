package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4200.76);

		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 2576;
		
		
		
		Produto p3 = new Produto();
		p3.nome = "Nintendo";
		p3.preco = 2600;
		
		Produto.desconto = 0.25;
		
		double precoFinal1 = p1.ProdutoComDesconto();//metodo sem passagem de parametos
		double precoFinal3 = p1.ProdutoComDesconto(0.1);//metodo com retorno descontoDoGerente
		double precoFinal4 = p2.ProdutoComDesconto();
		double precoFinal2 = p2.ProdutoComDesconto(0.1);
		double precoFinal5 = p3.ProdutoComDesconto();
		
		//Produto p1
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.printf("Preço com desconto %.2f\n", precoFinal1);
		System.out.printf("Preço com desconto do grente %.2f\n", precoFinal3);
		//Produto p2
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.printf("Preço com desconto %.2f\n", precoFinal4);
		System.out.printf("Preço com desconto do grente %.2f\n", precoFinal2);
		//Produto p3
		System.out.println(p3.nome);
		System.out.println(p3.preco);
		System.out.printf("Preço com desconto %.2f\n", precoFinal5);
		
		double media = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.printf("media do carrinho: %.2f", media);
		
	}
	
}
