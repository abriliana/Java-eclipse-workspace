package libro.cap01;

import java.util.Scanner;

public class DemoMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Ingrese cantidad de filas: ");
		int n = scanner.nextInt();
		
		System.out.print("Ingrese cantidad de columnas: ");//va apilado en la fila
		int m = scanner.nextInt();
		
		//instancio (creo) la matriz
		int mat [][] = new int [n][m];
		
		int nro;
		for ( int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				//genero un nro random entre 0 y 1000
				nro = (int)(Math.random()*1000);
				
				//asigno el nro en la matriz
				mat[i][j] = nro;	
			}
		}
		//acá recorre toda la matriz
		for (int i=0; i < n; i++)
		{
			for(int j=0; j<m; j++)
			{
				//imprimo la celda de la matriz
				System.out.println(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
