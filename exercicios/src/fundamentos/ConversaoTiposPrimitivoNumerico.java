package fundamentos;

public class ConversaoTiposPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 2; // convers�o implicita
		System.out.println(a);

		float b = (float) 1.12345; // convers�o expl�cita (cast)
		float f = 5.4321F; // convers�o explicita com o "F"
		System.out.println(b);
		System.out.println(f);

		int c = 340;
		byte s = (byte) c;// convers�o expl�cita (cast)
		System.out.println(s);

		double e = 1.999999;// o java n�o observa valor ent� ele vai trunkar o n�mero
		int v = (int) e; // convers�o expl�cita (CAST)
		System.out.println(v);

  
	}

}
