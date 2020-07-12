package libro.cap01;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un día de la semana(nro):");
		int v = scanner.nextInt();
		
		String dia;
		switch(v)
		{
			case 1:
				dia = "Lunes";
				break;
			case 2:
				dia = "Martes";
				break;
			case 3:
				dia = "Miércoles";
				break;
			case 4:
				dia = "Jueves";
				break;
			case 5:
				dia = "Viernes";
				break;
			case 6:
				dia = "Sábado";
			case 7:
				dia = "Viernes";
				break;
			default:
				dia = "Ingresó un dato incorrecto.";
		}
		System.out.println(dia);
		
		
		
		
	}

}
