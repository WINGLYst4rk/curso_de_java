package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	Compra compra;// declarando um atributo ligado a classe compra para ter acesso a relação bidirecional
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
}
