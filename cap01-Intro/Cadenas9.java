package libro.cap01;

import java.util.Scanner;

public class Cadenas9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in);
		
		System.out.print("Ingrese una cadena: ");
		String s1 = scanner.next();
		
		System.out.print("Ingrese otra cadena: ");
		String s2 = scanner.next();
		
		
		//con EQUALS se comparan los contenidos, en cambio con == se comparan las direcciones de memoria
		if(s1.equals(s2))
		{
			System.out.println("¡Son iguales!");
		}
		else
		{
			System.out.println("Son diferentes.");
		}
	
	
	
	
	}

}
