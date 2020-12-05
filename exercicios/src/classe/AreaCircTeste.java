package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		
		AreaCirc b = new AreaCirc(2);
		//b.pi = 2.13;
		
		System.out.println(a.area());
		
		System.out.println(b.area());
		
		System.out.printf("A area e %.2f", AreaCirc.Area(23));
	}
	
}
