package libro.cap01;

public class Cadenas8 {

	public static void main(String[] args) {
		
		String s = "Juan|Marcos|Carlos|Matias";
		
		//instancio tokens y le digo que separe a s por |
		String[] tokens = s.split("[|]");
		
		//recorro  la longitud de tokens e imprimo c u
		for ( int i = 0; i<tokens.length; i++)
		{
			System.out.println(tokens[i]);
		}

	}
//este metodo es más practico que el StringTokenizer
}
