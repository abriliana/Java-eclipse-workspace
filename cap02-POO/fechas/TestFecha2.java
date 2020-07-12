package libro.cap02.fechas;

import java.util.Scanner;

public class TestFecha2 {

	public static void main(String[] args) {
		//el usuario ingresa datos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese Fecha1: (dia, mes y anio): ");
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int anio = scanner.nextInt();
		//instancio new object con esos datos
		Fecha f1 = new Fecha(dia, mes, anio);
		
		System.out.print("Imgrese fecha2: (dia, mes, año): ");
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		anio = scanner.nextInt();
		Fecha f2 = new Fecha(dia, mes, anio);
		
		System.out.println("Fecha1: "+f1+"\nFecha2: "+f2);
		//comparo
		if(f1.equals(f2))
		{
			System.out.println("Son iguales.");
		}
		else
		{
			System.out.println("Son diferentes.");
		}
	}

}
