package libro.cap01;

import java.util.StringTokenizer;

public class Cadenas7 {

	public static void main(String[] args) {
		
		String s = "Juan|Marcos|Carlos|Matias";
		
		//separo los tokens por |
		StringTokenizer st = new StringTokenizer(s,"|");
		
		//recorro s separando tokens
		String tok;
		while (st.hasMoreTokens())
		{
			tok = st.nextToken();
			//imprimo cada token
			System.out.println(tok);
			
		}

	}

}
