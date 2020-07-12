package libro.cap02.instancias;
import libro.cap02.misclases.FechaDetallada;
public class TestPersona 
{
	public static void main(String[] args)
	{
	
		Persona p1 = new Persona("Juan","29747338",new FechaDetallada(23,3,1903));
		Persona p2 = new Persona("Abriliana","38856191",new FechaDetallada(02,02,1995));

		System.out.println(p1);
		System.out.println(p1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p2);
		System.out.println(p1);
	}
	
	
	
	

}
