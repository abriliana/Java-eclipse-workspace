package libro.cap01;

import java.util.Scanner;

public class IfInLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un valor:");
		
		int v = scanner.nextInt();
		
		int resto = v % 2;
		
		String mssg = (resto == 0) ? "Es par" : "Es impar";
		
		System.out.println(v+" "+mssg);

	}

}
