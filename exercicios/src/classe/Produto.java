package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double precoInicial){//construtor explicito
		nome = nomeInicial;
		preco = precoInicial;
	
	}
	
	Produto(){// construtor explicito para cololar o inplicito novamente
		
	}
	
	double ProdutoComDesconto() {
		double precoDesconto = (preco * (1 - desconto));
		return precoDesconto;
	}
	
	double ProdutoComDesconto(double descontoDeGerente) {
		double descontoGerente = (preco *(1 - (desconto + descontoDeGerente)));
		return descontoGerente;
	}
}
