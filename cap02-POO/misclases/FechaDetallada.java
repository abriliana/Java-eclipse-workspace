package libro.cap02.misclases;
import libro.cap02.fechas.Fecha;
public class FechaDetallada extends Fecha {

	public static String meses[]={	"Enero",
									"Febrero",
									"Marzo",
									"Abril",
									"Mayo",
									"Junio",
									"Julio",
									"Agosto",
									"Septiembre",
									"Octubre",
									"Noviembre",
									"Diciembre"};
	
	
	//tres constructores
	public FechaDetallada (int dia, int mes, int anio)
	{
		super (dia, mes, anio);
	}
	
	public FechaDetallada (String f)
	{
		super(f);
	}
	

	public FechaDetallada() {
		super ();	
	}

	//toString
	public String toString()
	{
		return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
		
	}
	
}
