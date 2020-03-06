package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt (2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.length());
		
		String b = "Pedro";
		String sobrenome = "Santos";
		
		System.out.println("b:" + sobrenome + "\nsobrenome:");
		System.out.println("Frase qualquer".contains("ioi"));
		System.out.println("Frase qualquer".contains("qual"));
		
	}
}
