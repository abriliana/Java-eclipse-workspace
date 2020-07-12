package libro.cap01;

public class Cadenas2 {

	public static void main(String[] args) {
		
		String s = "Esto es una cadena de caracteres.";
		
		int pos1 = s.indexOf('c'); 
		int pos2 = s.lastIndexOf('c');
		int pos3 = s.indexOf('x');
		
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);

	}

}
