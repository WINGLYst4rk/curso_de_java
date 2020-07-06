package fundamentos;

public class ConversaoTiposPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 2; // conversão implicita
		System.out.println(a);

		float b = (float) 1.12345; // conversão explícita (cast)
		float f = 5.4321F; // conversào explicita com o "F"
		System.out.println(b);
		System.out.println(f);

		int c = 340;
		byte s = (byte) c;// conversão explícita (cast)
		System.out.println(s);

		double e = 1.999999;// o java não observa valor entõ ele vai trunkar o número
		int v = (int) e; // conversão explícita (CAST)
		System.out.println(v);

  
	}

}
