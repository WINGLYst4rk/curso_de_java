package classe;

public class EqualsHashcodePratica {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Jonas Gomes";
		u1.email = "jonasgomes@javamail.com";
		Usuario u2 = new Usuario();
		u2.nome = "Jonas Gomes";
		u2.email = "jonasgomes@javamail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
	}

}
