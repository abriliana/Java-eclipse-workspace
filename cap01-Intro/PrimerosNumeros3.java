package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un valor num�rico:");
		int n = scanner.nextInt();
		
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.println(i);
		}
	}

}
