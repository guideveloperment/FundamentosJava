package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double FATOR = 5.0 / 9.0; //constante
		final double AJUSTE = 32; //constante
		
		double fahrenheit = 86;//variaveis
		double celsius = (fahrenheit - AJUSTE) * FATOR; //variaveis
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius +"° C.");
	}

}
