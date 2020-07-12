package libro.cap02.figuras;

public abstract class FiguraGeometrica 
{	
	private String nombre;
	
	//declaro el metodo area como abstract
	public abstract double area();
	
	//nuevo metodo estatico para promedio
	public static double areaPromedio(FiguraGeometrica arr[])
	{
		int sum = 0;
		for (int i =0; i<arr.length; i++) 
		{
			sum += arr[i].area();
		}
		return sum/arr.length;
	}

	
	//agrego un constructor
	public FiguraGeometrica (String nom)
	{
		nombre = nom;
	}
	//ahora al toString le muestro el nombre
	public String toString()
	{
		return nombre+" (area = "+area()+")";
	}
	//setters and getter de nombre ya que es un atributo y no un metodo como are
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
