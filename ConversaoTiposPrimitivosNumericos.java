package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // convers�o implicita
		System.out.println(a);
		
		float b = (float) 1.123456788888;// convers�o explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // convers�o explicita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
		
	}
}
