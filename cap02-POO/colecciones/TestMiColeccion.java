package libro.cap02.colecciones;

import java.util.Scanner;

public class TestMiColeccion 
{
	public static void main (String []args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("INGRESE NOMBRE:");
		String nom = scanner.next();
		MiColeccion<String> mc = new MiColeccion<String>(5);
		while (!nom.contentEquals("---------FIN---------"))
			{
				//Insert siempre en la pos 0
				mc.insertar(nom, 0);
				//leo sig nombre
				nom = scanner.next();
			}
		String aux;
		//recorro la coleccion y tomo c u de sus elementos
		for (int i=0; i<mc.cantidad(); i++)
		{
			//el metodo obtener retorna un Object entonces tengo que castear a string
			aux = mc.obtener(i);
			
			System.out.println(aux+" -"+aux.length()+" caracteres");	
		}
		
	}
}
