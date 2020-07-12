package libro.cap02.fechas;

public class TestFecha {

	public static void main(String[] args) {
		//instancio objeto f
		Fecha f1 = new Fecha(02,02,1995);
		Fecha f2 = new Fecha("02/02/1995");

		
		System.out.println("Dia: "+f1.getDia());
		System.out.println("Mes: "+f1.getMes());
		System.out.println("Año: "+f1.getAnio());
		
		System.out.println("Dia: "+f2.getDia());
		System.out.println("Mes: "+f2.getMes());
		System.out.println("Año: "+f2.getAnio());
		if (f1.equals(f2))
		{
			System.out.println("Son iguales.");

		}
		
		
	}

}
