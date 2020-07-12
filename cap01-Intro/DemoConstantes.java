package libro.cap01;

import java.util.Scanner;

public class DemoConstantes {
	
	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un valor numérico:");
		int v = scanner.nextInt();
		
		String dia;
		switch(v)
		{
		case LUNES:
			dia = "lunes";
			break;
		case MARTES:
			dia = "martes";
			break;
		case MIERCOLES:
			dia = "miercoles";
			break;
		case JUEVES:
			dia = "jueves";
			break;
		case VIERNES:
			dia = "viernes";
			break;
		case SABADO:
			dia = "sábado";
			break;
		case DOMINGO:
			dia = "domingo";
			break;
		default:
			dia = "Ingresó un valor no válido. Debe ser entre el 1 y el 7.";	
		}
		System.out.println(dia);
	}

}
