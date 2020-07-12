package libro.cap01;

public class Cadenas6 {

	public static void main(String[] args) {
		
		//obtengo el miliseg actual
		long hi = System.currentTimeMillis();
		
		//instancio(creo) un StringBuffer inicialmente vacío
		StringBuffer sb = new StringBuffer();
		
		//concateno n caracteres
		int n = 100000;
		
		char c;
		for( int i = 0; i<n; i++)
		{
			//obtengo caracteres entre A y Z
			c = (char) ('A' + i%('Z'-'A'+1));
			
			//concateno el caracter en el StringBuffer
			sb.append(c);		
		}
		//Obtengo el miliseg actual
		long hf = System.currentTimeMillis(); 
		
		//muestro la cadena resultante
		System.out.println(sb.toString());
		
		//muestro la cant de milis insumidos
		System.out.println((hf-hi)+" Milisegundos");
		
		}

}
