package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){//construtor explicito
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
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
