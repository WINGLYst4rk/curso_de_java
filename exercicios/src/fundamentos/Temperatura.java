package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final int TEMP_CONVERSAO = 32;
		final float TAXA_CONVERSAO = 5 / 9.0f;
		float TempFahrenheit = 145.56f;
//		float TempCelsius = 0.0f;
		float TempConvertida = (TempFahrenheit - TEMP_CONVERSAO) * (TAXA_CONVERSAO);
//		TempCelsius = TempConvertida;
		System.out.println("A temperatura " + TempFahrenheit + " �F para Celsius �: " + TempConvertida + " �C" );
		
	}
}
