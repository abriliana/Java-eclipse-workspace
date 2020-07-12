package libro.cap02.fechas;

import java.util.Scanner;

public class TestFecha3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese fecha (dd/mm/aaa): ");
		//recordar que está ingresando una cadena de caracteres
		String sFecha = scanner.next();
		Fecha f = new Fecha (sFecha);
		System.out.println("La fecha es: "+ f);
		
		System.out.print("Ingrese dias a sumar: ");
		int diasSum = scanner.nextInt();
		//le sumo dias a la fecha
		f.addDias(diasSum);
		System.out.println("Sumando "+diasSum+" dias, queda: "+f);

	}

}
