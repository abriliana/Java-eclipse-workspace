package libro.cap01;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		
		// defino el array de n enteros

		int arr [] = new int [4];
		
		
		System.out.print("Ingrese un valor mayor que 0: ");
		Scanner scanner = new Scanner ( System.in);
		int v = scanner.nextInt();
		
		int i = 0;
		
		while (v != 0 && i <4)
		{
			//asigna v en arr[i] y luego incrementa el valor de i
			arr[i++] = v;
			
			//el input va dentro del blucle
			System.out.print("Ingrese un valor mayor que 0: ");
			v = scanner.nextInt();
		}
		
		//recorre el array mostrando el contenido
		for (int j=0 ; j<i; j++)
		{
			System.out.println(arr[j]);
		}
		
	}

}
