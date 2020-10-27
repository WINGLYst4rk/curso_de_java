package controle;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
	for (int i = 0; i < 10; i++) {
		if(i % 2 == 1) continue;// if sem usar as chaves por ser de uma unica linha
		System.out.println(i);
	}
}

}
