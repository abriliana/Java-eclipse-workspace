package libro.cap01;

import java.util.Scanner;

public class DemoArray2 {

	public static void main(String[] args) {
		//defino e instancio(creo) el array
		String dias [] = {"Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo"};
		
		
		//recibo el dato y le doy una variable (v)
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un d�a de la semana(nro.):");
		int v = scanner.nextInt();
		
		// si el datp que ingres� es menor a la longitud del array, va a buscar el sub�ndice en el array
		if(v <= dias.length)
		{
			//le resto 1 al v porque el array SIEMPRE empieza de cero.
			System.out.println(dias [v-1]);
			
		}
		else
		{
			System.out.println("D�a incorrecto");	
		}

	}

}
