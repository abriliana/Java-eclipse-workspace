package libro.cap01;

import java.util.Scanner;

public class DemoArray2 {

	public static void main(String[] args) {
		//defino e instancio(creo) el array
		String dias [] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		
		
		//recibo el dato y le doy una variable (v)
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un día de la semana(nro.):");
		int v = scanner.nextInt();
		
		// si el datp que ingresé es menor a la longitud del array, va a buscar el subíndice en el array
		if(v <= dias.length)
		{
			//le resto 1 al v porque el array SIEMPRE empieza de cero.
			System.out.println(dias [v-1]);
			
		}
		else
		{
			System.out.println("Día incorrecto");	
		}

	}

}
