package classe;

public class Usuario {

	String nome;
	String email;

	@Override// Usandoi a anotação para sobrescrever o java.lang
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {// deixando um pouco mais robusto para ter certeza que recebeu um objeto valido
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}// sem geração de hashcode por enquanto
}
