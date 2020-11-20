package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4200.76;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 2576;
		p2.desconto = 0.15;
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.printf("Pre�o com desconto %.2f\n", precoFinal1);
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.printf("Pre�o com desconto %.2f\n", precoFinal2);
		
		double media = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.printf("media do carrinho: %.2f", media);
		
	}
	
}
