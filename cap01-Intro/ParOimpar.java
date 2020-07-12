package libro.cap01;

import java.util.Scanner;

public class ParOimpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un valor:");
		
		int v = scanner.nextInt();
		
		int resto = v % 2;
		if (resto == 0)
		{
			System.out.println(v+" Es par.");
		}
		else
		{
			System.out.println(v+" Es impar.");
		}

	}

}
