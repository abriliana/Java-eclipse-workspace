package libro.cap01;

import java.util.Scanner;

public class HolaMundoNombre {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre, edad y altura:");
		
		String nom = scanner.next();
		
		int edad = scanner.nextInt();
		
		double altura = scanner.nextDouble();
		
		System.out.println("Nombre: "+nom+" Edad: "+edad+" altura: "+altura);
		
		

	}

}
